package com.hl.magic.dpattern.dp4proxy.demo01;

/**
 * 代理人和被代理人之间的会话接口
 *
 * 原理：代理人Boss01、Boss02与被代理人Proxy01、Proxy02之间进行会话的接口
 *      代理人不用直接出场干活，而是通过该会话接口让代理人知道被代理人需要做的事情，间接指挥代理人干活。
 *
 * 约定内容：提供样品、给出样品报价表
 */
public interface Conversation {

    /**
     * 提供样品
     */
    void provideGoods();

    /**
     * 提供样品报价表
     */
    void providePrice();
}
