package java.com.daiinfo.seniorjava.ken6.prolongation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * java多线程模拟生产者消费者问题
 * 
 * ProducerConsumer是主类，Producer生产者，Consumer消费者，Product产品，Storehouse仓库
 * 
 * @author 戴远泉
 * @version 1.0 2017-8-7 上午02:49:02
 */
public class TestProducerConsumer {
	public static void main(String[] args) {
		Storehouse sh = new Storehouse();

		Producer p1 = new Producer("张三", sh);
		Producer p2 = new Producer("李四", sh);
		Consumer c1 = new Consumer("王五", sh);
		Consumer c2 = new Consumer("老刘", sh);

		Thread tp1 = new Thread(p1);// 新建一个生产者线程
		Thread tp2 = new Thread(p2);
		Thread tc1 = new Thread(c1);// 新建一个消费者线程
		Thread tc2 = new Thread(c2);

		/*
		 * tp1.start();// 启动生产者线程
		 *  tp2.start(); 
		 *  tc1.start();// 启动消费者线程
		 * tc2.start();
		 */
		
		/**
		 * 使用线程池
		 */
		ExecutorService service = Executors.newCachedThreadPool();
		service.submit(tc1);
		service.submit(tc2);
		service.submit(tp1);
		service.submit(tp2);
	}
}
