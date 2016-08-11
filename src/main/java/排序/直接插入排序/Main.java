package 排序.直接插入排序;

public class Main {

	public static void main(String[] args) {
//		int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
		int[] a = {1, 2, 4, 3, 5};

		System.out.println("排序之前：");
         for (int i = 0; i < a.length; i++) {
              System.out.print(a[i]+" ");
         }
         
        //直接插入排序
        for(int i = 1; i < a.length; i++){
        	int temp = a[i];
        	int j;
        	for(j = i - 1; j >= 0; j--){
        		if(a[j] > temp){
        			a[j + 1] = a[j];
        		}else{
        			break;
        		}
        	}
        	a[j + 1] = temp;
        }
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
             System.out.print(a[i]+" ");
        }insert(a);

	}
	
	/**
	 * 自己编写的插入排序<br>
	 * <p>其实a[j]是temp的前一个数，<br>
	 * 	  如果a[j]大于temp，则a[j + 1] = a[j];<br>
	 * 	  否则跳出该次循环.<br>
	 * 	  前面都是排好序的，也就是说前面的数都比temp小,
	 * 	  temp大于前面的一个数就说明比前面任一数都大
	 * </p>
	 * @param a int[]
	 */
	public static void insert(int[] a){
		//从第二个数开始排序
		for(int i = 1; i < a.length; i++){
			int temp = a[i];
			int j;
			for(j = i - 1; j >= 0; j--){
				if(a[j] > temp){//
					a[j + 1] = a[j];
				}else{
					break;
				}
			}
			a[j + 1] = temp;
		}
	}
	
}
