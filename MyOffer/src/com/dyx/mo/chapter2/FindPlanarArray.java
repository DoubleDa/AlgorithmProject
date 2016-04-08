package com.dyx.mo.chapter2;

/**
 * 
 * @author dayongxin
 *         在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数
 *         ，判断数组中是否含有该整数。
 */
public class FindPlanarArray {
	/*
	 * 二维数组中查找某个整数
	 */
	public static boolean find(int[][] array, int num) {
		if (array == null || array.length < 1 || array[0].length < 1) {
			return false;
		}
		// 行数
		int rows = array.length;
		// 列数
		int cols = array[1].length;
		// 起始行数
		int row = 0;
		// 起始列数
		int col = cols - 1;
		while (row >= 0 && row < rows && col >= 0 && col < cols) {
			if (array[row][col] == num) {
				return true;
			} else if (array[row][col] > num) {
				col--;
			} else {
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] myArray = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		System.out.println(find(myArray, 1));
	}

}
