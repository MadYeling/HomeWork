package HomeWork12;

public class PlainRect {
    private int startX, startY, width, height;

    public PlainRect() {
    }

    public PlainRect(int startX, int startY, int width, int height) {
        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.height = height;
    }

    public boolean isInside(double X, double Y) {
        return !(X < startX | Y < startY) && !(X > startX + width | Y > startY + height);
    }

    public int area() {
        return width * height;
    }

    public int prelim() {
        return width * 2 + height * 2;
    }

    public boolean test(double X, double Y) {
        if (X < startX | Y < startY) {
            return false;
        } else if (X > startX + width | Y > startY + height) {
            return false;
        } else {
            return true;
        }
    }

}