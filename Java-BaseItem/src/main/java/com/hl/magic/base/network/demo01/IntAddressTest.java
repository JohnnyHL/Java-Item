package base.network.demo01;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Java网络编程
 *
 * [1]TCP/IP网络模型
 *  链路层：定义五路传输通道
 *  网络层：整个TCP/IP协议的核心，主要用于将传输的数据进行分组，将分组数据发送到目标计算机或网络中。
 *  传输层：使网络程序进行通信，在进行网络通信时，采用TCP协议，或UDP协议
 *  应用层：应用程序协议，http协议
 *
 * [2]互联网中的IP地址
 *      java.net.InetAddress
 *  静态方法：
 *      static InetAddress getLocalHost(); 返回本地主机。
 *      static InetAddress getByName(String hostName); 传递主机名，获取IP地址对象
 *      static InetAddress getByAddress(String host, byte[] addr)； 根据提供的主机名和IP地址创建InetAddress。
 *
 *  常规方法：
 *      String getHostName();   获取主机名
 *      String getHostAddress(); 获取主机IP地址
 *
 *[3]传输协议
 *  UDP协议：用户数据包协议，是面向无连接的通信协议
 *          数据传输时，数据的发送端和接收端不建立逻辑连接。彼此之间不会发送确认指令
 *          协议消耗小，通信效率高，常用于音频、视频和普通数据的传输，但是UDP面向无连接，不能保证数据传输的完整性
 *
 *  TCP协议：传输控制协议。面向连接的通信协议。
 *          即传输数据先在发送端建立逻辑，然后再传输数据，它提供了两台计算机之间可靠无差错的数据传输。
 *          客户端向浏览器端发送连接请求，每次连接的创建都需要经过三次握手。
 *
 *
 * @author hl
 */
public class IntAddressTest {

    @Test
    public void fun() throws UnknownHostException {

        //-----------------本机信息-----------------
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("============================================");
        System.out.println("[1]====>本地主机信息：" + localHost.toString());
        System.out.println("[1]====>本地主机的IP：" + localHost.getAddress());
        System.out.println("[1]====>本地主机名称：" + localHost.getHostName());
        System.out.println("[1]====>本地主机的IP：" + localHost.getHostAddress());
        System.out.println("[1]====>本地主机名称：" + localHost.getCanonicalHostName());
        System.out.println("============================================");

        //---------根据主机名获取本机信息-------------
        InetAddress byName = InetAddress.getByName("sd-PC");
        System.out.println("[2]====>获取主机名称：" + byName.getHostName());
        System.out.println("[2]====>获取主机名称：" + byName.getAddress());
        System.out.println("[2]====>获取主机名称：" + byName.getHostName());
        System.out.println("[2]====>获取主机地址：" + byName.getHostAddress());
        System.out.println("[2]====>获取主机名称：" + byName.getCanonicalHostName());
        System.out.println("============================================");

        //----------据主机名获取本机地址-------------
        InetAddress[] allByName = InetAddress.getAllByName("sd-PC");
        for (int i = 0; i < allByName.length; i++) {
            String address = allByName[i].getHostAddress();
            System.out.println("[3]====>本机的地址" +i + "：" +  address);
        }
        System.out.println("============================================");
    }
}