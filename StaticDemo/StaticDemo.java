package com.hqyj.mc.StaticDemo;

public class StaticDemo {

    //类变量：类中方法外，用static修饰的成员变量，叫做静态变量，存放在方法区的静态域中
    private static String compary;
    private String group;


    //

    public static String getCompary() {
        return compary;
    }

    public static void setCompary(String compary) {
        StaticDemo.compary = compary;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "StaticDemo{" +
                "group='" + group + '\'' +
                "compary='" + compary + '\'' +
                '}';
    }
}
