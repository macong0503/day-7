package com.hqyj.mc.StaticDemo;

public class Text {
    public static void main(String[] args) {

        //static修饰的方法和变量，可以直接类名.方法名/变量名
        StaticDemo.setCompary("华清远见");
        System.out.println(StaticDemo.getCompary());
        System.out.println("---------------");

        //创建一个对象
        StaticDemo s = new StaticDemo();
        s.setGroup("007");
        s.setCompary("华清远见成都分公司");
        System.out.println(s);//StaticDemo{group='007'compary='华清远见成都分公司'}
        System.out.println("---------------");

        StaticDemo s2 = new StaticDemo();
        s2.setGroup("008");
        s2.setCompary("java部门");
        System.out.println(s2);//StaticDemo{group='008'compary='java部门'}
        System.out.println("---------------");

        System.out.println(s);//StaticDemo{group='007'compary='java部门'}
    }
}
