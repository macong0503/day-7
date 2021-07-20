package com.hqyj.mc.StringDemo;

        import java.util.Scanner;

public class StringWork01 {
    //键盘输入一个字符串，统计字符串中大小写字母数字字符的个数
    public static void main(String[] args) { ;
        System.out.print("请输入一个字符串：");
        String s = new String(new Scanner(System.in).next());
        System.out.println(s);
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c>='A'&& c<='Z'){
                sum1+=1;
            }
            else if (c>='a' && c<='z'){
                sum2+=1;
            }
            else if(c >='0'&& c <= '9'){
                sum3+=1;
            }
            else{
                sum4+=1;
            }
        }
        System.out.println("大写字母的个数："+sum1+"小写字母的个数："+sum2+"数字的个数："+sum3+"其他字符个数："+sum4);

    }
}
