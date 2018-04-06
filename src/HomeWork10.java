//数组简单综合应用
//2017年11月24日
public class HomeWork10 {
    public static void main(String[] args) {
        float[] score = {71.5f, 35.2f, 17.3f, 25.3f, 89.0f, 31.4f, 68.9f, 98.7f, 75.8f, 39.1f, 25.6f, 77.3f, 5.1f};
        float a, c, d;
        int b = 0, e = 0;
        a = d = score[0];
        c = 0f;

        for (int i = 0; i < score.length; i++) {
            c += score[i];
            System.out.print(score[i] + "\t");
            if (a < score[i]) {
                a = score[i];
                b = i + 1;
            }
            if (d > score[i]) {
                d = score[i];
                e = i + 1;
            }
        }

        System.out.println("\n\n数组元素个数为：" + score.length + "个\n最大值为：" + a + " 在第" + b + "个位置\n最小值为："
                + d + " 在第" + e + "个位置\n总和分数为：" + c + " 分\n平均分为：" + c / score.length + " 分");

        for (int i = 0; i < score.length - 1; i++) {
            for (int j = 0; j < score.length - i - 1; j++) {
                if (score[j] < score[j + 1]) {
                    a = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = a;
                }
            }
        }

        System.out.println("\n冒泡排序结果如下：");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + "\t");
        }

    }
}
