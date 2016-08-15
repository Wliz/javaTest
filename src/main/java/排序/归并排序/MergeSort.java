package 排序.归并排序;

/** 
 * @ClassName: MergeSort 
 * @Description: 归并排序 ，稳定的排序
 * @author: a9858
 * @date: 2016年8月14日 下午10:10:21  
 */
public class MergeSort {
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();
        long startTime = System.currentTimeMillis();
        
        sort(a, 0, a.length - 1);
        
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println("the time of work is : " + (endTime - startTime));
        
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
	}

	/** 
	 * @Title: sort 
	 * @Description: 将两个或两个以上的有序表，合并成一个新的有序表
	 * @param array	待排序数组
	 * @param left	数组开头
	 * @param right	数组结尾
	 * @return: void
	 */
	private static void sort(int[] array, int left, int right) {
		if(left < right){
			//找出中间索引
			int middle = (left + right)/2;
			
			//对左边数组进行递归
			sort(array, left, middle);
			
			//对右边数组进行递归
			sort(array, middle + 1, right);
			
			//合并
			merge(array, left, middle, right);
			
			//打印每次排序结果
			
			for(int i = 0; i <array.length; i++){
				System.out.print(array[i] + "\t");
			}
			System.out.println();
		}
	}

	/** 
	 * @Title: merge 
	 * @Description: 将两个数组进行合并，合并前两个数组有序，合并后的数组也有序
	 * @param array
	 * @param left
	 * @param middle
	 * @param right
	 * @return: void
	 */
	private static void merge(int[] array, int left, int middle, int right) {
		//临时数组
		int[] tempArray = new int[array.length];
		
		//右边数组的第一个元素索引
		int rightStart = middle + 1;
		
		//缓存左边数组的第一个元素索引
		//针对每个数组，并不都是从0开始，所以用left来表示每个数组的开始
		int leftStart = left;
		
		//记录临时数组的索引
		int tempIndex = left;
		
		while(left <= middle && rightStart <= right){
			//从两个数组中取出最小的放入临时数组
			if(array[left] <= array[rightStart]){
				tempArray[tempIndex++] = array[left++];
			}else{
				tempArray[tempIndex++] = array[rightStart++];
			}
		}
		
		//剩余部分依次放入临时数组（实际上，下面两个while只会执行一个，原因见上一个while循环条件）
		while(rightStart <= right){
			tempArray[tempIndex++] = array[rightStart++];
		}
		
		while(left <= middle){
			tempArray[tempIndex++] = array[left++];
		}
		
		//将临时数组中的内容拷贝回原数组中
		//（原left - right范围内的内容被复制回原数组）
		while(leftStart <= right){
			array[leftStart] = tempArray[leftStart++];
		}
		
	}
}
