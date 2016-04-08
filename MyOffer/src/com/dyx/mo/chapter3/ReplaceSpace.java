package com.dyx.mo.chapter3;

/**
 * 
 * Author    : Yongxinda(yongxinda89@gmail.com)
 * Version   : 1.0
 * Date      : 2016年4月9日
 * Time      : 下午11:24:12
 * Summary   : 替换字符串的空格
 * Copyright : Copyright (c) 2016
 */
public class ReplaceSpace {
	/**
	 * 
	 * @param array
	 * @param len
	 * @return
	 */
	public static int replaceSpace(char[] array, int len) {
		if (array == null || array.length < len) {
			return -1;
		}
		// 统计空白字符
		int whiteCou = 0;
		for (int i = 0; i < len; i++) {
			if (array[i] == ' ') {
				whiteCou++;
			}
		}
		// 计算转换后长度
		int transferLen = whiteCou * 2 + len;
		int result = transferLen;
		if (transferLen > array.length) {
			return -1;
		}
		if (whiteCou == 0) {
			return len;
		}
		len--;
		transferLen--;
		while (len >= 0 && len < transferLen) {
			if (array[len] == ' ') {
				array[transferLen--] = '0';
				array[transferLen--] = '2';
				array[transferLen--] = '%';
			} else {
				array[transferLen--] = array[len];
			}
			len--;
		}
		return result;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		char[] myArray = new char[50];
		myArray[0] = ' ';
		myArray[1] = ' ';
		myArray[2] = 'u';
		myArray[3] = 'o';
		myArray[4] = 'y';
		myArray[5] = ' ';
		myArray[6] = ' ';
		myArray[7] = 'e';
		myArray[8] = 'v';
		myArray[9] = 'o';
		myArray[10] = 'l';
		myArray[11] = ' ';
		myArray[12] = ' ';
		myArray[13] = 'I';
		int len = replaceSpace(myArray, 14);
		System.out.println(new String(myArray, 0, len));
	}

}
