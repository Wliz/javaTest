package 剑指offer;

import java.util.EmptyStackException;
import java.util.Stack;

/** 
 * @ClassName: TestStackWithMin 
 * @Description: 重构stack
 * @author: a9858
 * @date: 2016年8月29日 上午11:35:08  
 */
public class TestStackWithMin {

	class StackWithMin{
		Stack<Integer> myStack = new Stack<Integer>();
		Stack<Integer> minStack = new Stack<Integer>();
		
		/** 
		 * @Title: push 
		 * @Description: 压栈，同时处理最小值的问题，
		 * 				如果来的值比最小值小，则将来的值同时压入两个stack
		 * 				如果来的值比最小值大，则复制最小值栈中的最小值再次压入最小值栈
		 * 				这样要注意的事情是：出栈的时候一样要将两个stack同时出栈
		 * @param node
		 * @return: void
		 */
		public void push(int node) {
			if(myStack.isEmpty()){//如果stack为空，则直接压栈
				myStack.push(node);
				minStack.push(node);
			}else{//如果不为空，则需要先比较最小值
				if(node < minStack.peek()){
					minStack.push(node);
					myStack.push(node);
				}else{//如果大于最小值则将最小值栈的栈顶元素复制后再次压栈
					minStack.push(minStack.peek());
					myStack.push(node);
				}
			}
	    }
	    
	    /** 
	     * @Title: pop 
	     * @Description: 出栈，同时处理最小值问题
	     * 				由于在压栈的过程中，最小值栈同时也进行了压栈，所以同时也要对最小值栈进行出栈
	     * 				注意：处理空栈问题
	     * @return: void
	     */
	    public void pop(){
	    	if(myStack.isEmpty()){
	    		throw new EmptyStackException();
	    	}else{
	    		myStack.pop();
	    		minStack.pop();
	    	}
	    }
	    
	    /** 
	     * @Title: top 
	     * @Description: 查看栈顶元素
	     * @return: int
	     */
	    public int top() {
	    	if(myStack.isEmpty()){throw new EmptyStackException();}
			return myStack.peek();
	        
	    }
	    
	    /** 
	     * @Title: min 
	     * @Description: 新增方法，返回栈中最小值
	     * @return
	     * @return: int
	     */
	    public int min() {
	    	if(myStack.isEmpty()){throw new EmptyStackException();}
			return minStack.peek();
	        
	    }
	}
	
	public static void main(String[] args) throws Exception {
		//3,3,2,2,2,3,3,0

		TestStackWithMin test = new TestStackWithMin();
		StackWithMin stack = test.new StackWithMin();
        stack.push(3);       System.out.print(stack.min() + ",");
        stack.push(4);       System.out.print(stack.min() + ",");
        stack.push(2);       System.out.print(stack.min() + ",");
        stack.push(3);       System.out.print(stack.min() + ",");
        stack.pop();         System.out.print(stack.min() + ",");
        stack.pop();         System.out.print(stack.min() + ",");
        stack.pop();         System.out.print(stack.min() + ",");
        stack.push(0);		 System.out.print(stack.min() + ",");


	}

}
