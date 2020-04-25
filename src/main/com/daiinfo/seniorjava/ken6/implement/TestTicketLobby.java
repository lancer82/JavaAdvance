package com.daiinfo.seniorjava.ken6.implement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 售票大厅，开设多个售票窗口,每个窗口设一个售票员 每个窗口是一个线程，独立售票
 * 
 * @author 戴远泉
 * 
 */
public class TestTicketLobby {
	public static void main(String[] args) {
		// 票池：<票编号,是否已出售>
		Map ticketMap = new HashMap<String, Boolean>();
		// 生成1000张火车票到票池
		for (int i = 1; i <= 1000; i++) {
			ticketMap.put("T" + i, false);
		}

		// 生成4个售票窗口
		TicketWindow s1 = new TicketWindow(ticketMap, "张三");
		TicketWindow s2 = new TicketWindow(ticketMap, "李四");
		TicketWindow s3 = new TicketWindow(ticketMap, "王五");
		TicketWindow s4 = new TicketWindow(ticketMap, "何六");

		// 每个窗口创建一个线程
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		Thread t3 = new Thread(s3);
		Thread t4 = new Thread(s4);

		// Java通过Executors提供一个可缓存线程池
		ExecutorService service = Executors.newCachedThreadPool();

		service.execute(t1);
		service.execute(t2);
		service.execute(t3);
		service.execute(t4);

		// 执行完线程池中的线程后尽快退出
		service.shutdown();
	}
}
