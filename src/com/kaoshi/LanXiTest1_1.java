package com.kaoshi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
使用创建与调用方法的形式完成：
生成1-30之间的随机数10个，将它们存入一个ArrayList集合中，并使用迭代器进行遍历输出。
 */
public class LanXiTest1_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getNum();
        //System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            //iterator.remove();
            System.out.print(next + " ");
        }
    }

    public static ArrayList<Integer> getNum(){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        while (arrayList.size() < 10){
            int num = random.nextInt(30) + 1;
            if (!arrayList.contains(num)){
                arrayList.add(num);
                //arrayList.remove(num);
            }
        }
        return arrayList;
    }
}
