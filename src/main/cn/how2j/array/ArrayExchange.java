package cn.how2j.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayExchange {

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
			System.out.println("a[" + i + "] = " + a[i]);
		}
		// 执行元素调换操作；
		for (int i = 0; i < n / 2; i++) {
			int t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		System.out.println("逆序后生成的数组是：");
		// 打印逆序排列的数组
		
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
