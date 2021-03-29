package com.hl.magic.dpattern.dp4proxy.demo01;

/**
 * 代理人Proxy，
 * 作用：能够与被代理人(供应商)Jobber01，Jobber02......Jobber0N直接对话
 */
public class Proxy implements Conversation {

    /**
     * 引入代理接口
     */
   private Conversation conversation;

    /**
     * 无参构造方法
     * 默认时，Proxy做代理
     */
   public Proxy() {
        this.conversation = new Jobber01();
    }

    /**
     * 有参构造方法
     * 人事部可以根据Conversation接口(会话协商内容)的来安排任何一个代理人，只要是这一类型
     */
    public Proxy(Conversation kindWomen) {
        this.conversation = kindWomen;
    }

    /**
     * 代理人晓得Jobber需要他去干什么事情
     * 提供样品
     */
    @Override
    public void provideGoods() {
        this.conversation.provideGoods();
    }

    /**
     * 代理人晓得Jobber需要他去干什么事情
     * 提供样品报价
     */
    @Override
    public void providePrice() {
        this.conversation.providePrice();
    }
}
