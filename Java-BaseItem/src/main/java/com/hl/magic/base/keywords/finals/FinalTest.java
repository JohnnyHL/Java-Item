package com.hl.magic.base.keywords.finals;

/**
 * @author hl
 * @date 2020/4/3 19:28
 */
public class FinalTest {
    public static void main(String[] args) {
        Finals f = new Finals();
        f.show();

        SubClassDemo sub = new SubClassDemo();
        //子类调用 重写父类的普通方法
        sub.function();

        //被final修饰后，常量，一次赋值，终身不变
        final int a = 10;
        System.out.println("a=" + a);

        //fianl修饰引用变量
        @SuppressWarnings("unused")
        final SubClassDemo sub2 = new SubClassDemo();
    }
}
