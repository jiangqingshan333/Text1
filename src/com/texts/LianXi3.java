package com.texts;

import java.util.ArrayList;
import java.util.Iterator;

public class LianXi3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//一般在主方法定义的话，其他方法就不用了定义了。
        list.add("123132adsadf12");
        list.add("1232adsadf");
        list.add("adsadf");

        getList(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            for (int i = 0;i<=9;i++){
                //直接包含i是行不通因为数据类型不兼容，i是整形数据，连接一个“”就变成字符串了
                if (next.contains(i + "")){
                    iterator.remove();
                    //如果不跳出循环则出错
                    break;
                }
            }
        }
        //System.out.println(list);
        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }*/
    }

    public static void getList(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        String str = "\\w*\\d+\\w*";
        while (it.hasNext()){
            String next = it.next();
            if (next.matches(str)){
                it.remove();
            }
        }
    }
}
