package com.hl.magic.base.basecode.objects;

/**
 *
 * @author Administrator
 */
public class OverloadTest {

    public static void run(){
        System.out.println("无参数的重载方法");

    }
    public static void run(String name,int age){
        System.out.println("有参数的重载方法：" + name + ", 他已经" + age + "岁了");
    }

   public static void main(String[] args){
        run("xiaoming" ,12);
   }
}
