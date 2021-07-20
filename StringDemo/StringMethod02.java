package com.hqyj.mc.StringDemo;

public class StringMethod02 {
    public static void main(String[] args) {
        //length():返回字符串长度
        String s1 = "abcdefghijklmn";
        int i = s1.length();
        System.out.println(i);
        System.out.println("---------");

        //concat(String str):将指定字符串拼接到字符串末尾
        String s2 = "abc";
        String s3 = "lkj";
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println("---------");

        //charAt():返回指定索引处的char值
        char c1 = s1.charAt(2);
        System.out.println(c1);
        System.out.println("---------");

        //indexOf():返回指定字符第一个索引值
        int a = s1.indexOf("a");
        System.out.println(a);
        System.out.println("---------");

        //substring():返回一个索引值之后的字符串，或者两个索引值之间的索引值（包前不包后）
        String s5 = s1.substring(10);
        System.out.println(s5);
        String s6 = s1.substring(5,10);
        System.out.println(s6);
    }
}
