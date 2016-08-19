package com.future.javaTest.testJavaProcess;

/** 
 * @ClassName: A 
 * @Description: 子类，测试java继承时，构造器、静态代码块、非静态代码块的执行顺序。
 * @author: a9858
 * @date: 2016年8月19日 下午4:55:06  
 */
public class A extends B{

	/** 
	 * @Title:A
	 * @Description:构造器  
	 */
	public A(){
		System.out.println("this is A's constructor!");
	}
	
	static{
		System.out.println("this is A's static block!");
	}
	
	{
		System.out.println("this is A' static not block!");
	}
	
}
