package com.hl.magic.dpattern.dp4proxy.jdkproxy.demo1;

/**
 * @author hl
 * @date 2021/3/25 11:32
 */
public class JdkProxyDemo1Test {
    public static void main(String[] args) {
        JdkProxyUtils jdkProxy = new JdkProxyUtils();
        //声明代理对象HelloWorld proxy
        HelloWorld proxy = (HelloWorld) jdkProxy.bind(new HelloWorldImpl());
        proxy.coding();
    }
}
