package com.hqyj.mc.StringDemo;

public class StringDemo02 {
    public static void main(String[] args) {
        //第一种，使用String s = new String(), 创建一个空字符串
        String s1 = new String();
        System.out.println(s1);

        //第二种，通过传入一个字符数组创建字符串
        char[] chars = {'a','a','a'};
        String s2 = new String(chars);
        System.out.println(s2);

        //第三种，通过传入一个字节数组创建字符串
        byte[] bytes = {98,99,100};
        String s3 = new String(bytes);
        System.out.println(s3);

        //第四种，直接创建
        String s4 = "abcd";
        System.out.println(s4);

        String s5 = "abc";
        String s6 = "a"+"bc";
        String s7 = "a";
        String s8 = "bc" + s7;
        System.out.println(s5 == s6);//ture
        System.out.println(s5 == s8);//false

    }


}
