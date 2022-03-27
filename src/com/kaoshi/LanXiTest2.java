package com.kaoshi;

import java.util.ArrayList;

/*
使用方法的形式来实现
 */
public class LanXiTest2 {
    public static void main(String[] args) {
       String[] arr1 = null;
       System.out.println(getString(arr1));//空指针异常
       String[] arr2 = {};
       System.out.println(getString(arr2));
       String[] arr3 = {"1","2","3","4"};
       System.out.println(getString(arr3));
    }
    /*
    实现的方法
     */
    public static String getString(String[] arr){
        if (arr == null){
            return "NULL";
        }
        if (arr.length == 0){
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0;;i++){
            stringBuilder.append(arr[i]);
            if (i == arr.length - 1){
                return stringBuilder.append("]").toString();
            }else {
                stringBuilder.append(", ");
            }
        }
    }
}
