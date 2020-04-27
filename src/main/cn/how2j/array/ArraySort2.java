package cn.how2j.array;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
        System.out.println("排序之前 :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("排序之后:");
        System.out.println(Arrays.toString(a));
	}

}
