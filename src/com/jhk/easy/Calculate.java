package com.jhk.easy;

public class Calculate {
	// ����һ������ n�������æ���㲢���ظ���������λ����֮�����롸��λ����֮�͡��Ĳ
	// Here is an integer n. please help to calculate and return the difference
	// between the integer "product of digits" and "sum of digits".
	public static void main(String[] args) {
		System.out.println(subtractProductAndSum(1234));
	}

	public static int subtractProductAndSum(int n) {
		int tarN = 0;
		int tarX = 1;
		Integer x = new Integer(n);
		String str = x.toString();
		int strlen = str.length();
		int[] arr = new int[strlen];
		for (int i = 0; i < strlen; i++) {
			if (i == strlen - 1) {
				arr[i] = Integer.parseInt(str.substring(i));
			} else {
				arr[i] = Integer.parseInt(str.substring(i, i + 1));
			}
		}
		for (int i = 0; i < arr.length; i++) {
			tarX *= arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			tarN += arr[i];
		}
		int gg = tarX - tarN;
		return gg;
	}
}
