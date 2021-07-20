package com.hqyj.mc.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    //请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
    public void Demo(){
        System.out.print("请输入字符串：");
        String strings = new String(new Scanner(System.in).next());

        char[] chars = strings.toCharArray();
        Arrays.sort(chars);
        //System.out.println(chars);
        for (int i = chars.length-1; i >= 0 ; i--) {
            System.out.print(chars[i] + " ");
        }
    }

}
