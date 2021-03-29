package com.hl.magic.dpattern.dp4proxy.demo01;

/**
 * 供应商Jobber01(被代理人，也就是客户想找的那个目标对象，但是该目标对象不会直接与客户对话)
 * 当用户User来咨询的时候，被代理人只需向代理人提供的内容：提供样品、给出样品报价表
 */
public class Jobber01 implements Conversation {

    @Override
    public void provideGoods() {
        System.out.println("Jobber01提供样品001");
    }

    @Override
    public void providePrice() {
        System.out.println("Jobber01给出001的报价表");
    }
}
