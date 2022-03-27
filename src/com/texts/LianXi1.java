package com.texts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class LianXi1 {
    //主方法
    public static void main(String[] args) {
        //调用创建的方法，给方法的返回值是一个ArrayList集合所以调用的格式为：返回的参数 参数名字 = 方法名()
        ArrayList<Integer> arrayList = getNum();
        //直接输出
        //System.out.println(list);
        /*
        使用迭代器输出
            1.创建一个迭代器对象对ArrayList集合进行遍历
            2.迭代器用于while循环
         */
        Iterator<Integer> iterator = arrayList.iterator();
        //使用hasNext()检查序列中是否还有元素。
        while (iterator.hasNext()){
            //使用next()获得序列中的下一个元素,第一次调用Iterator的next()方法时，它返回序列的第一个元素.
            //注意还需要赋值给变量，否则会缩减一半的数据 = =||
            int num1 = iterator.next();
            System.out.print(num1 + " ");
        }

    }
    /*
    使用方法实现LianXi的实例
    命名方法时不能使用拼音，要是用正确的单词
     */
    public static ArrayList<Integer> getNum(){
        //创建一个ArrayList集合来存放随机数,注意新建一个对象时必须要new！！！
        ArrayList<Integer> arrayList = new  ArrayList<Integer>();
        //创建一个生成随机数对象
        Random random = new Random();
        //使用while循环来把随机数放入到ArrayList集合中
        while (arrayList.size() < 20){
            //将生成随机数对象生成的随机整数赋值给整形变量num
            int num = random.nextInt(100);
            //判断随机数是否重复，重复的随机数就不能放入到ArrayList集合中
            if (!arrayList.contains(num)) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }
}
