package com.hl.magic.items.day19.network.demo02;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * 客户端--测试类
 *
 *
 *
 * @author Administrator
 */
public class MyClientTest {

    @Test
    public void getInstance(){
        String str = "Hello UDP";
        byte[] bytes = str.getBytes();
        try {
            //创建InetAddress对象，封装自己的IP地址
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,inetAddress,6000);
            //创建DatagramSocket对象，数据包的发送和连接对象
            DatagramSocket socket = new DatagramSocket();
            //发送数据包
            socket.send(packet);
            //关闭资源
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
