package base.network.demo02;

import org.junit.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author Administrator
 */
public class MyServerTest {

    @Test
    public void fun(){
        try {

            ServerSocket server = new ServerSocket(8080);
            Socket socket = server.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}