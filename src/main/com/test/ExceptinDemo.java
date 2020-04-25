package com.test;

class ExceptionDemo {
	public static void main(String args[]) {
		int i, j;
		int a[] = { 2, 1, 4, 5, 3 };
		for (i = 0; i < a.length - 1; i++) {
			int k = i;
			for (j = i; j < a.length; j++)
				if (a[j] < a[k])
					k = j;
			int temp = a[i];
			a[i] = a[k];
			a[k] = temp;
		}
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + "  ");
		System.out.println();
	}

}
