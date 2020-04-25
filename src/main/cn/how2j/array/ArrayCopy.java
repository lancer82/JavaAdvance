package cn.how2j.array;

public class ArrayCopy {
	public static void main(String[] args) {
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

		int b[] = new int[] {1,2,3,4,5,6};// 分配了长度是3的空间，但是没有赋值

		// 通过数组赋值把，a数组的前3位赋值到b数组

		// 方法一： for循环

//		for (int i = 0; i < b.length; i++) {
//			b[i] = a[i];
//		}

		// 方法二: System.arraycopy(src, srcPos, dest, destPos, length)
		// src: 源数组
		// srcPos: 从源数组复制数据的起始位置
		// dest: 目标数组
		// destPos: 复制到目标数组的启始位置
		// length: 复制的长度
		
		System.arraycopy(a, 0, b, 3, 3);//输出结果：1 2 3 18 62 68 
		System.arraycopy(a, 0, b, 0, 6);//输出结果：18 62 68 82 65 9 
		System.arraycopy(a, 3, b, 2, 3);//输出结果：18 62 82 65 9 9
		// 把内容打印出来
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		
	}
}
