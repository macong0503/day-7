package com.hqyj.mc.StringDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethod03 {
    public static void main(String[] args) {
        String s1 = "hello";
        //toCharArray():将字符串转换为字符数组
        char[] c = s1.toCharArray();
        System.out.println(c);
        System.out.println("--------");
        //getBytes():把一个字符串转换为字节数组
        byte[] bytes = s1.getBytes();
        System.out.println(bytes);
        System.out.println(Arrays.toString(bytes));
        System.out.println("--------");
        //replace()，将什么替换成什么
        String s2 = s1.replace("o","ollll");
        System.out.println(s2);
        //split()分割
        String s3 = "h1*he*hh";
        String[] s4 = s3.split("\\*");
        System.out.println(Arrays.toString(s4));
        System.out.println(Arrays.toString(s3.split("h")));
    }
}
