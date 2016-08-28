package 网易2017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/** 
 * @ClassName: Xipai 
 * @Description: 网易2017内推编程题
 * <titile>洗牌</title>
 * 
 * @author: a9858
 * @date: 2016年8月28日 下午1:26:34  
 */
public class Xipai {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		List list = new ArrayList<Integer>();//结果集
		
		for(int i = 0; i < t; i++){
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			
			int[] src = new int[2*n];//构建一副牌
			
			for(int j = 0;j < (2*n); j++){
				src[j] = Integer.parseInt(scanner.next());//完全可以用scanner.nextInt();代替
			}
			
			int result[] = xipai(src, k);
			
			list.add(result);
		}


		//展示洗牌后的结果
		for(int i = 0; i < list.size(); i++){
			int[] result = (int[]) list.get(i);
			for(int j = 0; j < result.length; j++){
				System.out.print(result[j]);
				if(j != result.length - 1){//控制最后一个后面不带空格
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	
	/** 
	 * @Title: xipai 
	 * @Description: 洗牌的函数，通过递归调用本函数来控制洗牌的次数
	 * @param src 牌组成的数组
	 * @param k 洗牌的次数
	 * @return: int[]
	 */
	private static int[] xipai(int[] src, int k){
		int length = src.length;
		int[] result = new int[length];
		int count = 0;
		for(int i = 0; i < (length/2); i++){
			result[count++] = src[i];
			result[count++] = src[i + (length/2)];
		}
		k -= 1;//洗一次，洗牌次数减一
		if(k > 0){result = xipai(result, k);}//递归调用本函数继续洗牌
		
		return result;
	}

}
