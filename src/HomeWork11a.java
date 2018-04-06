//2017年11月29日

import java.util.Scanner;

public class HomeWork11a {
    //主方法
    public static void main(String[] args) {
        float max = 0, min = 0;
        float sum = 0f;
        float[] score = new float[5], score1;

        System.out.println("输入" + score.length + "个数字");

        score = getArrayNumber();
        max = countMaxNumber(score);
        min = countMinNumber(score);
        score1 = arraySortBTS(score);

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + "   ");
        }

        System.out.println("\n最大值：" + max + "\n最小值：" + min);
        System.out.println("冒泡排序结果如下");
        System.out.println("从大到小");
        for (int i = 0; i < score1.length; i++) {
            System.out.print(score1[i] + "   ");
        }
        System.out.println("\n从小到大");
        for (int i = score1.length - 1; i >= 0; i--) {
            System.out.print(score1[i] + "   ");
        }

    }

    //获取数组
    private static float[] getArrayNumber() {
        float[] score = new float[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.print("输入第" + (i + 1) + "个数字：");
            score[i] = sc.nextFloat();
        }
        return score;
    }

    //计算最大值
    private static float countMaxNumber(float[] score) {
        float max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }

    //计算最小值
    private static float countMinNumber(float[] score) {
        float min = score[0];
        for (int i = 0; i < score.length; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    //排序
    private static float[] arraySortBTS(float[] score) {
        for (int j = 0; j < score.length - 1; j++) {
            for (int k = 0; k < score.length - j - 1; k++) {
                if (score[k] < score[k + 1]) {
                    float a = score[k];
                    score[k] = score[k + 1];
                    score[k + 1] = a;
                }
            }
        }
        return score;
    }

}
