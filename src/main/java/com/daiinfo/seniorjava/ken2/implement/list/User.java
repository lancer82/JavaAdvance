package java.com.daiinfo.seniorjava.ken2.implement.list;

public class User {
	String name;
	String email;

	public User(String name, String emailString) {
		this.name = name;
		this.email = emailString;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
