//三角形代码
//2017年11月20日
public class HomeWork9b {
    public static void main(String[] args) {
        int a, b, c, d, e, r;
        a = 1;
        r = 20;//行数，实际行数为该数字除2

        for (b = 1; b <= r; b++) {
            if (b % 2 != 0) {
                e = 1;

                for (d = (r - b) / 2; d > 0; d--) {
                    System.out.print("\t");
                }

                for (c = 1; c <= b; c++) {
                    if (c == (b + 1) / 2) {
                        System.out.print(a);
                        a *= 2;
                        System.out.print("\t");
                    } else if (c < (b + 1) / 2) {
                        System.out.print(e);
                        e *= 2;
                        System.out.print("\t");
                    } else {
                        e /= 2;
                        System.out.print(e);
                        System.out.print("\t");
                    }
                }

                System.out.println();
            }
        }

    }
}
