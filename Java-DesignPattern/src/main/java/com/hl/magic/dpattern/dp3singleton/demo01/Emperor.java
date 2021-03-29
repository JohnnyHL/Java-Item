package com.hl.magic.dpattern.dp3singleton.demo01;

/**
 * 【单例模式】
 * 一个朝廷只能有一个皇帝，这个皇帝必须是单一、独一份，独苗苗、唯一的、特么的真龙天子，而且还不能是山寨的。
 * 有皇上了，就得有大臣；
 * 大臣可以是N多个，天天上朝参拜黄上，而且昨天参拜的、今天参拜的还必须是一个人；
 * 大臣参拜完，磕完头，抬头一看，还是昨天那个皇上，单例模式，绝对的单例模式。
 *
 * @author hl
 */
public class Emperor {
    /**
     * 先定义一个皇上放这儿，然后给皇上起个名字
     */
    private static Emperor emperor = null;

    private Emperor() {
        //世俗和道德约束，目的就是不让产生第二个皇帝
    }

    public static Emperor getInstance(){
        /**
         * 如果皇上还没有定义，就造一个出来
         */
        if (emperor == null) {
            emperor= new Emperor();
        }
        return emperor;
    }
    /**
     * 皇上叫啥名字
     */
    public void emperorInfo(){
        System.out.println("皇帝：总有刁民想害朕");
    }
}
