//输入10个100内的数字，统计有多少偶数，多少奇数，输出统计数。
//2017年11月7日
import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        int i, j, k, l, m;
        k = l = m = 0;
        Scanner sc = new Scanner(System.in);

        for (i = 1; i <= 10; i++) {
            System.out.print("输入10个数字中的第" + i + "个：");
            j = sc.nextInt();

            if (j == 0) {
                m++;
            } else if (j % 2 == 0) {
                k++;
            } else {
                l++;
            }

        }

        System.out.print("输入的数字中有" + k + "个偶数，" + l + "个奇数，" + m + "个0。");

    }
}
