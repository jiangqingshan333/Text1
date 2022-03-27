package com.texts;

public class LianXi2_1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(toString(arr1));
    }
    //该方法的返回值是String字符串，所需的参数是一个数组，这个参数数组是可以在主方法中自行定义（反正是一个数组就行）
    public static String toString(int[] arr){
        if (arr == null){
            return "NULL";
        }
        if (arr.length == 0){
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        //for循环删除条件变成死循环后本来要写的返回语句，竟然不需要写了？！...，（一脸懵逼）
        //个人理解：因为for循环变成死循环后代码运行到这里则会一直在死循环这里一直跑，所以下面的返回语句就无法执行，所以就不需要了....应该是这样吧
        for (int i = 0;;i++){
            stringBuilder.append(arr[i]);
            if (i == arr.length - 1){
                //因为整个方法中的返回值是字符串，所以要.toString转化为字符串后来返回，从而也跳出死循环
                return stringBuilder.append("]").toString();
            }else {
                stringBuilder.append(", ");
            }
        }
        /*return arr.toString();*/
    }
}
