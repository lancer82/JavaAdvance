package com.daiinfo.seniorjava.ken1.training;

public class Rectangle extends Shape {
    private double length;
    private double width;
    
    /**
     * 构造函数 构造一个矩形
     * @param length
     * @param width
     */
    public Rectangle(double length, double width) {//获得矩形的长和宽
        this.length = length;
        this.width = width;
    }
    
    /**
     * 获得矩形的面积
     */
    @Override
    public double getArea() {//计算矩形的面积
        return length * width;
    }
    
    /**
     * 获得矩形的周长
     */
	@Override
	public double getGirth() {
		// TODO Auto-generated method stub
		return 0;
	}
}
