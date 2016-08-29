package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/** 
 * @ClassName: PrintFromTopToBottom 
 * @Description:从上往下打印出二叉树的每个节点，同层节点从左至右打印。 
 * @author: a9858
 * @date: 2016年8月29日 下午4:11:20  
 */
public class PrintFromTopToBottom {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		ArrayList<Integer> list = PrintFromTopToBottom(root);
		for (Integer integer : list) {
			System.out.print(integer + "\t");
		}
	}

	/** 
	 * @Title: PrintFromTopToBottom 
	 * @Description: 利用队列的先进先出特性，
	 * 				 将树的左右节点加入到队列中，
	 * 				 然后再遍历队列，同时将节点的子树再添加入队列中，
	 * 				 这样就能达到以层序遍历树结构了
	 * @param root
	 * @return
	 * @return: ArrayList<Integer>
	 */
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(root == null){return result;}//题目中不让返回null，直接返回一个空的list
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        queue.offer(root);//先将根节点加入到队列中
        
        while(!queue.isEmpty()){
        	
        	TreeNode node = queue.poll();//将队列的头结点移除，表示已经遍历过该节点
        	
//        	System.out.println("正在访问：" + node.val);
        	if(node.left != null){
        		queue.offer(node.left);//将左子树加入队列
        	}
        	if(node.right != null){
        		queue.offer(node.right);//将右子树加入队列
        	}
        	
        	result.add(node.val);
        }
        
		return result;
    }
}
