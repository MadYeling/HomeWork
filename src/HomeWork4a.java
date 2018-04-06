//计算个人所得税
//作业时间：2017年10月31日
import java.util.Scanner;

public class HomeWork4a {
    public static void main(String[] args) {
        int pr;
        float su;
        System.out.println("输入个人所得金额");
        Scanner sc = new Scanner(System.in);
        pr = sc.nextInt();

        if (pr <= 0) {
            System.out.println("输入数字无效");
            return;
        }
        if (pr <= 3500) {
            System.out.println("无需缴纳个人所得税");
        } else if (pr <= 5000) {
            su = (pr - 3500) * 0.03f;
            System.out.println("个人所得税为：" + su);
        } else if (pr <= 8000) {
            su = (pr - 5000) * 0.1f + 1500 * 0.03f;
            System.out.println("个人所得税为：" + su);
        } else if (pr <= 12500) {
            su = (pr - 8000) * 0.2f + 3000 * 0.1f + 1500 * 0.03f;
            System.out.println("个人所得税为：" + su);
        } else if (pr <= 15000) {
            su = (pr - 12500) * 0.25f + 4500 * 0.2f + 3000 * 0.1f + 1500 * 0.03f;
            System.out.println("个人所得税为：" + su);
        } else {
            su = (pr - 15000) * 0.3f + 2500 * 0.25f + 4500 * 0.2f + 3000 * 0.1f + 1500 * 0.03f;
            System.out.println("个人所得税为：" + su);
        }
    }
}
