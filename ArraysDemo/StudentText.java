package com.hqyj.mc.ArraysDemo;

import java.util.Arrays;

public class StudentText {
    public static void main(String[] args) {

        Student st = new Student();
        st.setName("隔壁老王");
        st.setAge(60);
        String name = st.getName();
        int age = st.getAge();
        System.out.println(name + age);

        //有参构造
        Student stu = new Student("隔壁老刘",61);
        String name1 = stu.getName();
        int age1 = stu.getAge();
        System.out.println(name1+age1);

        //把学生对象存入数组中
        Student[] students = new Student[2];
        students[0]=st;
        students[1]=stu;
        System.out.println(students);//[Lcom.hqyj.mc.ArraysDemo.Student;@1b6d3586
        //使用Arrays.toString(),返回数组里面的值
        String str = Arrays.toString(students);
        System.out.println(Arrays.toString(students));//[Student{name='隔壁老王', age=60}, Student{name='隔壁老刘', age=61}]
        System.out.println(students.toString());//[Lcom.hqyj.mc.ArraysDemo.Student;@1b6d3586

        //Array.sort
        int[] arr = new int[]{5,9,3,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}