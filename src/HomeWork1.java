//  作业1：判断一个数字是否为奇数。个人补充：由自己输入数字，并判断奇偶性。
//  作业时间：2017.10.24

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int a;
//        int a, d, e, f, g, h;
//        d = e = f = g = h = 0;
//        e = g;
        System.out.println("请输入数字");
        Scanner b = new Scanner(System.in);
        a = b.nextInt();

        if (a == 0) {
            System.out.println("数字为0");
        } else if (a % 2 == 0) {
            System.out.println("数字为偶数");
        } else {
            System.out.println("数字为奇数");
        }

    }
}
