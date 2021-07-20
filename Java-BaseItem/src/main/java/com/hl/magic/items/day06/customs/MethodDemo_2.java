package com.hl.magic.items.day06.customs;

/**
 * 方法定义和使用的注意事项
 * 1. 方法不能定义在另一个方法的里面
 * 2. 写错方法名字
 * 3. 写错了参数列表
 * 4. 方法返回值是void,方法中可以省略return 不写
 * return 下面不能有代码
 * 5. 方法返回值类型,和return 后面数据类型必须匹配
 * 6. 方法重复定义问题
 * 7. 调用方法的时候,返回值是void, 不能写在输出语句中
 *
 * @author HL
 * @date 2021/3/23 21:51
 */
public class MethodDemo_2 {

    public static void main(String[] args) {
        int i = print();
        System.out.println(print());
    }

    public static int print() {

        return 1;
    }

}
