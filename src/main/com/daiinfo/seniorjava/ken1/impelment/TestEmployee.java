package com.daiinfo.seniorjava.ken1.impelment;

/**
 * 测试类的引用
 *@Copyright: Copyright (c) 2017
 *@Company: daiinfo
 *
 *@author daiyuanquan
 *@version 1.0
 *@since 1.0
 */
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Manager manager=new Manager("001", "张三", "开发部","经理");
        double countsalary=manager.calculateCount(22, 3, 0);
        System.out.println(countsalary);
        
        Staff staff=new Staff("2001", "王好", "财务部", "会计师");
        double salary=staff.calculateCount(20, 5, 1);
        System.out.println(salary);
        		

	}

}
