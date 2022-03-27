package com.texts;

public class LianXi6 {
    /*
        九九乘法表可看作9行9列的排序
        用外层for循环9次不换行则能出现9行的行头，故i = 9
        第一行有一个算式、第二行有两个算式，以此类推第九行有九个算式，故内层for循环的j不得超过9也就是不得超过i
        最后得知行头 * 行数 = i * j，输出一行完后才能换行，所以换行不得在内层循环中否则行就变成了列


     */
    public static void main(String[] args) {
        for (int i=1;i<=9;i++){

           for (int j=1;j<=i;j++){
               int num = i * j;
               System.out.print(i + " * " + j + " = " + num + " " + " ");
           }
           System.out.println();
        }
    }
}
