//求Fibonacci数列：1,1,2,3,5,8，....的前24个数字，并输出时按每行6个输出。
//2017年11月7日
public class HomeWork7a {
    public static void main(String[] args) {
        int j, k, l;
        j = 0;
        k = l = 1;

        for (int i = 1; i <= 24; i++) {
            System.out.print(l);
            l = j + k;
            j = k;
            k = l;

            if (i % 6 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }

        }

    }
}
