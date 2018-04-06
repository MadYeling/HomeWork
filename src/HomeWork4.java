//输入年份和月份，判断天数
//作业时间：2017年10月31日

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int month;
        int year;
        boolean re = false;
//抓取年份、月份
        System.out.println("输入一个年份：");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        System.out.println("输入一个月份：");
        Scanner sc1 = new Scanner(System.in);
        month = sc1.nextInt();
//判断年份是否为闰年
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("该年为闰年");
                re = true;
            } else {
                System.out.println("该年为平年");
            }
        } else if (year % 4 == 0) {
            System.out.println("该年为闰年");
            re = true;
        } else {
            System.out.println("该年为平年");
        }
//判断月份
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("该月有31天");
                break;
            case 2:
                if (re) {
                    System.out.println("该月有29天");
                } else {
                    System.out.println("该月有28天");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("该月有30天");
                break;
            default:
                System.out.println("你家日历上有" + month + "月的？皮！");
        }
    }
}
