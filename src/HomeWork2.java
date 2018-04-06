//  作业2：判断一个字母是否为小写字母。个人补充：自己输入字母，并判断输入的是否为字母，如果是字母，判断大小写。
//  作业时间：2017.10.24

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        char ch;
        System.out.println("请输入一个字母");
        Scanner a = new Scanner(System.in);
        ch = a.nextLine().charAt(0);

        if (ch >= 'A' & ch <= 'z') {
            if (ch <= 'Z') {
                System.out.println("字母为大写字母");
            } else if (ch >= 'a') {
                System.out.println("字母为小写字母");
            } else {
                System.out.println("你输入的不是字母");
            }
        } else {
            System.out.println("你输入的不是字母");
        }

    }
}
