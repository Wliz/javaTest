package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @ClassName: FindPath
 * @Description: 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *               路径定义为从树的根结点开始往下一直到<strong>叶结点</strong>所经过的结点形成一条路径。
 * @author: a9858
 * @date: 2016年8月30日 下午5:35:42
 */
public class FindPath {

	private static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 private static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TreeNode root = new TreeNode(1);
		// root.left = new TreeNode(2);
		// root.right = new TreeNode(3);
		//
		// root.left.left = new TreeNode(4);
		// root.left.left.left = new TreeNode(8);
		// root.left.left.right = new TreeNode(9);
		//
		// root.left.right = new TreeNode(5);
		// root.left.right.left = new TreeNode(10);
		// root.left.right.right = new TreeNode(11);
		//
		// root.right.left = new TreeNode(6);
		// root.right.left.left = new TreeNode(12);
		// root.right.left.right = new TreeNode(13);
		//
		// root.right.right = new TreeNode(7);
		// root.right.right.left = new TreeNode(14);
		// root.right.right.right = new TreeNode(15);

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(7);

		root.right = new TreeNode(12);

		FindPath(root, 15);

		System.out.println("the result is :");
		for (ArrayList<Integer> arrayList : result) {
			System.out.println(arrayList.toString());
		}

	}

	/**
	 * @Title: FindPath
	 * @Description: 打印出二叉树中结点值的和为输入整数的所有路径
	 * @param root
	 * @param target
	 * @return
	 * @return: ArrayList<ArrayList<Integer>>
	 */
	 public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target){
	 if(root == null){return result;}//递归结束判定
	
	 list.add(root.val);//从根结点开始，构建路径
	
	 target -= root.val;//依次减1
	
	 if(target == 0 && root.left == null && root.right == null){//注意：路径定义为根结点到叶子结点
		 result.add(new ArrayList<Integer>(list));//直接添加list也不行
	 }
	
	 FindPath(root.left, target);//遍历左子树
	 FindPath(root.right, target);//遍历右子树
	
	 list.remove(list.size() - 1);//依次删除结点，是为了能够回溯（就是回到根结点）
	
	 return result;
	 }
}
