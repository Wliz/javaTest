package 剑指offer;

/** 
 * @ClassName: JumpFloor 
 * @Description: 关于本题，前提是n个台阶会有一次n阶的跳法。分析如下: <br>
 * 	<p>
 *		f(1) = 1 <br>
 *		f(2) = f(2-1) + f(2-2)         //f(2-2) 表示2阶一次跳2阶的次数。<br> 
 *		f(3) = f(3-1) + f(3-2) + f(3-3)  <br>
 *		... <br>
 *		f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(n-(n-1)) + f(n-n) <br> 
 *  	</p>
 *<p>
 *说明：  <br>
 *1）这里的f(n) 代表的是n个台阶有一次1,2,...n阶的 跳法数。<br> 
 *2）n = 1时，只有1种跳法，f(1) = 1 <br>
 *3) n = 2时，会有两个跳得方式，一次1阶或者2阶，这回归到了问题（1） ，f(2) = f(2-1) + f(2-2) <br> 
 *4) n = 3时，会有三种跳得方式，1阶、2阶、3阶， <br>
 *    那么就是第一次跳出1阶后面剩下：f(3-1);第一次跳出2阶，剩下f(3-2)；第一次3阶，那么剩下f(3-3)<br> 
 *    因此结论是f(3) = f(3-1)+f(3-2)+f(3-3) <br>
 *5) n = n时，会有n中跳的方式，1阶、2阶...n阶，得出结论：<br> 
 *    f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) => f(0) + f(1) + f(2) + f(3) + ... + f(n-1)<br> 
 *     <br>
 *6) 由以上已经是一种结论，但是为了简单，我们可以继续简化：<br> 
 *    f(n-1) = f(0) + f(1)+f(2)+f(3) + ... + f((n-1)-1) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2)<br> 
 *    f(n) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2) + f(n-1) = f(n-1) + f(n-1) <br>
 *</p>
 *<p>
 *    可以得出： <br>
 *    f(n) = 2*f(n-1)<br> 
 *     <br>
 *7) 得出最终结论,在n阶台阶，一次有1、2、...n阶的跳的方式时，总得跳法为：<br> 
 *              | 1       ,(n=0 )  <br>
 *f(n) =|1       ,(n=1 ) <br>
 *              | 2*f(n-1),(n>=2)<br>
 *</p>
 * @author: a9858
 * @date: 2016年8月22日 上午11:16:18  
 */
public class JumpFloorII {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++){
			System.out.println("the ways a frog can use is : " + jumpFloor(i));
		}

	}
	
	public static int jumpFloor(int target){
		if(target == 0){
			return 0;
		}
		if(target == 1){
			return 1;
		}else{
			return 2*jumpFloor(target - 1);
		}
		
	}

}
