package com.hqyj.mc.StringDemo;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = s1+s2;
        String s4 = "ab";
        //equals,比较字符串数值是否相同
        boolean b1 = s3.equals(s4);
        System.out.println(b1);
        System.out.println("-----");
        //equalsIgnoreCase,比较字符串数值是否相同忽略大小写
        String s5 = "AB";
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
