package com.test;

/**
首先你已经想象出一个”人“对象，也就是Ren.class,因为Ren.java运行会自动生成一个字节码文件也就是.class文件
那么你想调用该对象的属性时，就必须实例化对象，怎么实例化对象？使用new运算符，在new后面的都是一个对象也就是把类变成对象
注意相关联的两个.java文件必须放在同一文件夹中，否则调用不了
 */
public class ShiTiTest {
    public static void main(String[] args) {
        //将new出来的对象赋值给ren变量，为什么数据类型为Ren？想想String，因为String也是一个类，是sun公司提供给我们用的
        //定义字符串的时候是String(类名) name(变量);故Ren类 ren(变量)
        //还有ren保存的是一个Ren对象的内存地址，因为new Ren().num太麻烦了，所以赋值给一个变量直接变量.num就完事了。
        //new Ren().num = 2;
        Ren ren = new Ren();
        ren.num = 10;
        ren.name = "张三";
        ren.sex = false;

        System.out.println("编号为：" + ren.num + " 姓名为：" + ren.name + " 性别为：" + ren.sex + ".");

        //System.out.println(ShiTiTest.sum(10,20));
        ShiTiTest.sum(10,20);

    }
    /**
     * 这是一个sum方法
     */
    public static int sum(int a,int b){
       int num = a + b;
        System.out.println(a + " + " + b + " = " + num);
        return num;
    }
}
