package com.daiinfo.seniorjava.ken3.prolongation;

public class FactoryCarReflect {
	public Object getCar(String className) throws Exception{  
        Class<?> cls = Class.forName(className);  
        Object obj = cls.newInstance();  
        return obj;  
    }
}
