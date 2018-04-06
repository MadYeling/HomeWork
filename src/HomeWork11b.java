//带GUI的作业11
//2017年11月29日

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Objects;

public class HomeWork11b extends JFrame {
    //定义成员变量
    private int a = 0;//用于记录点击了几次“下一个”按钮
    private static ArrayList<String> ls = new ArrayList<String>();//用于排序的第一个列表
    private static ArrayList<String> ls1 = new ArrayList<String>();//用于记录的第二个列表
    private static float max, min;//最大值和最小值
    private static boolean dot = false;

    //窗体
    private HomeWork11b() {
        UIManager.put("swing.boldMetal", Boolean.FALSE);//取消字体加粗
        this.setTitle("作业11 GUI");//窗体标题
        this.setSize(340, 100);//窗体大小
        this.setLocationRelativeTo(null);//窗体位置居中
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//关闭窗体时停止程序
        this.setVisible(true);//窗体可见
        this.setResizable(false);//窗体不可缩放
        this.setLayout(null);//无布局管理器
        //创建控件
        JLabel jb1 = new JLabel("输入第1个数字：");//创建标签
        JTextField jtf1 = new JTextField();//创建文本框
        JButton bt1 = new JButton("下一个");//创建“下一个”按钮
        JButton bt2 = new JButton("结束");//创建“结束”按钮
        //添加控件
        this.add(jb1);//标签
        this.add(jtf1);//文本框
        this.add(bt1);//“下一个”按钮
        this.add(bt2);//“结束”按钮
        //设置控件位置和大小
        jb1.setBounds(15, 20, 100, 25);//标签
        jtf1.setBounds(110, 20, 40, 25);//文本框
        bt1.setBounds(160, 20, 70, 25);//“下一个”按钮
        bt2.setBounds(240, 20, 70, 25);//“结束”按钮

        //侦听各事件
        jtf1.addKeyListener(new KeyAdapter() {//文本框侦听
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (keyChar != '.') {
                    if (keyChar < '0' || keyChar > '9') {
                        e.consume(); //屏蔽非法输入(除了.和数字外的一切键盘输入)
                    }
                } else {
                    //让.的数量不超过1个
                    if (dot) {
                        e.consume();
                    } else {
                        dot = true;
                    }
                }
            }
        });

        bt1.addActionListener(e -> {//“下一个”按钮点击事件
            if (Objects.equals(jtf1.getText(), "")) {//判断文本框内是否为空
                JOptionPane.showMessageDialog(null, "文本框内不能为空！", "错误！", JOptionPane.ERROR_MESSAGE);//弹出错误警告
            } else {
                ls.add(jtf1.getText());//向第一个列表添加object，用于排序
                ls1.add(jtf1.getText());//向第二个列表添加object，用于记忆
                jb1.setText("输入第" + (a + 2) + "个数字：");//改变label内显示的内容
                jtf1.setText("");//清空文本框
                countMaxNumber(a);//执行判断最大值方法
                countMinNumber(a);//执行判断最小值方法
                if (max == 0.0f | min == 0.0f) {//判断最大值最小值是否被赋值为第一个输入的数
                    max = min = Float.parseFloat(ls.get(0));
                }
                a++;
                dot = false;//点击“下一个”按钮时重置
            }
        });

        bt2.addActionListener(e -> {//“结束”按钮点击事件
            if (!Objects.equals(jtf1.getText(), "")) {//判断文本框内是否有数字，如果有将该数字添加至列表并再执行一次判断最大值和最小值
                ls.add(jtf1.getText());
                ls1.add(jtf1.getText());
                countMaxNumber(a);
                countMinNumber(a);
            }

            if (ls.size() == 0) {//判断是否输入过数字
                JOptionPane.showMessageDialog(null, "数组数量不能为0！", "错误！", JOptionPane.ERROR_MESSAGE);
            } else {
                arraySortBTS();//执行排序

                Object[] options = {"确定"};
                JOptionPane.showOptionDialog(null, "输入的数字为：" + ls1 + "\n输入的数字数量为：" + ls.size() +
                        "\n最大值为：" + max + "\n最小值为：" + min + "\n平均值为：" + averageValue() + "\n冒泡排序结果为：" + ls +
                        "\n\n点击“确定”按钮关闭程序...", "结果", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                System.exit(0);//关闭进程
            }
        });

        KeyListener key_Listener = new KeyListener()//侦听键盘事件
        {
            public void keyTyped(KeyEvent e) {
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER)//如果回车被按下
                {
                    bt1.doClick();//模拟点击“下一个”按钮
                }
            }
        };

        jtf1.addFocusListener(new FocusAdapter() {//光标始终锁定文本框
            public void focusLost(FocusEvent ev) {
                jtf1.requestFocus();
            }
        });

        jtf1.addKeyListener(key_Listener);//文本框添加键盘侦听

    }

    //主方法
    public static void main(String[] args) {
        new HomeWork11b();//加载窗口
    }

    //判断最大值
    private static void countMaxNumber(int i) {
        if (max < Float.parseFloat(ls.get(i))) {
            max = Float.parseFloat(ls.get(i));
        }

    }

    //判断最小值
    private static void countMinNumber(int i) {
        if (min > Float.parseFloat(ls.get(i))) {
            min = Float.parseFloat(ls.get(i));
        }

    }

    //排序
    private static void arraySortBTS() {
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.size() - i - 1; j++) {
                if (Float.parseFloat(ls.get(j)) < Float.parseFloat(ls.get(j + 1))) {
                    String a = ls.get(j);
                    ls.set(j, ls.get(j + 1));
                    ls.set(j + 1, a);
                }
            }
        }

    }

    //计算平均值
    private static float averageValue() {
        float sum = 0;
        for (int i = 0; i < ls.size(); i++) {
            sum += Float.parseFloat(ls.get(i));
        }
        return sum / ls.size();
    }

}
