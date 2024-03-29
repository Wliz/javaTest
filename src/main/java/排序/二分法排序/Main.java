package 排序.二分法排序;
/** 
 * @ClassName: Main 
 * @Description: 二分法排序 稳定的排序
 * @author: a9858
 * @date: 2016年8月14日 下午8:36:06  
 */
public class Main {
	public static void main(String[] args) {
//        int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
		int[] a = {2,3,4,5,6,4};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //二分插入排序
        long startTime = System.currentTimeMillis();
        sort(a);
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("the time of work is : " + (endTime - startTime));
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i-1;
            int mid = 0;
            while(left<=right){
                mid = (left+right)/2;
                if(temp<a[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            for (int j = i-1; j >= left; j--) {
                a[j+1] = a[j];
            }
            if(left != i){
                a[left] = temp;
            }
        }
    }

}
