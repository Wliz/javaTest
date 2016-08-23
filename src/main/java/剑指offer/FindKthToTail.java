package 剑指offer;

import java.util.Stack;

/** 
 * @ClassName: FindKthToTail 
 * @Description: 输入一个链表，输出该链表中倒数第k个结点，注意细节，第二种方法甚妙
 * @author: a9858
 * @date: 2016年8月23日 下午5:18:31  
 */
public class FindKthToTail {

	public static void main(String[] args)throws NullPointerException {
		ListNode head = new ListNode(5);
		ListNode four = new ListNode(4); head.next = four;
		ListNode three = new ListNode(3);four.next = three;
		ListNode two = new ListNode(2); three.next = two;
		ListNode one = new ListNode(1); two.next = one;
		
//		while(head.next != null){
//			System.out.println(head.val);
//			head = head.next;
//		}
		
//		System.out.println(FindKthToTail(head,1).val);
		System.out.println(findtheNode(head,2).val);
	}
	
	/** 
	 * @Title: FindKthToTail 
	 * @Description: 利用stack的特性找到链表的倒数第k个数
	 * <strong>注意判断空和越界</strong>
	 * @param head 链表的根节点
	 * @param k 倒数第几
	 * @return: ListNode
	 */
	public static ListNode FindKthToTail(ListNode head,int k)throws NullPointerException  {
		if(head == null || k <= 0){return null;}//如果head为null或者k<= 0则直接返回null
		
		//构建一个stack，用于存储节点，然后根据出来的倒序，来找出倒数第k个节点
		Stack<ListNode> stack = new Stack<ListNode>();
		while(head.next != null){
			stack.push(head);
			head = head.next;
		}
		
		//把最后一个也放进栈中
		stack.push(head);
		
		int count = 1;
		ListNode temp = null;
		while( count <= k){//判断越界（k超过链表的长度）
			if(!stack.isEmpty()){//注意判断非空
				temp = stack.pop();
				count++;
			}else{
				return null;
			}
		}
		
		return temp;
    }
	
	/** 
	 * @Title: findtheNode 
	 * @Description: 两个变量来控制链表的查找，pre先向前移动k位，<br>
	 * 			   	 然后pre和last两个同时向后移动，直到pre到达末尾，<br>
	 *   			 这时候last就处在相对于末尾前面k的位置上<br>
	 * @param head
	 * @param k
	 * @return: ListNode
	 */
	public static ListNode findtheNode(ListNode head, int k){
		
		if(head == null || k <= 0){//处理不常规的数据
			return null;
		}
		
		ListNode pre = head;
		ListNode last = head;
		
		for(int i = 1; i < k;i++){//先向前到达第k个位置
			if(pre.next != null){
				pre = pre.next;
			}else{//说明k超过链表的长度
				return null;
			}
		}
		
		while(pre.next != null){//再同时向前，找到相对于末尾前第k个位置
			pre = pre.next;
			last = last.next;
		}
		
		
		return last;
	}

}
