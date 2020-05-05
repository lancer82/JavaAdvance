package cn.how2j.basic;

public class ArithmeticExercise {

	public static void main(String[] args) {
		//方法一 多层循环
		for (int a = 0; a <= 8; a++) {
			for (int b = 0; b <= 8; b++) {
				for (int c = 0; c <= 14; c++) {
					for (int d = 0; d <= 10; d++) {
						if (8 == a + b & 14 == a + c & 6 == c - d & 10 == b + d) {
							 System.out.println(a+","+b+","+c+","+d);
						}
					}
				}
			}
		}
		
		//方法二 列方程式
        int a,b,c,d;
        for(a = 1;a < 8;a++) {
            b = 8 - a;
            c = 14 - a;
            d = 10 - b;
            if(8 == a+b && 6 == c-d && 14 == a+c && 10 == b+d) {
                System.out.println(a+","+b+","+c+","+d);
            }             
        }
	}
}
