package com.kaoshi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class LanXiTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random random = new Random();
        while (arrayList.size() < 15) {
            int num = random.nextInt(30);
            arrayList.add(num);
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            int num1 = iterator.next();
            /*//定义一个计数器
            int count = 0;
            int num1 = iterator.next();
            for (int i = 0;i<arrayList.size();i++){
                if (arrayList.get(i) == num1) {
                    count++;
                }
            }
            if (count >= 2){
                iterator.remove();
            }
            count = 0;*/
            //判断ArrayList集合是否包含迭代器获取到的值，包含就删除（去重），失败了..
           if (arrayList.contains(num1)){
                //在对集合进行迭代的时候删除其中的元素
                iterator.remove();
            }
            System.out.print(num1 + " ");
        }
    }
}
