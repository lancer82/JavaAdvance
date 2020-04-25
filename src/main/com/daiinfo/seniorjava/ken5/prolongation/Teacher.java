package com.daiinfo.seniorjava.ken5.prolongation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teacher implements Externalizable {
	private static  long serialVersionUID = 1L;
	private String name;
	private String password;
	private String birthday;
	private static int salary = 5000;
	private String dateAmendment; // 教师信息的修改日期

	public Teacher() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void setSalary(int s) {
		salary = s;
	}

	public long getID() {
		return serialVersionUID;
	}
	
	public void setID(long ID){
		serialVersionUID=ID;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String string) {
		this.birthday = string;
	}

	public String getDateAmendment() {
		return dateAmendment;
	}

	public void setDateAmendment(String dateAmendment) {
		this.dateAmendment = dateAmendment;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		long ID = (long) in.readObject();
		name = (String) in.readObject();
		password=(String) in.readObject();
		birthday=(String) in.readObject();
		salary = (Integer) in.readObject();
		dateAmendment=(String) in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		out.writeObject(serialVersionUID);
		out.writeObject(name);
		out.writeObject(password);
		out.writeObject(birthday);
		out.writeObject(salary);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		dateAmendment=sdf.format(new Date());
		out.writeObject(dateAmendment);
	}

	public String toString() {
		return "编号:"+serialVersionUID+"\n"+"教师名称:" + name +"\n"+"密码:" + password + "\n"+"出生日期:："+birthday+"\n"+"薪金:" + salary+"\n"+"修改日期:"+dateAmendment+"\n";
	}

}
