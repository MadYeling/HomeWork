package HomeWork12;

public class Run {
    public static void main(String[] args) {
        PlainRect plainRect = new PlainRect(10, 10, 20, 10);

        if (plainRect.isInside(25.5,13)) {
            System.out.println("在内");
        } else {
            System.out.println("不在内");
        }
        System.out.println("周长：" + plainRect.prelim() + "\n面积：" + plainRect.area());

    }
}
