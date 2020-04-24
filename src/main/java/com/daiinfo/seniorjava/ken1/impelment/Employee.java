package java.com.daiinfo.seniorjava.ken1.impelment;

/**
 * 抽象类，封装员工的信息和操作
 * @author daiyuanquan
 *
 */
public  class Employee {
	String ID;
	String name;
		
	int workdays;//工作天数
	int overtimedays;//加班天数
	int absencedays;//缺勤天数
	double salary;//月工资
	
	/**
	 * 构造函数
	 */
	public Employee(String ID) {
		// TODO Auto-generated constructor stub
		this.ID=ID;
	}
	
	/**
	 * 构造函数
	 */
	public Employee(String ID,String name) {
		// TODO Auto-generated constructor stub
		this.ID=ID;
		this.name=name;
	}
	
	
	/**
	 * 计算员工的工资
	 * @param workdays 工作天数
	 * @param overtimedays 加班天数
	 * @param absencedays 缺勤天数
	 * @return 返回月工资总数
	 */
	double calculateCount(int workdays,int overtimedays,int absencedays){
		double count=0.0;
		count=80.0*workdays+80*overtimedays-30*absencedays;
		return count;
	}
	
	/**
	 * 转换字符串
	 */
	public String toString(){
		return name+"\t"+salary;
	}
	
	
	
   
}
