package com.test;
/*
完成从学生类查找到电脑类
 */
public class ShiTiTest01 {
    public static void main(String[] args) {
        //再有Student.class的前提(在javac编译Student.java后Student.class就会自动生成)，就可创建(new)出Student()对象（实例化对象），
        //也只有这样才能访问到Student.class的属性
        Student student = new Student();
        //修改Student.class的studentName的属性值为"张三"，如果不修改系统自动赋予默认值
        //byte数据类型的默认值为 0
        //short数据类型的默认值为 0
        //int数据类型的默认值为 0
        //long数据类型的默认值为 0
        //float数据类型的默认值为 0.0
        //double数据类型的默认值为 0.0
        //boolean数据类型的默认值为 false
        //char数据类型的默认值为 \u0000
        //String数据类型的默认值为 null
        student.studentName = "张三";
        //创建一个笔记本电脑对象
        Computer computer = new Computer();
        //修改笔记本对象的实例变量的值为"华硕"
        computer.brand = "华硕";

        //因为Student.class(Student对象)中含有Computer类型的变量(也可以看成在引用Computer类)而该变量又是保存了Computer对象的内存地址
        //故可以通过Student对象的实例变量来调用Computer对象的实例变量(对象的变量)
        student.computer = computer;

        //System.out.println(student.studentName + "学生，使用了" + computer.brand + "笔记本电脑");
        System.out.println(student.studentName + "学生，使用了" + student.computer.brand + "笔记本电脑");
    }
}
