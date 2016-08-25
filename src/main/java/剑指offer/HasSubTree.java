package 剑指offer;

/** 
 * @ClassName: HasSubTree 
 * @Description: 树的子结构
 * @author: a9858
 * @date: 2016年8月24日 下午9:36:53  
 */
public class HasSubTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(8);
		
		root.left = new TreeNode(8);
		root.left.left = new TreeNode(9);
		root.left.right = new TreeNode(2);
		
		root.right = new TreeNode(7);
		
		TreeNode test = new TreeNode(8);
		
		test.left = new TreeNode(9);
		test.right = new TreeNode(2);
		
		System.out.println(HasSubtree(root, test));

	}
	
	public static boolean HasSubtree(TreeNode root1, TreeNode root2){
		if(root2 == null){return false;}//重点，与下面不同，
		//下面的方法root2为空的时候返回true是建立在这里：root2为空返回false的基础上的
		if(root1 == null && root2 != null){return false;}//说明root1已经到达最后了，
		//说明root2不是root1的子结构
		
		boolean flag = false;
		
		flag = root1HasRoot2(root1, root2);
		
		if(!flag){//root1的根节点和root2的根节点不同的话，就比较root1的左节点和root2的根节点
			flag = HasSubtree(root1.left, root2);
		}
		if(!flag){//root1的右节点也和root2的根节点不同的话，就比较root1的右节点和root2的根节点
			flag = HasSubtree(root1.right, root2);
		}
		
		return flag;
	}
	
	private static boolean root1HasRoot2(TreeNode root1, TreeNode root2){
		if(root2 == null){return true;}//重点，返回true
		//如果在这里root2为空的话，说明已经比较到root2的最后一个子结构了，
		//这时候就说明，前面比较的都是相等的
		if(root1 == null && root2 != null){return false;}//说明root1已经到达最后了，
				//说明root2不是root1的子结构
		
		if(root1.val == root2.val){
			boolean flag = false;
			flag = root1HasRoot2(root1.left, root2.left);
			if(flag){
				flag = root1HasRoot2(root1.right, root2.right);
			}
			return flag;
		}
		
		return false;
	}
}


