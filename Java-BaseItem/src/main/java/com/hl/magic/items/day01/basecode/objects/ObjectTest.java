package com.hl.magic.items.day01.basecode.objects;

/**
 * 万物皆对象
 *
 * @author Administrator
 */
public class ObjectTest {

    /**
     * Integer测试
     */
    public static void run1() {
        Integer i = 10;
        Integer j = 10;

        System.out.println(i.equals(j));

        Integer a = 500;
        Integer b = 500;
        System.out.println(a.equals(b));

    }

    /**
     * String测试
     */
    public static void run2() {
        String s1 = "abc";
        String s2 = s1;
        String s3 = "abc";
        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1==s3:" + (s1 == s3));
        System.out.println("s2==s3:" + (s2 == s3));
        s1 = "bcdc";

        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1==s3:" + (s1 == s3));
        System.out.println("s2==s3:" + (s2 == s3));
    }

    /**
     * String测试
     * String类是不可改变的，所以String对象也是不可改变的，每次我们给String对象赋值都相当于执行了一次new String()
     * 然后让这个变量指向这个新对象，而不是在原来的对象上修改。
     */
    public static void run3() {
        String s1 = new String("abc");
        String s2 = s1;
        String s3 = new String("abc");
        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1==s3:" + (s1 == s3));
        System.out.println("s2==s3:" + (s2 == s3));
        s1 = "abc";
        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1==s3:" + (s1 == s3));
        System.out.println("s2==s3:" + (s2 == s3));

    }

    /**
     * 值传递和引用传递的战争
     * 最后改变的仅仅是形参，实参未改变
     * java值传递，实际上传递的是副本，不管是变量还是引用。
     * 所以不要期待把变量传递给一个方法来改变变量的本身
     */
    public static void run4(){
        int a = 2;
        int b = 3;
        swap(a,b);
        System.out.println("a = " + a + "; b = " + b);
    }
    private static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }

    /**
     * 对象的强引用、软引用、弱引用和虚引用
     */
    public static void run5(){

    }

    public static void main(String[] args) {
//        run1();
//        run2();
//        run3();
        run4();
    }
}
