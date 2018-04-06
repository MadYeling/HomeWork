//求任意数字阶乘
//2017年11月7日

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        int x, i;
        long sum = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("输入需要计算阶乘的数字：");
        x = sc.nextInt();

        for (i = 1; i <= x; i++) {
            sum *= i;
        }
        System.out.println(x + "的阶乘为：" + sum);

    }
}
