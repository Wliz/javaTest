package com.future.javaTest;

/** 
 * @ClassName: FloatAndDoubleTest 
 * @Description: 浮点数都是有精确度的，所以不能直接去和一个数比较相等或是不相等（!= 或 ==）<br>
 * <p>
 * 以下内容引用自林锐《高质量C/C++代码编写指南》<br>
	 *	4.3.3 浮点变量与零值比较<br>
	 *   ? 【规则4-3-3】不可将浮点变量用“==”或“！=”与任何数字比较。<br>
	 *	千万要留意，无论是float还是double类型的变量，都有精度限制。所以一定要避免将浮点变量用“==”或“！=”与数字比较，应该设法转化成“>=”或“<=”形式。<br>
	 *	假设浮点变量的名字为x，应当将 <br>
	 *	if (x == 0.0) // 隐含错误的比较<br>
	 *	转化为 <br>
	 *	if ((x>=-EPSINON) && (x<=EPSINON))<br>
	 *	其中EPSINON是允许的误差（即精度）。<br>
 *</p>
 * @author: a9858
 * @date: 2016年8月21日 上午9:11:15  
 */
public class FloatAndDoubleTest {
	public static void main(String[] args) {
		float a = 12.2f;//下面打印a的值显示的是12.1999998 
						//事实证明浮点数确实是有精确度的，不能直接比较相等或不相等
						//应以这个值是否在某个区间内来判断比较的结果
		float b = 0.2f;
		float c = 12.0f;
		System.out.print("a = ");
		System.out.printf("%.7f", a);
		
		System.out.println();
		System.out.print("b = ");
		System.out.printf("%.7f", b);
		
		System.out.println();
		System.out.print("c = ");
		System.out.printf("%.7f", c);
		
		System.out.println();
		System.out.println("a - c = " + (a - c));
		System.out.println("a - b = " + (a - b));
		if((a - c) == b){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
		//判断值是否在一个区间内
		if((a - c) < 0.2){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
