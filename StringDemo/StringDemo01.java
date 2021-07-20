package com.hqyj.mc.StringDemo;

public class StringDemo01 {
    public static void main(String[] args) {
        //使用以下格式定义的字符串，存放在字符串常量池中，一个字符串只有一个
        String a = "abc";
        //a = a + "cde";
        String b = "abc";
        //因为String对象是不可变的，所以他们可以共享
        System.out.println(a == b);//true，地址一样
        //通过一个字符串
        char[] chars = {'a','b','c'};
        //创建对象
        String s = new String(chars);
        System.out.println(s == a);
    }
}
