package com.hl.magic.base.oop.character02;

/**
 * 特殊用法：
 * this可以用于调用本类构造函数，格式是this(参数列表),
 * 而且必须放在构造函数的第一行，所以this和super是不能共存的。
 *
 * @author hl
 */
public class PackageMan {
    /**
     * 名字
     */
    private String name;
    /**
     * 存款
     */
    private double money;
    /**
     * 妻子
     */
    private PackageWoman wife;

    public PackageMan(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    /**
     * 修改存钱数额
     */
    public void setMoney(Object o, double money) {
        if (o == this || o == this.wife) {
            this.money = money;
        } else {
            System.out.println("喂，110吗？有人抢钱！");
        }
    }

    public PackageWoman getWife() {
        return wife;
    }

    public void setWife(PackageWoman wife) {
        this.wife = wife;
    }

    /**
     * 结婚方法
     *
     * @return
     */
    public void marry(PackageWoman woman) {
        this.wife = woman;
    }
}
