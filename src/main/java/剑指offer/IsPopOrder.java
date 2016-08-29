package 剑指offer;

import java.util.Stack;

/** 
 * @ClassName: IsPopOrder 
 * @Description: 输入两个整数序列，第一个序列表示栈的压入顺序，<br>
 * 				 请判断第二个序列是否为该栈的弹出顺序。<br>
 * 				 假设压入栈的所有数字均不相等。<br>
 * 				 例如序列1,2,3,4,5是某栈的压入顺序，<br>
 * 				 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，<br>
 * 				 但4,3,5,1,2就不可能是该压栈序列的弹出序列。<br>
 * 				（注意：这两个序列的长度是相等的） <br>
 * @author: a9858
 * @date: 2016年8月29日 下午3:13:20  
 */
public class IsPopOrder {

	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
//		int[] popA = {4,5,3,2,1};//true
		int[] popA = {4,3,5,1,2};//false
		
		System.out.println(IsPopOrder(pushA, popA));

	}
	
	/** 
	 * @Title: IsPopOrder 
	 * @Description: 用一个辅助栈，
	 * 在遍历出栈序列的过程中，
	 * 判断出栈序列的当前位置是否是stack顶的元素，
	 * 如果是则将stack顶元素压出，出栈序列继续遍历，
	 * 如果不是则继续将push序列压入stack，进而判断是否到达push序列的最后，
	 * 	如果是则表明没有和出栈序列当前元素相等的元素，即，该出栈序列不是该序列的出栈序列
	 * @param pushA
	 * @param popA
	 * @return
	 * @return: boolean
	 */
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		
		if(pushA.length == 0 || popA.length == 0){return false;}
		
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0,j = 0;
		
		stack.push(pushA[i++]);//先放进去一个元素，便于后面比较。
		
		while(j < popA.length){//从0开始遍历popA
			while(popA[j] != stack.peek()){//如果popA[j]不等于stack顶元素，则继续向stack中压栈
				if(i == pushA.length){return false;}//如果已经压到pushA最后还没有相等的，
													//则说明popA不是pushA的出栈序列
				stack.push(pushA[i++]);
			}
			stack.pop();//相等则将stack顶的元素压出，模拟序列的弹出序列
			j++;//控制popA的移动
		}
		return true;
    }

}
