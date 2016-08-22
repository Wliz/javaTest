package com.future.javaTest;

import java.util.Scanner;

/** 
 * @ClassName: TheHightest 
 * @Description: 华为笔试题，最高分是多少
 * 不能处理多次输入的问题
 * @author: a9858
 * @date: 2016年8月22日 上午10:54:02  
 */
public class TheHightest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.nextLine() != null){
			
			//对第一行数进行处理，得到总人数n，总操作数m
			String one = scanner.nextLine();
			int n = Integer.parseInt((one.split(" ")[0]));
			int m = Integer.parseInt((one.split(" ")[1]));
			int[] courses = new int[n];
			
			//对第二行数进行处理，得到每个人的分数
			String two = scanner.nextLine();
			String[] twoStr = two.split(" "); 
			for(int i = 0; i < n; i++){
				courses[i] = Integer.parseInt(twoStr[i]);
			}
			
			int[] results = new int[m];
			for(int i = 0; i < m; i++){//依次进行操作
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

	/** 
	 * @Title: doQuestion 
	 * @Description: 进行操作，如果第一个字符是Q，则返回最大数，否则对分数进行处理
	 * @param courses 分数数组，
	 * @param string 操作的第一个字符
	 * @param string2 操作的第二个字符
	 * @param string3 操作的第三个字符
	 * @return: int 最高的分数
	 */
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
