package net.mjjava.account;

public class Account {
	private static int counter = 0;
	private String name;
	private String no;
	private long balance;
	private int id;
	
	public Account(String n,String num,long z) {
		this.name=n;
		this.no=num;
		this.balance=z;
		this.id=++counter;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
