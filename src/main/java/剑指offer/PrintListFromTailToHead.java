package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		
		ListNode listNode2 = new ListNode(2);
		listNode1.next = listNode2;
		
		ListNode listNode3 = new ListNode(3);
		listNode2.next = listNode3;
		
		ListNode listNode4 = new ListNode(4);
		listNode3.next = listNode4;

		ArrayList<Integer> list = printListFromTailToHead(listNode1);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Stack<ListNode> stack = new Stack<ListNode>();
        while(listNode.next != null){
        	stack.push(listNode);
        	listNode = listNode.next;
        }
        stack.push(listNode);
        
        while(!stack.empty()){
        	list.add(stack.pop().val);
        }
        
        return list;
    }

}
