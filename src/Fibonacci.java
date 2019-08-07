import java.text.SimpleDateFormat;
import java.util.Date;

public class Fibonacci {
    private static final int COUNT = 50;

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long startTime = System.currentTimeMillis();
        System.out.println("计算斐波那契数列中第" + COUNT + "项的数字");
        System.out.println("程序于 " + new SimpleDateFormat("HH时mm分ss秒").format(new Date()) + " 开始运行");
        System.out.println("=======================================");
        System.out.println("计算中...");
        System.out.println("循环：" + fibonacci.fibonacci2(COUNT));
        long endTime = System.currentTimeMillis();
        System.out.println("循环使用 " + (endTime - startTime) + " 毫秒完成计算。");
        System.out.println("=======================================");
        System.out.println("计算中...");
        System.out.println("递归：" + fibonacci.fibonacci1(COUNT));
        endTime = System.currentTimeMillis();
        System.out.println("递归使用 " + (endTime - startTime) + " 毫秒完成计算。");
        System.out.println("=======================================");
        System.out.println("程序于 " + new SimpleDateFormat("HH时mm分ss秒").format(new Date()) + " 运行结束");
    }

    private long fibonacci1(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        return fibonacci1(n - 1) + fibonacci1(n - 2);
    }

    private long fibonacci2(int n) {
        long result = 0;
        long pre1 = 0;
        long pre2 = 1;
        if (n == 0) {
            return pre1;
        }
        if (n == 1) {
            return pre2;
        }
        for (int i = 2; i <= n; i++) {
            result = pre1 + pre2;
            //移动指针
            pre1 = pre2;
            pre2 = result;
        }
        return result;
    }
}
