//求任意数字阶乘
//2017年11月7日

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        int x, i;
        long num;
        Scanner sc = new Scanner(System.in);

        System.out.println("输入需要计算阶乘的数字：");
        x = sc.nextInt();

        num = sum(x);

        System.out.println(x + "的阶乘为：" + num);

    }

    private static long sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * sum(num - 1);
        }
    }
}
