package java.com.daiinfo.seniorjava.ken1.impelment;

public class Staff extends Employee{
	double bassewages=2000;
	double dailywages=50;//日工资
	String department;
	String technicaltitle;
	
	/**
	 * 构造函数
	 */
	public Staff(String ID,String name,String department,String technicaltitle){
		super(ID,name);
		this.department=department;
		this.technicaltitle=technicaltitle;
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
		count=bassewages+dailywages*overtimedays-dailywages*absencedays;
		return count;
	}
	
	/**
	 * 转换字符串输出信息
	 */
	public String toString(){
		return name+"\t"+salary;
	}
}
