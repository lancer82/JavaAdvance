package cn.how2j.basic;

/*
 * 水仙花数定义：
 * 1. 一定是3位数
 * 2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3
 */
public class NarcissisticNumber {

	public static void main(String[] args) {

		for (int i = 100; i < 1000; i++) {
			int hundred = i / 100;
			int ten = i % 100 / 10;
			int bit = i % 100 % 10;
			if (Math.pow(hundred, 3) + Math.pow(ten, 3) + Math.pow(bit, 3) == i) {
				System.out.println(i);
			}
		}

	}

}
