package net.mjjava.account;

public class AccountTest {

	public static void main(String[] args) {
		Account person1 = new Account("张三","123456",1000);
		Account person2 = new Account("李四","233423",500);
		
		System.out.println("第"+person1.getId()+"个账户的户主是"+person1.getName());
		System.out.println("第"+person2.getId()+"个账户的户主是"+person2.getName());
	}

}
