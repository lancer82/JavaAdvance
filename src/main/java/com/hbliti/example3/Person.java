package java.com.hbliti.example3;

public class Person {
	public String name;
	public String sex;
	String birthday;
	
	public Person(String name,String sex,String  birthday) {
		this.name=name;
		this.sex=sex;
		this.birthday=birthday;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
	
	
	

}
