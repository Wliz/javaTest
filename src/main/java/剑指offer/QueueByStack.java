package 剑指offer;

import java.util.Stack;

/** 
 * @ClassName: QueueByStack 
 * @Description: 用栈来模拟队列，进行push和pop
 * @author: a9858
 * @date: 2016年8月20日 下午5:18:26  
 */
public class QueueByStack {

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args){
		QueueByStack queue = new QueueByStack();
		queue.push(1);
		queue.push(2);
		
		while(!queue.isEmpyt()){
			System.out.println(queue.pop());
		}
	}
	
	/** 
	 * @Title: isEmpyt 
	 * @Description: 判断队列是否是空，用储存栈stack1来判断
	 * @return: boolean
	 */
	public boolean isEmpyt(){
		return stack1.isEmpty();
	}
	
    /** 
     * @Title: push 
     * @Description: 压入队列 
     * @param node
     */
    public void push(int node) {
        stack1.push(node);
    }
    
    /** 
     * @Title: pop 
     * @Description: 出队列
     * @return: int
     */
    public int pop() {
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	
    	int result = stack2.pop();
    	
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return result;
    }
}
