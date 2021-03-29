package com.hl.magic.dpattern.dp4proxy.demo01;

/**
 * 被代理人Jobber02，它和被代理人Jobber01可能是竞争关系
 */
public class Jobber02 implements Conversation {

    @Override
    public void provideGoods() {
        System.out.println("Jobber02提供样品001");
    }

    @Override
    public void providePrice() {
        System.out.println("Jobber02提供001的报价表");
    }
}