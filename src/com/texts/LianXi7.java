package com.texts;

public class LianXi7 {
    //实现4 + 3 + 2 + 1的和
    //该递归方式可以实现某个数的阶乘
    public static void main(String[] args) {
        int n = 4;
        int sumInt = sum(n);
        System.out.println(sumInt);
    }

    public static int sum(int n) {
        //因为是要求4 + 3 + 2 + 1，故n==1为最小值
        if (n==1){
            return 1;
        }
        //n=4, 第一次调用sum = 4 + sum(3)，此时sum(3) = 3 + sum(2);所以第二次调用后sum = 4 + 3 + sum(2)，此时sum(2)= 2 + sum(1)
        //第三次调用 4 + 3 + 2 + sum(1),而sum(1)则等于1;此刻sum（1）= 1 + sum(-1),但我们不需要，所以sum（1）就直接返回1就行了
        //注意从第二次调用sum()方法后就只有sum()方法里面的n变化了,但还是有一个n与sum(n-1)相加
        return n + sum(n - 1);
    }
}
