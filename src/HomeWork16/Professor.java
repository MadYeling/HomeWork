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
            case "男":
                this.sex = true;
                break;
            case "女":
                this.sex = false;
                break;
            default:
                System.out.println("只能为男或女");
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
            sex1 = "男";
        } else {
            sex1 = "女";
        }
        switch (result) {
            case 1:
                result1 = "优秀";
                break;
            case 2:
                result1 = "良好";
                break;
            case 3:
                result1 = "一般";
                break;
            case 4:
                result1 = "差";
                break;
            default:
                result1 = "无";
                System.out.println("无效的教学质量");
                break;
        }

        return "姓名：" + name + "\n性别：" + sex1 + "\n年龄：" + age + "\n教授课程：" + course + "\n教学效果：" + result1;
    }
}

