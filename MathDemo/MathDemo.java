package com.hqyj.mc.MathDemo;

public class MathDemo {
    public static void main(String[] args) {
        //Math.abs()，返回绝对值
        int a = -51;
        int a1 = Math.abs(a);
        System.out.println(a1);
        System.out.println("-------------");

        //Math.ceil(),返回大于等于参数的小的整数
        double b = -3.5;
        double b1 = Math.ceil(b);
        System.out.println(b1);
        System.out.println("-------------");

        //Math.floor(),返回小于等于参数大的整数
        double c = -3.5;
        double c1 = Math.floor(c);
        System.out.println(c1);
        System.out.println("-------------");

        //Math.round(),返回接近参数的 long 四舍五入
        double d1 = 3.5;
        double d2 = 3.4;
        long d11 = Math.round(d1);
        long d22 = Math.round(d2);
        System.out.println(d11);
        System.out.println(d22);

    }
}
