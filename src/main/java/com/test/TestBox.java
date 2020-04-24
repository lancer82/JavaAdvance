package java.com.test;

public class TestBox {
	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<Double> doubleBox = new Box<Double>();
		Box<String> stringBox = new Box<String>();

		integerBox.set(21);
		doubleBox.set(45.90);
		stringBox.set("Hello!");

		System.out.println(integerBox.get());
		System.out.println(doubleBox.get());
		System.out.println(stringBox.get());
	}
}
