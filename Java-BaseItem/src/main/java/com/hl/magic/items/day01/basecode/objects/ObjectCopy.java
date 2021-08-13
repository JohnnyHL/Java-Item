package com.hl.magic.items.day01.basecode.objects;

/**
 * 对象的复制
 * 【1】clone方法
 *
 * @author Administrator
 */
public class ObjectCopy {

    public static void testClone(){
        try {
            //new一个Person对象出来
            Person01 person = new Person01("xiaoming",12);
            //克隆一个Person对象出来
            Person01 clone = (Person01) person.clone();

            System.out.println(clone.getName()==person.getName() ? "是同一个对象啊怎么办":"不是同一个");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        testClone();
    }
}
