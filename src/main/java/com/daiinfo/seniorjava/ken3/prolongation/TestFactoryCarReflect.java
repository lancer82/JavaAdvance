package java.com.daiinfo.seniorjava.ken3.prolongation;

public class TestFactoryCarReflect {
	public static void main(String[] args) throws Exception{  
        FactoryCarReflect factory = new FactoryCarReflect();  
        Car car = (Car)factory.getCar("com.daiinfo.seniorjava.ken3.prolongation.Benz");
        car.driver();  
    }
}
