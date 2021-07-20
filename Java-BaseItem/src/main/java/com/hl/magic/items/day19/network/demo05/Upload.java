package com.hl.magic.items.day19.network.demo05;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

/**
 * 每个客户端就相当于一个线程，
 * 在服务端实现多线程Runnable接口，实现run()方法。 然后可以分配类的实例，在创建线程时作为参数传递，并启动。
 *
 * @author HL
 */
public class Upload implements Runnable {

    private Socket socket;

    public Upload(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //-----------------发送信息-----------------
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
