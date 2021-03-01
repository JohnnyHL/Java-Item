package com.hl.magic.base.keywords.statics;

/**
 * 静态的注意事项：
 *【1】在静态方法中不能调用非静态变量。
 *      生命周期导致静态优先于非静态存在于内存中，即静态-前人(先人)，非静态-后人
 *     静态方法中不能写this、super
 *
 *【2】static修饰的应用场景 静态的声明周期较长，随着类的消失而消失。 static修饰成员变量、成员方法
 *     成员变量加static,根据具体事务，具体分析
 *     a.定义事物时，分析多个事物之间是否有共性的数据。 此时将共性的数据定义为静态的成员变量
 *     b.成员变量加static，跟着变量 如果方法没有调用过非静态成员，将方法定义为静态即可
 *
 *【3】StringBuilder类型转换为String类型
 *		StringBuilder a = new StringBuilder("abc");
 *		String b = "" + a;
 *
 *【4】String类型转换为StringBuilder类型
 *  	StringBuilder a = new StringBuilder(b);
 *
 * @author hl
 * @date 2020/4/3 19:29
 */
public class Student {

    private static String name;
    private static int age;

    public static void function() {
        System.out.println(name + "," + age);
    }

    public void show() {
        System.out.println(name + "," + age);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.show();
        //通过类名调用Person类中的静态方法。
        Personce.run();
    }
}
