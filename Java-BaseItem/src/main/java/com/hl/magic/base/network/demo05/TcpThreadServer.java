package base.network.demo05;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件上传服务器端--多线程
 * @author HL
 */
public class TcpThreadServer {

    public static void fun(){
        try {
            ServerSocket server = new ServerSocket(6000);
            //服务器端死循环永不停止
            while (true){
                //只要获取到一个客户端，服务器端开启一个新的线程
                Socket socket = server.accept();
                new Thread(new Upload(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fun();
    }
}
