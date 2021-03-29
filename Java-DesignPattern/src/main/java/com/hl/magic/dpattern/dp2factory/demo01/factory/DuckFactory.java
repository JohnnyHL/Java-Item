package com.hl.magic.dpattern.dp2factory.demo01.factory;

import com.hl.magic.dpattern.dp2factory.demo01.ClassUtils;
import com.hl.magic.dpattern.dp2factory.demo01.service.IDuck;

import java.util.List;

/**
 * 小黄鸭工厂
 *
 * @author hl
 */
public class DuckFactory {

    public static IDuck createDuck(Class c){
        IDuck duck = null;
        try {
            duck = (IDuck)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定鸭子的颜色");
        } catch (IllegalAccessException e) {
            System.out.println("鸭子定义错误");
        } catch (ClassNotFoundException e) {
            System.out.println("指定的鸭子找不到");
        }
        return duck;
    }

    public static IDuck createDuck(){
        IDuck human = null;
        //获得有多少个实现类，多少个鸭子类
        List<Class> list = ClassUtils.getAllClassByInterface(IDuck.class);
        return  null;
    }
}
