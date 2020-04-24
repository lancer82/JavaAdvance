package java.com.daiinfo.seniorjava.ken6.prolongation;

import java.util.Date;

public class Producer implements Runnable {
	private String name;
	private Storehouse sh = null;

	public Producer(String name, Storehouse sh) {
		this.name = name;
		this.sh = sh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while (true) {
			Product product = new Product((int) (Math.random() * 10000)); // 产生0~9999随机整数
			sh.push(product);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
}
