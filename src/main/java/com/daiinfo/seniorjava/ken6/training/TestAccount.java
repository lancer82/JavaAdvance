package java.com.daiinfo.seniorjava.ken6.training;

public class TestAccount {
	/**
	* 两个人AB通过一个账户A在柜台取钱和B在ATM机取钱
	* */
	public static void main(String[] args) {
	// 实力化一个银行对象
	Account account = new Account();
	// 实例化两个人，传入同一个银行的对象
	PersonA pA = new PersonA(account);
	PersonB pB = new PersonB(account);
	//创建线程
	Thread tpaThread= new Thread(pA);
	Thread tpbThread= new Thread(pB);
	
	// 两个人开始取钱
	tpaThread.start();
	tpbThread.start();
	  
	}
}
