package com.daiinfo.seniorjava.ken6.prolongation;

/**
 * 仓库类，用于存放产品
 * 采用栈结构
 * push，入栈，放产品，即生产产品
 * pop，出栈，取产品，即消费产品
 * @author  戴远泉
 * @version 1.0
 */
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Storehouse {
	int index = 0;
	Product[] pds = new Product[10];// 构造数组，存放产品，容量是10

	// 放入仓库中，相当于入栈
	public synchronized void push(Product pd) {
		while (index == pds.length) {// 仓库满了，即栈满，
			try {
				this.wait();// 让当前线程等待
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		pds[index] = pd;
		System.out.println(Thread.currentThread().getName() + " 生产了产品" + "["
				+ pd.toString() + "]");
		this.index++;
		this.notify();// 唤醒在此对象监视器上等待的单个线程，即消费者线程
	}

	// 从仓库中拿出，相当于出栈
	public synchronized Product pop() {
		while (index == 0) {// 仓库空了，即栈空
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.index--;// push第n个之后，this.index++，使栈顶为n+1，故return之前要减一
		System.out.println(Thread.currentThread().getName() + " 消费了产品" + "["
				+ pds[index].toString() + "]");
		this.notify();
		return pds[index];
	}
}
