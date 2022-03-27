package com.test;
/*
类不能直接赋值，方法才可以
 */
public class Ren {
    //编号
    int num;
    //性别
    boolean sex;
    //姓名
    String name;

    //构造方法支持重载，因为在一个类中编写多个构造方法后，这n多个构造方法显然已经构成方法重载
    //注意只要调用构造方法，则比创建对象
    //无参构造方法
    public Ren(){
        //构造方法体
    }
    //有参构造方法
    public Ren(int i){
        //构造方法体
    }
}
