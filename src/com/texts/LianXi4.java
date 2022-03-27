package com.texts;

import java.util.Scanner;
/*
该代码编写不简洁严谨
 */
public class LianXi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请选择天气状况，有效数字为1（下雨）与2（晴天）：");
        int i = scanner.nextInt();

        if (i != 1 && i != 2){
            System.out.println("输入无效！");
        }else if (i == 1){
            System.out.println("天气状况为雨天，出门请带雨伞！");
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("请选择您的性别，有效数字为1（男）与2（女）：");
            int i1 = scanner1.nextInt();
            if (i1 != 1 && i1 != 2){
                System.out.println("输入无效！");
            }else if (i1 == 1){
                System.out.println("您的性别为男，出门请带大黑伞！");
            }else if (i1 == 2){
                System.out.println("您的性别为女，出门请带小花伞！");
            }
        }else if (i == 2){
            System.out.println("天气状况为晴天！");
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("请输出天气温度：");
            int i2 = scanner2.nextInt();
            if (i2 > 30){
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("请选择您的性别，有效数字为1（男）与2（女）：");
                int i3 = scanner3.nextInt();
                if (i3 != 1 && i3 != 2){
                    System.out.println("输入无效！");
                }else if (i3 == 1){
                    System.out.println("出门请戴墨镜！");
                }else if (i3 == 2){
                    System.out.println("出门请擦防晒霜！");
                }
            }else {
                System.out.println("出门无需带伞！");
            }
        }
    }
}
