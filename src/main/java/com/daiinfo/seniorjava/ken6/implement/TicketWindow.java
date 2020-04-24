package java.com.daiinfo.seniorjava.ken6.implement;

import java.util.Iterator;
import java.util.Map;

/**
 * 售票窗口类 每个窗口包含一个售票员和票池
 * 
 * @author 戴远泉
 * 
 */
public class TicketWindow implements Runnable {
	private Map<String, Boolean> ticketMap;// 票池
	private String salerName;// 售票员姓名

	public TicketWindow(Map<String, Boolean> ticketMap, String salerName) {
		this.ticketMap = ticketMap;
		this.salerName = salerName;
	}

	// 售票
	private void saleTicket() {
		for (Iterator<String> it = ticketMap.keySet().iterator();;) {
			synchronized (ticketMap) {
				if (it.hasNext()) {
					String ticketNo = it.next();
					if (!ticketMap.get(ticketNo)) {
						System.out
								.println(salerName + ":" + ticketNo + "已被售出。");
						ticketMap.put(ticketNo, true);

						try {
							Thread.sleep(100);// 让当前线程睡眠片刻 使得别的线程 有机会执行
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else {
					break;
				}
			}
		}
	}

	@Override
	public void run() {
		saleTicket();
	}
}
