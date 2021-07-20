package com.hl.magic.items.day19.network.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Tcp服务器端
 * 1、表示服务器端程序的类：java.net.ServerSocket;
 *    使用的方法：
 *    ServerSocket(int port)；创建绑定到指定端口的服务器套接字。
 *
 *    必须获取客户端的套接字对象Socket
 *    Socket accept(): 侦听要连接到此套接字并接受它。
 *
 *
 * @author hl
 */
public class TcpServer {

    /**
     * 获取客户端的socket套接字对象
     */
    public static void fun(){
        try {
            //-----------------反馈信息-----------------
            //1、创建服务器端ServerSocket对象
            ServerSocket server = new ServerSocket(6000);
            //2、调用服务器套接字对象中的accept()方法，来获取改客户端的套接字对象
            Socket socket = server.accept();
            //3、通过客户端套接字对象，socket获取字节输入流
            InputStream input = socket.getInputStream();
            //4、读取客户端发送的流数据
            byte[] bytes = new byte[1024];
            int len;
            while((len = input.read(bytes)) != -1){
                System.out.println("==>" + new String(bytes,0,len));
            }

            //-----------------发送数据-----------------
            //5.客户端接收服务器端回传数据，字节输出流向外写数据，通过客户端套接字对象获取字节数出流
            OutputStream output = socket.getOutputStream();
            output.write("收到，OK".getBytes());

            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        fun();
    }
}