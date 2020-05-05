package cn.how2j.basic;

public class HelloWord {

	int j = 5;

	public void method1(final int j) {

		System.out.println(j);
	}

	public static void main(String[] args) {
		new HelloWord().method1(2);

	}

}
