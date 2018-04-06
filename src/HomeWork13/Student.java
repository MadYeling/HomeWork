package HomeWork13;

public class Student {
    private int number, age;
    private String name;
    private boolean sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public boolean getSex() {
        return sex;
    }

    public void setInfo(int number) {
        this.number = number;
    }

    public void setInfo(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public void setInfo(int number, String name, boolean sex) {
        this.number = number;
        this.name = name;
        this.sex = sex;
    }

    public void setInfo(int number, String name, boolean sex, int age) {
        this.number = number;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

}
