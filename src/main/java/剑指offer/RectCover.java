package 剑指offer;

/** 
 * @ClassName: RectCover 矩形覆盖 
 * @Description: 归纳法归纳如下：
 * <p>
 * （1）当 n < 1时，显然不需要用2*1块覆盖，按照题目提示应该返回 0。 
 * （2）当 n = 1时，只存在一种情况。 
 * （3）当 n = 2时，存在两种情况。 
 * （4）当 n = 3时，明显感觉到如果没有章法，思维难度比之前提升挺多的。 
 * 		... 尝试归纳，本质上 n 覆盖方法种类都是对 n - 1 时的扩展。 <br>
 *		可以明确，n 时必定有 n-1时原来方式与2*1的方块结合。
 *		也就是说, f(n) = f(n-1) + ?(暂时无法判断)。 
 *（5）如果我们现在归纳 n = 4，应该是什么形式？ 
 *（5.1）保持原来n = 3时内容，并扩展一个 2*1 方块，形式分别为 “| | | |”、“= | |”、“| = |” 
 *（5.2）新增加的2*1 方块与临近的2*1方块组成 2*2结构，
 *		然后可以变形成 “=”。于是 n = 4在原来n = 3基础上增加了"| | ="、“= =”。 
 * 再自己看看这多出来的两种形式，是不是只比n = 2多了“=”。
 * 其实这就是关键点所在...
 * 因为，只要2*1或1*2有相同的两个时，就会组成2*2形式，于是就又可以变形了。 
 * 所以，自然而然可以得出规律： f(n) = f(n-1) + f(n-2)， (n > 2)。 
 * 
 * <p>
 * @author: a9858
 * @date: 2016年8月22日 上午11:50:43  
 */
public class RectCover {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++){
			System.out.println(RectCover(i));
		}

	}
	
	 public static int RectCover(int target) {
		 if(target <=0){
			 return 0;
		 }
		 if(target == 1){
			 return 1;
		 }if(target == 2){
			 return 2;
		 } else{
			 return RectCover(target - 1) + RectCover(target - 2);
		 }
	 }

}
