//用for语句实现求1~100之间被3或5整除的所有整数之和。
//2017年11月7日
public class HomeWork5 {
    public static void main(String[] args) {
        int i, j;
        j = 0;

        for (i = 1; i <= 100; i++) {

            if (i % 3 == 0 | i % 5 == 0) {
                j += i;
            }

        }
        System.out.print(j);

    }
}
