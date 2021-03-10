package com.hl.magic.day03;

import java.util.Random;

/**
 * Random 产生随机数
 *
 * java中已经有的引用类型  Random类,作用,产生随机数
 * 1. 导入包, Random类,在java.util文件夹
 * 2. 公式: 创建出Random类型的变量
 * 3. 变量. 调用Random类中的功能,产生随机数
 *
 * Random类,提供功能 , 名字  nextInt() 产生一个随机数, 结果是int类型
 * 出现随机数的范围, 在功能nextInt(写一个整数), 整数: 随机出来的范围
 * 随机数的范围在  0 - 指定的整数之间的随机数   nextInt(100)   0-99
 *
 * 产生浮点的随机数: 功能名字 nextDouble()  随机数的范围 0.0-1.0
 * 随机数: 伪随机数, 虚拟机根据人写好的一个算法,生成出来的
 * @author HL
 * @date 2021/3/3 21:34
 */
public class RandomDemo{

    public static void main(String[] args){
        Random random = new Random();

        int nextInt = random.nextInt();
        System.out.println("=====>不指定范围的随机整数：" + nextInt);

        //产生指定范围的随机数，范围：0-9，
        int nextInt1 = random.nextInt(10);
        System.out.println("=====>指定范围的随机整数：" + nextInt1);

        double nextDouble = random.nextDouble();
        System.out.println("=====>随机产生的小数：" + nextDouble);

    }
}