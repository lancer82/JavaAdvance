package cn.how2j.array;

import java.util.Random;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		Random rand = new Random();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		// 输入数组的长度
		System.out.print("元素的个数是：");
		int n = scan.nextInt();
		int[] a = new int[n];
		// 输出生成的随机数组
		for (int i = 0; i < n; i++) {
			a[i] = 10 + rand.nextInt(90);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// 用选择法从小到大排序
		System.out.println("用选择法从小到大排序");		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		// 输出生成的随机数组
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// 用冒泡法从大到小排序
		System.out.println("用冒泡法从大到小排序");		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		// 输出生成的随机数组
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
