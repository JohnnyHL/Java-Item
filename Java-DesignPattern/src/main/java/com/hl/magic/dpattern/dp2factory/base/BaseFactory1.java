package com.hl.magic.dpattern.dp2factory.base;

import com.hl.magic.dpattern.dp2factory.demo01.factory.DuckFactory;
import com.hl.magic.dpattern.dp2factory.demo01.service.IDuck;
import com.hl.magic.dpattern.dp2factory.demo01.service.impl.BlackDuck;
import com.hl.magic.dpattern.dp2factory.demo01.service.impl.RoastDuck;
import com.hl.magic.dpattern.dp2factory.demo01.service.impl.YellowDuck;

/**
 * @author hl
 * @date 2021/3/26 14:40
 */
public class BaseFactory1 {
    public static void main(String[] args) {

        System.out.println("================【1】================");
        IDuck yellowDuck = DuckFactory.createDuck(YellowDuck.class);
        yellowDuck.swim();
        yellowDuck.walk();
        yellowDuck.forage();


        System.out.println("================【2】================");
        IDuck blackDuck = DuckFactory.createDuck(BlackDuck.class);
        blackDuck.swim();
        blackDuck.walk();
        blackDuck.forage();

        System.out.println("================【3】================");
        IDuck roastDuck = DuckFactory.createDuck(RoastDuck.class);
        roastDuck.swim();
        roastDuck.walk();
        roastDuck.forage();
    }
}
