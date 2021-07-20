package com.hl.magic.items.day19.network.demo04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * 文件上传服务端
 *  实现步骤：
 *      1.创建服务器端Socket套接字对象，监听端口port
 *      2.调用accept()方法获取客户端的连接对象
 *      3.客户端连接对象获取字节输入流，读取客户端发送图片
 *      4.创建File对象，绑定上传文件
 *      5.创建字节数出流，File对象所在的目录
 *      6.字节流读取图片，字节流将图片写入到目标文件内
 *      7.将上传成功信息反馈给客户端
 *      8.关闭资源
 *
 *
 * @author hl
 */
public class TcpServer {

    public static void loadImage(){
        try {
            //-----------------发送信息-----------------
            ServerSocket server = new ServerSocket(6000);
            Socket socket = server.accept();
            //获取客户端的连接读写，获取字节输入流
            InputStream input = socket.getInputStream();
            File upload = new File("E:\\Study\\Test\\upload");
            if (!upload.exists()) {
                upload.mkdirs();
            }
            //时间戳
            String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmdd"));
            //随机文件名
            String imageName = UUID.randomUUID().toString().replace("-","") +"_" + format +  ".jpg";
            FileOutputStream fos = new FileOutputStream(upload + "\\" + imageName);
            int len;
            byte[] bytes = new byte[1024];
            //读写字节数组，服务器端容易读不到-1，线程将阻塞，须在客户端关闭套接字socket.shutdownOutput()
            while ((len = input.read(bytes)) != -1) {
                fos.write(bytes,0,len);
                fos.flush();
            }

            //-----------------反馈信息-----------------
            socket.getOutputStream().write("图片上传成功".getBytes());

            fos.close();
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        loadImage();
    }
}