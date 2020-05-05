package cn.how2j.digit;

public class TestNumber {

	public static void main(String[] args) {
		int i =5;
		//把一个基本类型的变量,转换为Integer对象
		Integer it = new Integer(i);		
        //自动转换就叫装箱
        Integer it2 = i;
        //自动转换就叫拆箱
        int i3 = it2;
		//把一个Integer对象，转换为一个基本类型的int
		int j = it.intValue();
		//Integer是Number的子类，所以打印true
		System.out.println(it instanceof Number);
		System.out.println(j);
		
        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值      
        System.out.println(Integer.MIN_VALUE);
        
        // 1. 对byte,short,float,double进行自动拆箱和自动装箱
        byte b = 1;
        short s = 2;
        float f = 3.14f;
        double d = 6.18;
 
        // 自动装箱
        Byte b1 = b;
        Short s1 = s;
        Float f1 = f;
        Double d1 = d;
        // 自动拆箱
        b = b1;
        s = s1;
        f = f1;
        d = d1;
 
        // 2. byte和Integer之间能否进行自动拆箱和自动装箱
        //Integer i1 = b; //不能把byte直接自动装箱成Integer
        //b = new Integer(1); //也不能把Integer自动拆箱成 byte
         
        // 3. 通过Byte获取byte的最大值
        System.out.println(Byte.MAX_VALUE);
	}

}
