package java.com.daiinfo.seniorjava.ken7.prolongation;

import java.net.*;
import java.util.Scanner;

public class MultiSender {
	public static void main(String[] args) {
		try {
			// 1.载入信息,从键盘输入
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入要发送的信息:");
			String msg = sc.nextLine();

			// 2.创建数据报
			InetAddress address = InetAddress.getByName("228.5.6.7");
			byte[] bs = msg.getBytes();
			DatagramPacket dp = new DatagramPacket(bs, bs.length, address, 8989);

			// 3.通过MultiSocket发送数据报
			MulticastSocket ms = new MulticastSocket();
			ms.joinGroup(address);
			ms.send(dp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
