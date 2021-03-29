package com.hl.magic.dpattern.dp4proxy.demo01;

/**
 * 客户来了，需要与Jobber01对话，但是Jobber01忙的要死，这个时候人事代理出场了。
 * 客户将和人事进行直接对话
 * 如果直接去掉中间代理环节，而Jobber01又忙的飞起，此次对话将失败告终。
 */
public class User {
    public static void main(String[] args){

        /**
         * 【第一回合】用户见不到Jobber01，只能找Proxy代理洽谈
         */
        Proxy proxy = new Proxy();
        proxy.provideGoods();
        proxy.providePrice();

        /**
         * 【第二回合】按照proxy提供的数据，聊天聊崩了，这时候人事部重新安排了一个代理人，
         * 客户这是和代理人proxy01进行洽谈
         */
        Jobber01 jobber01 = new Jobber01();
        Proxy proxy01 = new Proxy(jobber01);
        proxy01.provideGoods();
        proxy01.providePrice();

        /**
         * 【第三回合】按照jobber01提供的数据，聊天又给聊崩了
         * 这时Jobber02有洽谈意向，于是Proxy02代理人就代表Jobber02，再次与用户会谈
         */
        Jobber02 jobber02 = new Jobber02();
        //代理人转头接上供应商jobber02,继续以代理人的身份与客户洽谈
        Proxy proxy02 = new Proxy(jobber02);
        proxy02.provideGoods();
        proxy02.providePrice();
    }
}
