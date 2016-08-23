package 剑指offer;

import java.util.Stack;

/** 
 * @ClassName: ReorderArray 
 * @Description: 重排数组，将奇数放在前面，偶数在后
 * @author: a9858
 * @date: 2016年8月23日 下午4:37:38  
 */
public class ReorderArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		reOrderArray(array);
		
		for (int i : array) {
			System.out.print(i + "\t");
		}

	}
	
	/** 
	 * @Title: reOrderArray 
	 * @Description: 利用stack的特性将奇数和偶数分开存放
	 * @param array
	 * @return: void
	 */
	public static void reOrderArray(int [] array) {
        Stack<Integer> stackOfOdd = new Stack<Integer>();
        Stack<Integer> stackOfEven = new Stack<Integer>();
        
        //先将奇数和偶数分开
        for(int temp : array){
        	if((temp % 2) == 0){//偶数
        		stackOfEven.push(temp);
        	}else{//奇数
        		stackOfOdd.push(temp);
        	}
        }
        
        Stack<Integer> stackOfOdd2 = new Stack<Integer>();
        Stack<Integer> stackOfEven2 = new Stack<Integer>();
        //处理整数的顺序
        while(!stackOfOdd.isEmpty()){
        	stackOfOdd2.push(stackOfOdd.pop());
        }
        while(!stackOfEven.isEmpty()){
        	stackOfEven2.push(stackOfEven.pop());
        }
        
        //循环将奇数放回数组，再放偶数
        for(int i = 0; i < array.length; i++){
        	if(!stackOfOdd2.isEmpty()){
        		array[i] = stackOfOdd2.pop();
        		continue;
        	}

        	if(!stackOfEven2.isEmpty()){
        		array[i] = stackOfEven2.pop();
        		continue;
        	}
        }
    }

}
