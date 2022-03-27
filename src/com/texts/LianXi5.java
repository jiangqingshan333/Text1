package com.texts;

import java.util.Scanner;

public class LianXi5 {
    public static void main(String[] args) {

        System.out.println("欢迎使用简单计算器系统");

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数字：");

        int num = scanner.nextInt();

        System.out.print("请输入运算符:");
        String str = scanner.next();

        System.out.print("请输入第二个数字：");
        int num2 = scanner.nextInt();

        switch ((String) str) {
            case "+" :
                System.out.println("运算结果：" + num + " + " + num2 + " = " + (num + num2));
                break;
            case "-" :
                System.out.println("运算结果：" + num + " - " + num2 + " = " + (num - num2));
                break;
            case "*" :
                System.out.println("运算结果：" + num + " * " + num2 + " = " + (num * num2));
                break;
            case "/" :
                System.out.println("运算结果：" + num + " / " + num2 + " = " + (num / num2));
                break;
            case "%" :
                System.out.println("运算结果：" + num + " % " + num2 + " = " + (num % num2));
                break;
        }
    }
}
