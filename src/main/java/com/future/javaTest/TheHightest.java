package com.future.javaTest;

import java.util.Scanner;

public class TheHightest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.nextLine() != null){
			
			String one = scanner.nextLine();
			int n = Integer.parseInt((one.split(" ")[0]));
			int m = Integer.parseInt((one.split(" ")[1]));
			int[] courses = new int[n];
			
			String two = scanner.nextLine();
			String[] twoStr = two.split(" "); 
			for(int i = 0; i < n; i++){
				courses[i] = Integer.parseInt(twoStr[i]);
			}
			
			int[] results = new int[m];
			for(int i = 0; i < m; i++){
				String temp = scanner.nextLine();
				String[] tempStr = temp.split(" ");
				results[i] = doQuestion(courses,tempStr[0], tempStr[1],tempStr[2]);
			}
			
			for(int i = 0; i < m; i++){
				if(results[i] != 0){
					System.out.println(results[i]);
				}
			}
		}
	}

	private static int doQuestion(int[] courses, String string, String string2, String string3) {
		int a = Integer.parseInt(string2);
		int b = Integer.parseInt(string3);
		int max = courses[a];
		
		if(string.equals("Q")){
			for(int i = a - 1; i < b; i++){
				if(courses[i] > max){
					max = courses[i];
				}
			}
			
		}else{
			courses[a - 1] = b;
			max = 0;
		}
			return max;
		
	}

}
