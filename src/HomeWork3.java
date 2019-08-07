//  作业3：对三个数字进行从小到大的排序。个人补充：自己输入数字进行排序。
//  作业时间：2017.10.24

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int iTemp, i;
        int[] arrayInt = new int[3];
        for (i = 0; i < 3; i++) {
            System.out.println("输入第" + (i + 1) + "个数字");
            Scanner d = new Scanner(System.in);
            arrayInt[i] = d.nextInt();
        }

        if (arrayInt[0] > arrayInt[1]) {
            iTemp = arrayInt[0];
            arrayInt[0] = arrayInt[1];
            arrayInt[1] = iTemp;
        }
        if (arrayInt[1] > arrayInt[2]) {
            iTemp = arrayInt[1];
            arrayInt[1] = arrayInt[2];
            arrayInt[2] = iTemp;
        }
        if (arrayInt[0] > arrayInt[1]) {
            iTemp = arrayInt[0];
            arrayInt[0] = arrayInt[1];
            arrayInt[1] = iTemp;
        }
        System.out.println("三个数字从小到大排序为：");
        System.out.println(arrayInt[0] + " " + arrayInt[1] + " " + arrayInt[2]);
        System.out.println("三个数字从大到小排序为：");
        System.out.println(arrayInt[2] + " " + arrayInt[1] + " " + arrayInt[0]);
    }
}
