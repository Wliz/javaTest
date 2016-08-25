package 剑指offer;

/** 
 * @ClassName: Mirror 
 * @Description: 操作给定的二叉树，将其变成源二叉树的镜像。
 *			8
 *  	   /  \
 *  	  6   10
 *  	 / \  / \
 *  	5  7 9 11
 *  
 *  	镜像二叉树
 *  
 *  	    8
 *  	   /  \
 *  	  10   6
 *  	 / \  / \
 *  	11 9 7  5
 *  
 * @author: a9858
 * @date: 2016年8月25日 下午9:29:00  
 */
public class Mirror {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(6);
		root.right = new TreeNode(10);
		
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(7);
		
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(11);
		
		Mirror(root);
		
		System.out.println("root.left.val : " + root.left.val);
		System.out.println("root.right.val : " + root.right.val);
		System.out.println("root.left.left.val : " + root.left.left.val);
		System.out.println("root.left.right.val : " + root.left.right.val);

	}
	
	/** 
	 * @Title: Mirror 
	 * @Description: 如果节点有左右孩子，则将左右孩子互换。缺的就用null填充
	 * 				当root为null的时候说明已经走到树的叶子节点，这时候就应该停止了
	 * @param root
	 * @return: void
	 */
	public static void Mirror(TreeNode root) {
		if(root != null){//判断条件，用于停止递归
			if(root.left == null){//左子树为空则用null代替
				root.left = root.right;
				root.right = null;
			}else if(root.right == null){//右子树为空则用null代替
				root.right = root.left;
				root.left = null;
			}else{//左右子树都不空时则互换
				TreeNode leftTemp = root.left;
				root.left = root.right;
				root.right = leftTemp;
			}
			
			//继续向下走
			Mirror(root.left);
			Mirror(root.right);
		}
    }

}
