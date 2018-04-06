//九九乘法表
//2017年11月16日
public class HomeWork9 {
    public static void main(String[] args) {
        int i, j, x;

        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                x = i * j;
                System.out.print(j + "x" + i + "=" + x + "\t");
            }
            System.out.println();
        }

    }
}
