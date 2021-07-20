package com.hqyj.mc.MathDemo;

public class MathText {
    //请使用Math相关的API，计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个
    public void MathDemo(){
        int count1 = 0;
        for (double i = Math.ceil(-10.8); i <=Math.floor(5.9) ; i++) {
            if (Math.abs(i)>6 || Math.abs(i) <2.1){
                count1++;
            }
        }
        System.out.println(count1);
    }

    public static void main(String[] args) {
        MathText m = new MathText();
        m.MathDemo();
    }
}
