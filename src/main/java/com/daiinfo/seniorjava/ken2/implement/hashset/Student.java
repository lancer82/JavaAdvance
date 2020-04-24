package java.com.daiinfo.seniorjava.ken2.implement.hashset;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 复写hashCode方法
	@Override
	public int hashCode() {
		return 60;
	}

	// 复写equals方法
	@Override
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof Student)) {
			return false;
		}
		Student studet = (Student) arg0;
		return this.name.equals(studet.name) && this.age == studet.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
