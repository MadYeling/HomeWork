package HomeWork16;

public class Professor {
    private String name, course;
    private boolean sex;
    private int age, result;

    public Professor(String name, String course, String sex, int age, int result) {
        this.age = age;
        this.course = course;
        this.name = name;
        switch (sex) {
            case "��":
                this.sex = true;
                break;
            case "Ů":
                this.sex = false;
                break;
            default:
                System.out.println("ֻ��Ϊ�л�Ů");
                break;
        }
        this.result = result;
    }

    public boolean setResult(int result) {
        if (result < 5 & result > 0) {
            this.result = result;
            return true;
        } else {
            return false;
        }

    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getResult() {
        return result;
    }

    public String getCourse() {
        return course;
    }

    public String getDetails() {
        String sex1;
        String result1;
        if (this.sex) {
            sex1 = "��";
        } else {
            sex1 = "Ů";
        }
        switch (result) {
            case 1:
                result1 = "����";
                break;
            case 2:
                result1 = "����";
                break;
            case 3:
                result1 = "һ��";
                break;
            case 4:
                result1 = "��";
                break;
            default:
                result1 = "��";
                System.out.println("��Ч�Ľ�ѧ����");
                break;
        }

        return "������" + name + "\n�Ա�" + sex1 + "\n���䣺" + age + "\n���ڿγ̣�" + course + "\n��ѧЧ����" + result1;
    }
}

