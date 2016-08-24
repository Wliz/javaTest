package 剑指offer;

/** 
 * @ClassName: ReverseList 
 * @Description: 反转列表
 * @author: a9858
 * @date: 2016年8月24日 下午5:17:24  
 */
public class ReverseList {

	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		ListNode four = new ListNode(4); head.next = four;
		ListNode three = new ListNode(3);four.next = three;
		ListNode two = new ListNode(2); three.next = two;
		ListNode one = new ListNode(1); two.next = one;
		
		System.out.println(reverseList(head).val);
	}
	
	/** 
	 * @Title: reverseList 
	 * @Description: 反转列表的实现方法，<br>
	 * <p>
		 * 思路:<br>
		 * 为了避免current.next被覆盖，所以事先把current.next存起来<br>
		 * 这时候就可以把current的pre赋给current.next<br>
		 * pre则可以继续向前，也就是将current赋给pre<br>
		 * current也随着pre向前推进，这时候事先存好的current.next就派上用场了<br>
		 * 最关键的临界条件就是：current.next == null；如果为空的话说明指针移动到了列表最后，<br>
		 * 这时候就不能再继续前进了，将current赋值为空，则跳出while循环。返回新的头节点<br>
	 *</p>
	 * @param head 旧的头节点
	 * @return: ListNode 返回新的头节点
	 */
	public static ListNode reverseList(ListNode head){
		if(head == null){
			return null;
		}
		ListNode pre = null;
		ListNode current = head;
		ListNode newHead = null;
		while(current != null){
			ListNode currentNext = current.next;
			if(currentNext == null){//说明到达列表末尾了，将current赋值为空，则跳出while循环
				newHead = current;
			}
			current.next = pre;
			pre = current;
			current = currentNext;
		}
		
		return newHead;
	}
}
