package 剑指offer;

/** 
 * @ClassName: VerifySquenceOfBST 
 * @Description: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。<br>
 * 				 如果是则输出Yes,否则输出No。<br>
 * 				 假设输入的数组的任意两个数字都互不相同。<br>
 * @author: a9858
 * @date: 2016年8月30日 下午4:49:11  
 */
public class VerifySquenceOfBST {

	public static void main(String[] args) {
		int[] sequence = {2,9,5,16,17,15,19,18,12};
		System.out.println(VerifySquenceOfBST(sequence));

	}
	
	
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length == 0){return false;}
		
        boolean flag = isABST(sequence, 0, sequence.length - 1);
		
		return flag;
		
    }
	
	/** 
	 * @Title: VerifySquenceOfBST 
	 * @Description: 判断该数组是否是某二叉排序树的后序遍历结果
	 * 				依据：
	 * 					　（1）若左子树不空，则左子树上所有结点的值均小于它的根结点的值；
						　（2）若右子树不空，则右子树上所有结点的值均大于它的根结点的值；
						　（3）左、右子树也分别为二叉排序树；
						　（4）没有键值相等的结点。
	 * 				思路：从头开始比较元素和最后一个元素的大小，
	 * 					　如果元素<code>sequence[i]</code>大于最后一个元素，
	 * 					  说明该元素<code>sequence[i]</code>位于根结点的右子树上，
	 * 					　再从该元素<code>sequence[i]</code>开始继续向后遍历，
	 * 					　如果发现有元素<code>sequence[j]</code>小于最后一个元素（也即是根结点），
	 * 					　则说明该数组不是某二叉排序树的后序遍历
	 * 					　否则将<code>sequence[i]</code>作为根结点和将<code>sequence[end-1]</code>作为根结点
	 * 					  继续遍历。
	 * 				
	 * @param sequence 要验证的数组
	 * @param start 要验证的数组的开始节点下标
	 * @param end 要验证的数组的结束节点下标
	 * @return: boolean
	 */
	public static boolean isABST(int [] sequence, int start, int end){
		if(end < start){return true;}//遍历控制条件，说明正确遍历结束
		
		int i;
		//找出第一个右子树上的元素
		//sequence[end]为根结点
		for(i = start; i < end; i++){
			if(sequence[i] > sequence[end]) break;//如果发现有大于根结点的元素，则说明该元素位于右子树上
		}
		
		for(int j = i; j < end; j++){
			if(sequence[j] < sequence[end]) return false;//如果发现有小于根结点的元素，则说明此数组并非所求
		}
		
		return isABST(sequence, start, i - 1) && isABST(sequence, i, end - 1);
		
	}

}
