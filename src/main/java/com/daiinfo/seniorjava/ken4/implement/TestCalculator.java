package java.com.daiinfo.seniorjava.ken4.implement;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorInteger ci = new CalculatorInteger();
        Integer val = ci.and(10, 20);
        System.out.println(val);
        
        CalculatorString cs = new CalculatorString();
        String string = cs.and("湖北", "武汉");
        System.out.println(string);     
	}
}
