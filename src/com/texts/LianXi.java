package com.texts;

import java.util.ArrayList;
import java.util.Random;

public class LianXi {
    public static void main(String[] args) {
        //创建一个ArrayList集合
        ArrayList<Integer> arrayList = new ArrayList<>();

        //创建一个生成随机数对象
        Random random = new Random();

        int num1 = 123;

        //在这while循环比for循环简单
        //注意ArrayList集合没有length属性，但有size
        while (arrayList.size() < 10) {
            int num = random.nextInt(100);

            //如果ArrayList集合的元素不包含生成随机的数字就放入ArrayList集合中
            if (!arrayList.contains(num)){

                arrayList.add(num);

            }
        }
        System.out.println(arrayList);

        System.out.println(num1);

    }
}
