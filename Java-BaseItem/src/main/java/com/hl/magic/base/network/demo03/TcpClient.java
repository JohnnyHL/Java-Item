package base.network.demo03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Tcp客户端
 * 1.实现两台计算机之间的通信，通信的两端都需要创建socket对象
 *
 * 2.UDP和TCP区别：
 *      a、UDP中只有发送端和接收端，不区分客户端与服务器，计算机之间可以随意地发送数据；
 *      b、TCP中严格区分客户端和服务器端的，在通信时，必须是客户端去连接服务器端才能实现通信，
 *         服务器端不能主动去连接客户端，并且服务器端需要事先启动，等待客户端的连接。
 *
 * 3.JDK中提供了两个用于实现TCP程序，
 *      a、ServerSocket类，用于表示服务器；
 *      b、Socket类，用于表示客户端。
 *
 * 4、TCP建连接通信过程：
 *      首先创建服务器端的ServerSocket对象，该对象相当于开启一个服务器，并等待客户端的连接；
 *      然后，表示客户端的Socket对象向服务器端发出连接请求，服务器响应请求，两者之间建立连接开始通信。
 *      服务器端和客户端之间通过IO字节流进行数据交换
 *
 *
 * 5、测试案例
 * TCP客户端连接到服务器，实现和服务器端的数据交换
 * 使用方法：
 *  【1】Socket(String host, int port)：创建流套接字并将其连接到指定主机上的指定端口号。
 *      注意：构造方法只要运行，就会和服务器进行连接，连接失败，抛出异常
 *
 *  【2】OutputStream getOutputStream(): 返回此套接字的输出流。
 *      作用：将数据输出，输出到服务器
 *
 *  【3】InputStream getInputStream()： 返回此套接字的输入流。
 *      作用：从服务器端读取数据
 *
 *   客户端和服务器端数据交换，必须使用套接字对象Socket中获取的IO流。
 *
 * @author hl
 */
public class TcpClient {

    public static void fun(){
        try {
            //-----------------发送数据-----------------
            //客户端向服务器端发送数据
            //1、创建Socket对象，用于连接服务器
            Socket socket = new Socket("127.0.0.1",6000);
            //2、通过客户端的套接字对象Socket对象，获取字节数出流
            OutputStream outPut = socket.getOutputStream();
            //3、开始将数据写向服务器端
            outPut.write("hello,服务器".getBytes());

            //-----------------反馈信息-----------------
            //4.客户端读取服务端回传数据
            InputStream input = socket.getInputStream();
            byte[] bytes = new byte[1024];
            int len;
            while((len = input.read(bytes)) != -1) {
                System.out.println("==>" + new String(bytes,0,len));
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        fun();
    }
}
