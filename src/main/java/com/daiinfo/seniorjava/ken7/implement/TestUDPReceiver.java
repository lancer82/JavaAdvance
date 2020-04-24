package java.com.daiinfo.seniorjava.ken7.implement;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class TestUDPReceiver {
	public static void main(String[] args) {
		// 1、创建服务器端DatagramSocket，指定端口
		DatagramSocket socket = null;
		try {
			socket = new DatagramSocket(10010);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 2、创建数据报，用于接受客户端发送的数据s
		byte[] data = new byte[1024];//
		DatagramPacket packet = new DatagramPacket(data, data.length);

		// 3、接受客户端发送的数据
		try {
			socket.receive(packet);// 此方法在接受数据报之前会一致阻塞
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4、读取数据
		String info = new String(data, 0, data.length);
		System.out.println("我是服务器，客户端告诉我" + info);

		// =========================================================
		// 向客户端响应数据
		// 1、定义客户端的地址、端口号、数据
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		byte[] data2 = "欢迎您！".getBytes();

		// 2、创建数据报，包含响应的数据信息
		DatagramPacket packet2 = new DatagramPacket(data2, data2.length,
				address, port);
		// 3、响应客户端
		try {
			socket.send(packet2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 4、关闭资源
		socket.close();
	}

}
