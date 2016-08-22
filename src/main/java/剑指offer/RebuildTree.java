package 剑指offer;

import java.util.Arrays;

/** 
 * @ClassName: RebuildTree 
 * @Description: 重构二叉树，仿人家的
 * @author: a9858
 * @date: 2016年8月22日 上午11:02:48  
 */
public class RebuildTree {
	public static void main(String[] args) {
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		reConstructBinaryTree(pre, in);
	}
	
	 /** 
	 * @Title: reConstructBinaryTree 
	 * @Description: 递归得到一个完整的树
	 * @param pre 树的先序遍历
	 * @param in 树的终须遍历
	 * @return: TreeNode 树的root节点
	 */
	public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0){
			return null;
		}
		TreeNode root = new TreeNode(pre[0]);

		for(int i = 0; i < in.length; i++){
			if(pre[0] == in[i]){
				root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));
				root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
			}
		}
		return root;
    }
}
