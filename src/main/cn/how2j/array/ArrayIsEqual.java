package cn.how2j.array;

import java.util.Arrays;

public class ArrayIsEqual {

	public static void main(String[] args) {

		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		int b[] = new int[] { 18, 62, 68, 82, 65, 8 };

		System.out.println(Arrays.equals(a, b));
	}
}
