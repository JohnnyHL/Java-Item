package base.network.demo04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 文件上传客户端
 *  需求：
 *      1、从客户端将一张图片上传到服务器中
 *      2、服务器将图片保存在一个文件夹中
 *      3、客户端还要收到上传成功的提示
 *  服务器端：收到客户端上传的图片，保存到一个文件夹中
 *  客户端：从E:/image，上传至服务器
 *
 *  本质：文件复制
 *      数据源--->数据复制--->字节流
 *
 *  实现步骤：
 *      1、Socket套接字连接服务器
 *      2、通过Socket套接字获取字节输出流，写图片
 *      3、使用字节的流对象，读取图片数据源
 *          FileInputStream
 *      4、读取文件，使用字节输出流，将图片写入到服务器
 *          采用字节数组进行缓冲
 *      5、通过Socket套接字获取字节输入流
 *          读取服务发回来的上传成功
 *      6、关闭资源
 *
 *   文件上传问题：
 *      1、线程等待问题；
 *          read()方法会产生线程阻塞，客户端和服务器端均在等待线程释放
 * @author hl
 */
public class TcpClient {

    public static void upImages(){
        try {
            //-----------------发送信息-----------------
            //1.创建Socket对象，用于连接服务器
            Socket socket = new Socket("127.0.0.1",6000);
            //2.通过客户端套接字的Socket对象，获取字节输出流
            OutputStream outputStream = socket.getOutputStream();
            //3.创建字节输入流，读取本机上的数据源图片
            FileInputStream file = new FileInputStream("E:\\Study\\Test\\imgs\\A.jpg");
            //4.开始读写字节数组
            byte[] bytes = new byte[1024];
            int len;
            while ((len = file.read(bytes)) != -1) {
                //将图片的字节流数据写入到服务器
                outputStream.write(bytes,0,len);
                outputStream.flush();
            }
            //给服务器端写入终止序列，避免线程阻塞问题
            socket.shutdownOutput();

            //-----------------反馈信息-----------------
            //===>5.获取字节输入流，读取服务器的上传成功响应
            InputStream inputStream = socket.getInputStream();
            int read;
            while((read = inputStream.read(bytes)) != -1){
                System.out.println(new String(bytes,0,read));
            }

            //关闭资源
            file.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
    public static void main(String[] args) {
        upImages();
    }
}