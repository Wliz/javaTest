package com.future.javaTest.testJavaProcess;

/** 
 * @ClassName: Main 
 * @Description: 测试类，测试java继承时，构造器、静态代码块、非静态代码块的执行顺序。<br>
 * 结论：this is B's static block!<br>
		 this is A's static block!<br>
		 this is B' static not block!<br>
		 this is B's constructor!<br>
		 this is A' static not block!<br>
		 this is A's constructor!<br>
 * @author: a9858
 * @date: 2016年8月19日 下午4:57:49  
 */
public class Main {

	public static void main(String[] args) {
		A a = new A();
	}

}
