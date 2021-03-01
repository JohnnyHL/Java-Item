package com.hl.magic.base.keywords.finals;

/**
 * 子类
 * @author hl
 * @date 2020/4/3 19:28
 */
public class SubClassDemo extends Finals {

    //父类的方法是final修饰的时候，子类是不能对其重写的
//	public void show(){
//
//	}

    @Override
    public void function() {
        System.out.println("子类重写父类的普通方法");
    }
}
