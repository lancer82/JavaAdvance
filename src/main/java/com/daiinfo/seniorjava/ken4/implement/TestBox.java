package java.com.daiinfo.seniorjava.ken4.implement;

public class TestBox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String, String> c1 = new Box<String, String>("name", "findingsea");
		Box<String, Integer> c2 = new Box<String, Integer>("age", 24);
		Box<Double, Double> c3 = new Box<Double, Double>(1.1, 2.2);
		System.out.println(c1.getKey() + " : " + c1.getValue());
		System.out.println(c2.getKey() + " : " + c2.getValue());
		System.out.println(c3.getKey() + " : " + c3.getValue());
	}
}
