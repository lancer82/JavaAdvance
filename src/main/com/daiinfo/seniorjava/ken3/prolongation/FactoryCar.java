package com.daiinfo.seniorjava.ken3.prolongation;

public class FactoryCar {
	public static Car driverCar(String s) throws Exception {
        if (s.equalsIgnoreCase("Benz")) {// 判断传入参数返回不同的实现类
            return new Benz();
        } else if (s.equalsIgnoreCase("Bmw")) {
            return new Bmw();
        } else if (s.equalsIgnoreCase("Bike")) {
            return new Bike();
        } else {
            throw new Exception();// 抛出异常
        }
    }
}
