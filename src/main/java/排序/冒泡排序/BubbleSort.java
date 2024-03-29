package 排序.冒泡排序;

/** 
 * @ClassName: BubbleSort 
 * @Description: 冒泡排序，稳定的排序
 * @author: a9858
 * @date: 2016年8月14日 下午8:37:27  
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
        System.out.println();
        long startTime = System.currentTimeMillis();
        
        //冒泡排序算法
        for(int i = 0; i < a.length; i++){
        	for(int j = 0; j < a.length - 1 - i; j++){
        		//这里-i主要是每遍历一次都把最大的i个数沉到最底下去了，没有必要再替换了
        		if(a[j] > a[j + 1]){
        			int temp = a[j];
        			a[j] = a[j + 1];
        			a[j + 1] = temp;
        		}
        	}
        }
        
        System.out.println();
        
        long endTime = System.currentTimeMillis();
        System.out.println("the time of work is : " + (endTime - startTime));
        
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }


	}
}
