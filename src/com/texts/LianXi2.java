package com.texts;
/*
Array.toString()的作用是 将数组转换为字符串 它相当于一个函数 用的时候 括号里面写的是你想转换的数组的名字, 写的时候就是 Arrays.toString(数组名字);
模拟arrays.toString方法，如果int[] arr1数组为NULL时，返回一个“NULL”；如果int[] arr2数组没有数据时相当于该数组长度为0，返回"[]"，
注意返回的是字符串,所以不能再主方法中写。只能创建一个新的方法
如果int[] arr3数组数据为{1,2,3,4,5}时，输出[1, 2, 3, 4, 5]的字符串.
 */
public class LianXi2 {
    public static void main(String[] args) {
        //数组为null时，会出现空指针异常
        int[] arr1 = null;
        System.out.println("arr1数组为null时，返回：" + toString(arr1));
        //动态数组
        int[] arr2 = new int[0];
        System.out.println("arr2数组长度为0时，返回：" + toString(arr2));
        int[] arr3 = {1,2,3,4,5};
        System.out.println("arr3数组为{1,2,3,4,5}时，返回：" + toString(arr3));

        /*if (arr1 == null){
            return "NULL";
        }
        if (arr2.length == 0){
            return 0;
        }
        return 0;*/
    }
    //一个方法的返回值为String，才可以return 字符串
    public static String toString(int[] arr){
        //如果数组为null，则输出字符串NULL
        if (arr == null){
            return "NULL";
        }
        //方便知道数组的最大、最小索引。因为拼装时要用到顺序
        int Max = arr.length - 1;//最大索引
        //如果为-1，则数组的长度为0
        if (Max == -1){
            return "[]";
        }
        //创建一个拼装对象
        StringBuilder stringBuilder = new StringBuilder();
        //先写的，就是第一个追加上的内容
        stringBuilder.append("[");
        //for循环没有中间的条件后变成死循环，i只会自增同时也可以是数组的数据内容，如：1 2 3 4 5...
        for (int i =0;;i++){
            //使用拼装一个一个追加数组的数据内容
            stringBuilder.append(arr[i]);
            //如果i等于最大索引时，返回一个“]”，因为要返回一个字符串所以要.toString来返回，从而也跳出死循环
            if (i == Max){
                return stringBuilder.append("]").toString();
            }else {
                stringBuilder.append(", ");
            }
        }
    }
}
