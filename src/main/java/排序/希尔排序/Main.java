package 排序.希尔排序;

public class Main {

	
	public static void main(String[] args) {
		int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
		System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
//        int d = a.length;
//        while(true){
//        	d /= 2;
//        	for(int x = 0; x < d; x++){
//        		for(int i = x + d; i < a.length; i += d){
//        			for(int j = i - d; j >= 0&& a[j] > a[j + d]; j -= d){
//        				int temp = a[j + 1];
//        				a[j + d] = a[j];
//        				a[j] = temp;
//        			}
//        		}
//        	}
//        	if(d == 1){
//        		break;
//        	}
//        }
        //====================
        for(int x = a.length/2; x > 0; x/=2){
        	for(int i = x; i < a.length; i++){
        		for(int j = i - x;j >= 0&&a[j] > a[j + x]; j-= x){
        			int temp = a[j];
        			a[j] = a[j + x];
        			a[j + x] = temp;
        		}
        	}
        }
//===========================================================
        
//        for (gap = n / 2; gap > 0; gap /= 2) {// 计算gap大小
//        	            for (i = gap; i < n; i++) {// 将数据进行分组
//        	                for (j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap) {// 对每组数据进行插入排序
//        	                    temp = array[j];
//        	                    array[j] = array[j + gap];
//        	                    array[j + gap] = temp;
//        	                }
//        	                // 打印每趟排序结果
//        	                for (int m = 0; m <= array.length - 1; m++) {
//        	                    System.out.print(array[m] + "\t");
//        	                }
//        	                System.out.println();
//        	            }
//        	        }
        
        //插入排序
//        for(int i = 1; i < a.length; i++){
//        	int j;
//        	for(j = i - 1; j >= 0 && a[j] > a[j + 1]; j--){
//        		int temp = a[j + 1];
//        		a[j + 1] = a[j];
//        		a[j] = temp;
//        	}
//        }

        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }			
	}
	
}
