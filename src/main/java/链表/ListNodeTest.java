package 链表;

/** 
 * @ClassName: ListNodeTest 
 * @Description: 链表的头插法和尾插法
 * @author: a9858
 * @date: 2016年8月14日 下午8:34:56  
 */
public class ListNodeTest {
	public static ListNode head = null;
	public static ListNode tail = null;

	/**
	 * 头插法
	 * @param listNode
	 * @return
	 */
	public static ListNode insertHead(ListNode listNode){
		if(head == null){
			head = listNode;
		}else{
			listNode.next = head;
			head = listNode;
		}
		
		return head;
	}
	
	/**
	 * 尾插法
	 * @param listNode
	 * @return
	 */
	public static ListNode insertTail(ListNode listNode){
		
		if(head == null){
			head = listNode;
		}else{
			tail.next = listNode;
		}
		tail = listNode;
		
		return head;
	}
	
	
	
	public static void main(String[] args){
		ListNode node1 = new ListNode(1);
		insertTail(node1);
		ListNode node2 = new ListNode(2);
		insertTail(node2);
		ListNode node3 = new ListNode(3);
		insertTail(node3);
		ListNode node4 = new ListNode(4);
		insertTail(node4);
		ListNode node5 = new ListNode(5);
		insertTail(node5);
		ListNode node6 = new ListNode(6);
		insertTail(node6);
		
		ListNode node = head;
		while(node.next != null){
			System.out.println(node.val);
			node = node.next;
		}
		System.out.println(node.val);
	}
}
