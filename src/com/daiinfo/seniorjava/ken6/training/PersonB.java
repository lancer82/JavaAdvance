package com.daiinfo.seniorjava.ken6.training;

public class PersonB implements Runnable {
	// 创建银行对象
	Account account;

	// 通过构造器传入银行对象，确保两个人进入的是一个银行
	public PersonB(Account account) {
		this.account = account;
	}

	// 重写run方法，在里面实现使用柜台取钱
	@Override
	public void run() {
		while (account.money >= 200) {
			account.takeOnATM(200);// 每次取200块
			try {
				Thread.sleep(2000);// 取完休息0.1秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
