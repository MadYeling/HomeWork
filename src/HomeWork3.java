//  作业3：对三个数字进行从小到大的排序。个人补充：自己输入数字进行排序。
//  作业时间：2017.10.24

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int iTemp, i;
        int[] a = new int[3];
        for (i = 0; i < 3; i++) {
            System.out.println("输入第" + (i + 1) + "个数字");
            Scanner d = new Scanner(System.in);
            a[i] = d.nextInt();
        }

        if (a[0] > a[1]) {
            iTemp = a[0];
            a[0] = a[1];
            a[1] = iTemp;
        }
        if (a[1] > a[2]) {
            iTemp = a[1];
            a[1] = a[2];
            a[2] = iTemp;
        }
        if (a[0] > a[1]) {
            iTemp = a[0];
            a[0] = a[1];
            a[1] = iTemp;
        }
        System.out.println("三个数字从小到大排序为：");
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        System.out.println("三个数字从大到小排序为：");
        System.out.println(a[2] + " " + a[1] + " " + a[0]);
    }
}
