package 网易2017;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/** 
 * @ClassName: GouzaoDuilie 
 * @Description: 网易2017内推编程题<br>
 * <title>构造队列</title>
 * 小明同学把1到n这n个数字按照一定的顺序放入了一个队列Q中。现在他对队列Q执行了如下程序：<br>
 *	while(!Q.empty())              //队列不空，执行循环<br>
 *	<br>
 *	{<br>
 *	<br>
 *	    int x=Q.front();            //取出当前队头的值x<br>
 *	<br>
 *	    Q.pop();                 //弹出当前队头<br>
 *	<br>
 *	    Q.push(x);               //把x放入队尾<br>
 *	<br>
 *	    x = Q.front();              //取出这时候队头的值<br>
 *	<br>
 *	    printf("%d\n",x);          //输出x<br>
 *	<br>
 *	    Q.pop();                 //弹出这时候的队头<br>
 *	<br>
 *	}<br>
 *	<br>
 *	做取出队头的值操作的时候，并不弹出当前队头。<br>
 *	小明同学发现，这段程序恰好按顺序输出了1,2,3,...,n。<br>
 *	现在小明想让你构造出原始的队列，你能做到吗？<br>
 * @author: a9858
 * @date: 2016年8月28日 下午1:36:00  
 */
public class GouzaoDuilie {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		List list = new ArrayList<Integer>();//结果集
		
		for(int i = 0; i < t; i ++){
			int n = scanner.nextInt();
			
			int[] src = new int[n];
			for(int j = 0; j < n; j++){//构建一个数组，值为1~n
				src[j] = j + 1;
			}
			
			Queue<Integer> queue = get(src);
			list.add(queue);
		}
		
		for(int i = 0; i < list.size(); i++){//打印出结果集
			Queue<Integer> queue = (Queue<Integer>) list.get(i);
			while(!queue.isEmpty()){
				if(queue.size() != 1){//控制最后一个结果后不加空格
					System.out.print(queue.remove() + " ");
				}else{
					System.out.println(queue.remove());
				}
			}
		}

	}
	
	/** 
	 * @Title: get 
	 * @Description: 网友启发，使用LinkedList来作为Queue的实现类
	 * @param src
	 * @return
	 * @return: Queue<Integer>
	 */
	private static Queue<Integer> get(int[] src){
		int size = src.length;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		for(int i = size - 1; i >= 0; i--){
			
			//进行和小明操作的逆序操作，来把1~n还原成原队列
			if(queue.peek() != null){
				int x = queue.removeLast();
				queue.addFirst(src[i]);
				queue.addFirst(x);
			}else{
				queue.add(src[i]);
			}
		}
		return queue;
		
	}

}
