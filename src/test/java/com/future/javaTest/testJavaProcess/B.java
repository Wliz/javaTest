package com.future.javaTest.testJavaProcess;

/** 
 * @ClassName: B 
 * @Description: 父类，测试java继承时，构造器、静态代码块、非静态代码块的执行顺序。
 * @author: a9858
 * @date: 2016年8月19日 下午4:55:06  
 */
public class B {

	public B(){
		System.out.println("this is B's constructor!");
	}
	
	static{
		System.out.println("this is B's static block!");
	}
	
	{
		System.out.println("this is B' static not block!");
	}
	
}
