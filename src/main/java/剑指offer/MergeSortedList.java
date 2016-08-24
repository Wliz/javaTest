package 剑指offer;

/** 
 * @ClassName: MergeSortedList 
 * @Description: 合并两个有序链表
 * @author: a9858
 * @date: 2016年8月24日 下午5:40:37  
 */
public class MergeSortedList {

	public static void main(String[] args) {
		//{1,3,5},{2,4,6}

		ListNode one = new ListNode(1);
		ListNode three = new ListNode(3);one.next = three;
		ListNode five = new ListNode(5);three.next = five;
		ListNode two = new ListNode(2);
		ListNode four = new ListNode(4);two.next = four;
		ListNode six = new ListNode(6);four.next = six;
		
		ListNode newList = merge2(one, two);
		while(newList != null){
			System.out.println(newList.val);
			newList = newList.next;
		}
	}
	
	 /** 
	 * @Title: Merge 
	 * @Description: 用递归的方式实现
	 * @param list1 有序链表1
	 * @param list2	有序链表2
	 * @return
	 * @return: ListNode
	 */
	public ListNode Merge(ListNode list1,ListNode list2) {
		 if(list1 == null){//如果list1为空直接返回list2
			 return list2;
		 }
		 if(list2 == null){//如果list2为空直接返回list1
			 return list1;
		 }
		 
		 ListNode newList = null;
		 if(list1.val < list2.val){
			 newList = list1;
			 newList.next = Merge(list1.next, list2);
		 }else{
			 newList = list2;
			 newList.next = Merge(list1, list2.next);
		 }
		 return newList;
		 
	 }
	
	/** 
	 * @Title: merge2 
	 * @Description: 不用递归的方法实现，注意控制链表的流动
	 * @param list1 有序链表1
	 * @param list2 有序链表2
	 * @return: ListNode
	 */
	public static ListNode merge2(ListNode list1, ListNode list2){
		if(list1 == null){//如果list1为空直接返回list2
			 return list2;
		 }
		 if(list2 == null){//如果list2为空直接返回list1
			 return list1;
		 }
		 
		 ListNode newList = null;
		 ListNode temp = null;
		 while(list1 != null && list2 != null){
            if(list1.val < list2.val){
            	if(newList == null){
            		newList = temp = list1;//最关键的一步，先将list1赋值给temp，再将temp赋值给newList。
            		//注意：第一次是newList的指针，指向第一个temp所指向的地址，
            		//之后temp指向改变，但newList指向不改变，所以返回newList
            		//用temp控制链表向前走，
            	}else{
            		temp.next = list1;//先给temp的next赋值，这样就能保证temp一直向前推进
            		temp = temp.next;
            	}
            	list1 = list1.next;
            }else{
            	if(newList == null){
            		newList = temp = list2;
            	}else{
            		temp.next = list2;
            		temp = temp.next;
            	}
                list2 = list2.next;
            }
        }
       
       if(list1 != null){
           temp.next = list1;
       }
       
       if(list2 != null){
           temp.next = list2;
       }
		 return newList;
	}

}
