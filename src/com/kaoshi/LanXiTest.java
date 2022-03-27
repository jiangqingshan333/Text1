package com.kaoshi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
不使用创建与调用方法的形式完成
生成1-30之间的随机数10个，将它们存入一个ArrayList集合中，并输出。
 */
public class LanXiTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        while (arrayList.size() < 10) {
            int num = random.nextInt(30) + 1;
            if (!arrayList.contains(num)) {
                arrayList.add(num);
            }
        }
        //System.out.println(arrayList);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            int shuzi = iterator.next();
            System.out.print(shuzi + " ");
        }
    }
}
