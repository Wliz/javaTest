package com.future.javaTest;

public class Sort{
	public static void main(String[] args){
		int[] a = {1, 8, 5, 2, 4, 9, 7};
		for(int i = 1; i < a.length; i++){
			for(int j = i - 1; j >= 0; j--){
				if(a[j] > a[j + 1]){
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}

		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + "\t");
		}
	}
}
