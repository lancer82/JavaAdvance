package com.daiinfo.seniorjava.ken6.training;

public class Account {
	// 假设一个账户有1000块钱
	int money = 1000;

	// 柜台Counter取钱的方法
	public synchronized void takeOnCounter(int money) {// 参数是每次取走的钱
		this.money -= money;// 取钱后总数减少
		System.out.println("A取走了" + money + "还剩下" +this.money);
	}

	// ATM取钱的方法
	public synchronized void takeOnATM(int money) {// 参数是每次取走的钱
		this.money -= money;// 取钱后总数减少
		System.out.println("B取走了" + money + "还剩下" + this.money);
	}
}
