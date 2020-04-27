package cn.how2j.array;

import java.util.Arrays;
//直接把一个数组，转换为字符串，这样方便观察数组的内容
public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		String content = Arrays.toString(a);
		System.out.println(content);
	}
}
