package com.daiinfo.seniorjava.ken1.training;

public abstract class Shape {
	
	/**
	 * 获得图形的名称
	 * @return 返回图形的名称
	 */
	public String getName() {
        return this.getClass().getSimpleName();
    }
   
	/**
    * 获得图形的面积
    * @return 返回图形的面积
    */
    public abstract double getArea(); 
    
    /**
     * 获得图形的周长
     * @return 返回图形的周长
     */
    public abstract double getGirth(); 
}
