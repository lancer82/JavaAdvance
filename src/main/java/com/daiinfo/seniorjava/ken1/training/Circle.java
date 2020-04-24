package java.com.daiinfo.seniorjava.ken1.training;

public class Circle extends Shape {
    private double radius;
    
    
    /**
     * 构造函数  构造一个圆
     * @param radius 圆的半径
     */
    public Circle(double radius) {
        this.radius = radius;
    }
    
    /**
     * 计算圆的面积
     * @return 返回圆的面积
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * 计算圆的周长
     * @return 返回圆的周长
     */
	@Override
	public double getGirth() {
		// TODO Auto-generated method stub
		return 0;
	}
}
