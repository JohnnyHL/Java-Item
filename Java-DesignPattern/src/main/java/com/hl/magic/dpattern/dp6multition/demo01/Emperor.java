package com.hl.magic.dpattern.dp6multition.demo01;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("all")
public class Emperor {
    /**
     * 最多只能有2个皇帝
     */
    private static int maxNumOfEmperor = 2;
    /**
     * 定义皇帝的名字
     */
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    /**
     * 装皇帝的列表
     */
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    /**
     * 正在被人叩拜的是那个皇帝
     */
    private static int countNumOfEmperor = 0;

    /**
     * 先产出2皇帝
     */
    static{

        /**
         *  把所有皇帝都产生出来
         */
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i+1) + "帝"));
        }
    }

    /**
     * 约束只能产生一个皇帝
     */
    private Emperor() {
    }

    private Emperor(String info){
        emperorList.add(info);
    }
    public static Emperor getInstance(){
        Random random = new Random();
        /**
         * 随机产出一个皇帝，只要是个领袖级即可。
         */
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    /**
     * 皇帝的个人信息
     */
    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}
