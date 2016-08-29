package 剑指offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @ClassName: PrintMatrix
 * @Description: 顺时针打印矩阵<br>
 *               输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，<br>
 *               例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16<br>
 *               则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.<br>
 * @author: a9858
 * @date: 2016年8月25日 下午9:52:23
 */
public class PrintMatrix {

	static ArrayList<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		// printMatrixClockWisely(matrix);
		// System.out.println();

		// ArrayList<Integer> result = printMatrix(matrix);
		//
		// for (Integer integer : result) {
		// System.out.print(integer + "\t");
		// }

		System.out.println();
		int[][] numbers = new int[][] { { 1, 2 }, { 3, 4 } };
		ArrayList<Integer> resu = printMatrix2(numbers);

		for (Integer integer : resu) {
			System.out.print(integer + "\t");
		}
	}

	/**
	 * @Title: printMatrix
	 * @Description: 将矩阵转换为数组
	 * @param matrix
	 *            输入的二维数组，二维数组必须是N*M的，否则分出错
	 * @return: ArrayList<Integer>
	 */
	public static ArrayList<Integer> printMatrix(int[][] matrix) {

		if (matrix == null) {
			return null;
		}

		int x = 0;// 记录一圈的开始位置的行
		int y = 0;// 记录一圈的开始位置的列

		// 对每一环进行处理
		// 行号最大是(matrix.length-1)/2
		// 列号最大是(matrix[0].length-1)/2
		while (x * 2 < matrix.length && y * 2 < matrix[0].length) {
			printMatrixInCircle(matrix, x, y);
			// 执行下一个要处理的环的第一个位置
			x++;
			y++;
		}

		return result;
	}

	/** 
	 * @Title: printMatrixInCircle 
	 * @Description: 极客学院思路
	 * @param numbers 处理的数组
	 * @param x 一圈开始的位置的行
	 * @param y 一圈开始的位置的列
	 * @return: void
	 */
	public static void printMatrixInCircle(int[][] numbers, int x, int y) {
		// 数组的行数
		int rows = numbers.length;

		// 数组的列数
		int cols = numbers[0].length;

		// 输出环的上面一行，包括最中的那个数字
		for (int i = y; i <= cols - y - 1; i++) {
			result.add(numbers[x][i]);
		}

		// 环的高度至少为2才会输出右边的一列
		// rows-x-1：表示的是环最下的那一行的行号
		if (rows - x - 1 > x) {

			// 因为右边那一列的最上面那一个已经被输出了，所以行呈从x+1开始，
			// 输出包括右边那列的最下面那个
			for (int i = x + 1; i <= rows - x - 1; i++) {
				result.add(numbers[i][cols - y - 1]);
			}
		}

		// 环的高度至少是2并且环的宽度至少是2才会输出下面那一行
		// cols-1-y：表示的是环最右那一列的列号
		if (rows - x - 1 > x && cols - 1 - y > y) {

			// 因为环的左下角的位置已经输出了，所以列号从cols-y-2开始
			for (int i = cols - y - 2; i >= y; i--) {
				result.add(numbers[rows - 1 - x][i]);
			}

		}

		// 环的宽度至少是2并且环的高度至少是3才会输出最左边那一列
		// rows-x-1：表示的是环最下的那一行的行号
		if (cols - 1 - y > y && rows - 1 - x > x + 1) {

			// 因为最左边那一列的第一个和最后一个已经被输出了
			for (int i = rows - 1 - x - 1; i >= x + 1; i--) {
				result.add(numbers[i][y]);
			}
		}

	}

	/** 
	 * @Title: printMatrix2 
	 * @Description: 牛客网同学所做
	 * @param array
	 * @return: ArrayList<Integer>
	 */
	public static ArrayList<Integer> printMatrix2(int[][] array) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (array.length == 0){	return result;}
		
		int n = array.length,//行数 
				m = array[0].length;//列数
		
		if (m == 0){//如果列数为0也说明出错
			return result;
		}
		
		int ceng = ((Math.min(n, m) - 1) / 2) + 1;// 层数,控制打印几圈（几层）
		
		for (int i = 0; i < ceng; i++) {
			for (int k = i; k < m - i; k++){
				result.add(array[i][k]);// 从左向右
			}
			for (int j = i + 1; j < n - i; j++){
				result.add(array[j][m - i - 1]);// 从上向下
			}
			for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--){
				result.add(array[n - i - 1][k]);// 从右向左
			}
			for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--){
				result.add(array[j][i]);// 从下向上
			}
		}
		return result;
	}

}
