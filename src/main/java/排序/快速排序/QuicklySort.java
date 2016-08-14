package 排序.快速排序;

public class QuicklySort {
	public static void main(String[] args) {
		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        long startTime = System.currentTimeMillis();

        quicklySort(a);
        
        System.out.println();
        long endTime = System.currentTimeMillis();
        System.out.println("the time of work is : " + (endTime - startTime));
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
	}
	
	public static void quicklySort(int[] array){
		if(array.length > 0){
			quicklySort(array, 0, array.length - 1);
		}
	}
	
	public static void quicklySort(int[] array, int low, int height){
		if(low < height){
			int key = partation(array, low, height);
			quicklySort(array, 0, key - 1);
			quicklySort(array, key + 1, height);
		}
	}

	private static int partation(int[] array, int low, int height) {
		int key = array[low];//基准元素
		while(low < height){
			while(low < height && array[height] >= key){
				height--;//从后面开始找，直到找到比key值小的为止
			}
			array[low] = array[height];//将该数放在key的左边
			while(low < height && array[low] <= key){
				low++;//从前面开始找，直到找到比key值大的为止
			}
			array[height] = array[low];//将该数放在key的右边
		}
		array[low] = key;//将该数填充到low位置，下次重新找key值
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + "\t");
		}
		
		System.out.println();
		return low;
	}
}
