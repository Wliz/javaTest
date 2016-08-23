package 剑指offer;

/** 
 * @ClassName: NumberOf1 
 * @Description: 剑指offer题目，整数二进制表示形式中1的个数
 * @author: a9858
 * @date: 2016年8月23日 下午4:08:54  
 */
public class NumberOf1 {

	public static void main(String[] args) {
		for(int i = -11; i < 10; i++){
			System.out.println("the number of 1 in "+ i +" is : " + NumberOf1(i));
		}
	}
	
	 /** 
	 * @Title: NumberOf1 
	 * @Description: 将整数先转换为字符串再转换为char数组，之后进行遍历查找
	 * @param n 1的个数
	 * @return: int
	 */
	public static  int NumberOf1(int n) {
		 int count = 0;//计数器
		 char[] resource = Integer.toBinaryString(n).toCharArray();
		 for(int i = 0; i < resource.length; i++){
			 if(resource[i] == '1') count ++;
		 }
		 
		 return count;
	 }

}
