//输出一个菱形
//2017年11月16日
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        int i, j, o, q, w, e, r;

        Scanner sc = new Scanner(System.in);
        System.out.print("输入行数：");
        r = sc.nextInt();

        for (i = 1; i <= r; i++) {
            if (i % 2 != 0) {
                for (o = (r - i) / 2; o >= 1; o--) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

        for (q = (r - 2); q >= 1; q--) {
            if (q % 2 != 0) {
                for (w = 1; w <= (r - q) / 2; w++) {
                    System.out.print(" ");
                }
                for (e = q; e >= 1; e--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
