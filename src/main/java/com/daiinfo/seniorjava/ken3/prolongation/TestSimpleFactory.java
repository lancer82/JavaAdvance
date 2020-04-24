package java.com.daiinfo.seniorjava.ken3.prolongation;

public class TestSimpleFactory {
	public static void main(String[] args) {// java程序主入口处
        try {
            
            System.out.println("经理，今天开什么车呀？");
            Car car = FactoryCar.driverCar("Bike");// 调用方法返回车的实例
            car.driver();// 调用方法开车
        } catch (Exception e) {// 捕获异常
            System.out.println("开车出现问题......");
        } finally {// 代码总被执行
            System.out.println("......");
        }
    }
}
