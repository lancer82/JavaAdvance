package cn.how2j.array;

import java.util.Arrays;

/**首先定义一个5X8的二维数组，然后使用随机数填充满。
借助Arrays的方法对二维数组进行排序。
*/

public class TwoDemensionalArraySort {

	public static void main(String[] args) {
		//首先定义一个一维数组和二位数组
		int[][] a = new int[5][8];
		int[] b = new int[a.length*a[0].length];
		
		//填充二维数组并Copy到一维数组中并打印
		System.out.println("填充二维数组并Copy到一维数组中并打印:");
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = (int)(Math.random()* 100);
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
			System.arraycopy(a[i], 0, b, a[i].length*i, 8);
		}
		
		//对一维数组中的元素排序并打印
		System.out.println("对一维数组中的元素排序并打印:");
		Arrays.parallelSort(b);
		System.out.println(Arrays.toString(b));
		
		//把排序后的一维数组重新Copy到二维数组中
		System.out.println("把排序后的一维数组重新Copy到二维数组...");
		for(int i = 0; i<a.length; i++) {			
			System.arraycopy(b, a[i].length*i, a[i], 0, a[i].length);
		}
		
		//打印输出新的二维数组
		System.out.println("打印输出新的二维数组:");
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
}
