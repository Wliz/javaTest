package 剑指offer;

/** 
 * @ClassName: Pow 
 * @Description: 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。 
 * @author: a9858
 * @date: 2016年8月23日 下午4:29:00  
 */
public class Pow {

	public static void main(String[] args) {
		System.out.println(Power(2,3));
	}
	
	/** 
	 * @Title: Power 
	 * @Description: 直接调用了java.lang.Math里面的pow方法，返回一个base的exponent次方
	 * @param base 底数
	 * @param exponent 幂
	 * @return: double 返回值
	 */
	public static double Power(double base, int exponent) {
		return Math.pow(base, exponent);
	}

}
