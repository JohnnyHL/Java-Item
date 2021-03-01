package base.network.demo05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 多线程文件上传客户端01
 *
 * @author HL
 */
public class ClientSocket01 {

    public static void fun(){
        try {
            //-----------------发送信息-----------------
            Socket socket = new Socket("127.0.0.1",6000);
            OutputStream outputStream = socket.getOutputStream();
            FileInputStream file = new FileInputStream("E:\\Study\\Test\\imgs\\Tulips.jpg");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = file.read(bytes)) != -1) {
                outputStream.write(bytes,0,len);
                outputStream.flush();
            }
            //给服务器端写入终止序列，避免线程阻塞问题
            socket.shutdownOutput();

            //-----------------反馈信息-----------------
            InputStream inputStream = socket.getInputStream();
            int read;
            while((read = inputStream.read(bytes)) != -1){
                System.out.println(new String(bytes,0,read));
            }
            file.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
    public static void main(String[] args) {
        fun();
    }
}
