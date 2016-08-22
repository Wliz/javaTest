package 剑指offer;

/** 
 * @ClassName: Fibonacci 
 * @Description: 剑指offer费波纳茨数
 * @author: a9858
 * @date: 2016年8月22日 上午10:41:34  
 */
public class Fibonacci {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			System.out.print(fibonacci(i) + "\t");
			
		}
	}
	
	 /** 
	 * @Title: fibonacci 
	 * @Description: 返回费波纳茨数的第<code>n</code>个数
	 * @param n 费波纳茨数的下标
	 * @return: int
	 */
	public static int fibonacci(int n) {
		 if(n <= 0){//从0开始
			 return 0;
		 }if(n == 1 || n == 2){
			 return 1;
		 }else{
			 int index = 3;
			 int current = 2;
			 int behand = 1;
			 while(index != n){
				 int temp = current + behand;
				 behand = current;
				 current = temp;
				 index++;
			 }
			 return current;
		 }
	 }
}
