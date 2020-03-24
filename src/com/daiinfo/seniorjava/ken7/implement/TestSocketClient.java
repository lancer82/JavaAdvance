package com.daiinfo.seniorjava.ken7.implement;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
/**
 * 客户端
 * @author 戴远泉
 *@version 1.0
 */
public class TestSocketClient extends JFrame {
    private PrintWriter writer; // 声明PrintWriter类对象
    private BufferedReader reader; // 声明BufferedReader对象
    private Socket socket; // 声明Socket对象
    private JTextArea ta_info; // 创建JtextArea对象
    private JTextField tf_send; // 创建JtextField对象
    private void connect() { // 连接套接字方法
        ta_info.append("尝试连接......\n"); // 文本域中信息信息
        try { // 捕捉异常
            socket = new Socket("127.0.0.1", 1978); // 实例化Socket对象
            while (true) {
                writer = new PrintWriter(socket.getOutputStream(), true);
                reader = new BufferedReader(new InputStreamReader(socket
                        .getInputStream())); // 实例化BufferedReader对象
                ta_info.append("完成连接。\n"); // 文本域中提示信息
                getServerInfo();
            }
        } catch (Exception e) {
            e.printStackTrace(); // 输出异常信息
        }
    }
    
    public static void main(String[] args) { // 主方法
    	TestSocketClient clien = new TestSocketClient(); // 创建本例对象
        clien.setVisible(true); // 将窗体显示
        clien.connect(); // 调用连接方法
    }
    
    private void getServerInfo() {
        try {
            while (true) {
                if (reader != null) {
                    String line = reader.readLine();// 读取服务器发送的信息
                    if (line != null)
                        ta_info.append("接收到服务器发送的信息：" + line + "\n"); // 显示服务器端发送的信息
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();// 关闭流
                }
                if (socket != null) {
                    socket.close(); // 关闭套接字
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Create the frame
     */
    public TestSocketClient() {
        super();
        setTitle("客户端程序");
        setBounds(100, 100, 361, 257);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.NORTH);

        final JLabel label = new JLabel();
        label.setForeground(new Color(0, 0, 255));
        label.setFont(new Font("", Font.BOLD, 22));
        label.setText("一对一通信——客户端程序");
        panel.add(label);

        final JPanel panel_1 = new JPanel();
        getContentPane().add(panel_1, BorderLayout.SOUTH);

        final JLabel label_1 = new JLabel();
        label_1.setText("客户端发送的信息：");
        panel_1.add(label_1);

        tf_send = new JTextField();
        tf_send.setPreferredSize(new Dimension(140, 25));
        panel_1.add(tf_send);

        final JButton button = new JButton();
        button.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                writer.println(tf_send.getText()); // 将文本框中信息写入流
                ta_info.append("客户端发送的信息是：" + tf_send.getText()
                        + "\n"); // 将文本框中信息显示在文本域中
                tf_send.setText(""); // 将文本框清空
            }
        });
        button.setText("发  送");
        panel_1.add(button);

        final JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        ta_info = new JTextArea();
        scrollPane.setViewportView(ta_info);
        //
    }
    
}


