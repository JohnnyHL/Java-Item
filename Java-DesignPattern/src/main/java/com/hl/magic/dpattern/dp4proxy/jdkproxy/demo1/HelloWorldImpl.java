package com.hl.magic.dpattern.dp4proxy.jdkproxy.demo1;

/**
 * 真实对象
 *
 * @author hl
 * @date 2021/3/25 11:12
 */
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void coding() {
        System.out.println("研发人员DevA正在写代码");
    }
}
