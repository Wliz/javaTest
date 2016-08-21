package com.future.javaTest;

/** 
 * @ClassName: RotatedArray 
 * @Description: 旋转数组，找出最小数，这里并未将数组旋转，而是直接循环遍历出最小值
 * @author: a9858
 * @date: 2016年8月20日 下午8:53:55  
 */
public class RotatedArray {
	public static void main(String [] args){
		int[] array = {3,4,5,1,2};
		int min = minNumberInRotateArray(array);
		System.out.println(min);
	}
	
	/** 
	 * @Title: minNumberInRotateArray 
	 * @Description: 给出一个数组，将前面几个数放到最后面，返回最小数
	 * @param array
	 * @return: int
	 */
	public static  int minNumberInRotateArray(int [] array) {
	    if(array.length == 0){
	    	return 0;
	    }
	    if(array.length == 1){
	    	return array[0];
	    }
	    int min = array[0];
	    for(int i = 0; i < array.length; i++){
	    	if(min > array[i]){
	    		min = array[i];
	    	}
	    }
	    return min;
    }
}
