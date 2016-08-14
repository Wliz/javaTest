package 排序.选择排序;

/**
 * 选择排序是不稳定的
 * @author a9858
 *
 */
public class Main {

	public static void main(String[] args) {
		int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
		
		System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
		System.out.println();
		long startTime = System.currentTimeMillis();
        System.out.println("排序过程中：");
		for(int i = 0; i < a.length; i++){
			int min = a[i];
			int index = i;
			for(int j = i + 1; j < a.length && a[j] < min; j++){
//				if (a[j] < min) {//也就是a[i] 和 a[j]的互换，达到把最小的放在最前面的目的
//				System.out.print("i: " + i + " --j :" + j + "a[i] :" + a[i] + "-- a[j]" + a[j] + "==");
					min = a[j];
					a[j] = a[i];
					a[i] = min;
//				}
			}
			for(int k = 0; k < a.length; k ++){
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("the time of work is : " + (endTime - startTime));
		
		 //简单的选择排序
//        for (int i = 0; i < a.length; i++) {
//            int min = a[i];
//            int n=i; //最小数的索引
//            for(int j=i+1;j<a.length;j++){
//                if(a[j]<min){  //找出最小的数
//                    min = a[j];
//                    n = j;
//                }
//            }
//            a[n] = a[i];
//            a[i] = min;
//            
////        }
        //another method
//        for(int i = 0; i < a.length - 1; i++){
//        	for(int j = i + 1; j <= a.length - 1; j++){
//        		if (a[i] > a[j]) {// 注意和冒泡排序的区别，这里是i和j比较。
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//        	}
//        }
		
		System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }	
	}
}
