//杨辉三角
//2017年11月16日
public class HomeWork9a {
    public static void main(String[] args) {
        int n, i, j, k;
        n = 13;//行数，超过13行三角形会变形（需要更多的制表符），所以取值范围为3~13，此处定义方便更改，同时也方便改用scan
        int nm[][] = new int[n][];//创建二位数组

        for (i = 0; i < nm.length; i++) {
            nm[i] = new int[i + 1];//初始化第二层数组的大小

            if (n % 2 == 0 & i % 2 != 0) {//使用制表缩进将数字排列变为三角形
                for (k = (n - i) / 2 - 1; k >= 0; k--) {
                    System.out.print("\t\t");
                }
                System.out.print("\t");//偶数行多打一个制表符以对齐
            } else if (n % 2 != 0 & i % 2 == 0) {
                for (k = (n - i) / 2 - 1; k >= 0; k--) {
                    System.out.print("\t\t");
                }
                System.out.print("\t");
            } else {
                for (k = (n - i) / 2 - 1; k >= 0; k--) {
                    System.out.print("\t\t");
                }
            }
            //对上方代码的说明：因为可以改行数并且制表符数量是以“(行数-所在行)/2 - 1”的方式进行计算，如果(行数-所在行)结果是奇数，会导致数字被取整.
            //比如7/2，结果会被取整为3，如果直接打上去会导致三角形变形.所以需要判断行数为奇数还是偶数并且分开计算制表符数量.
            //不修改行数的程序按照if(i%2==0){}else{}进行，但是也要注意取整问题。

            for (j = 0; j <= i; j++) {//计算公式来自于百度

                if (i == 0 || j == 0 || j == i) {
                    nm[i][j] = 1;//将两侧元素赋值为1
                } else {
                    nm[i][j] = nm[i - 1][j] + nm[i - 1][j - 1];//计算下层数字
                }

                System.out.print(nm[i][j] + "\t\t");//制表缩进以对齐
            }

            System.out.println();//换行
        }
    }
}
