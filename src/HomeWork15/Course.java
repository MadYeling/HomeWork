package HomeWork15;

public class Course {
    private int cNumber, cUnit;
    private String cName;

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcNumber(int cNumber) {
        this.cNumber = cNumber;
    }

    public void setcUnit(int cUnit) {
        this.cUnit = cUnit;
    }

    public String getcName() {
        return cName;
    }

    public int getcNumber() {
        return cNumber;
    }

    public int getcUnit() {
        return cUnit;
    }

    Course(int cNumber, String cName, int cUnit) {
        this.cUnit = cUnit;
        this.cName = cName;
        this.cNumber = cNumber;
    }

    public void printCourseInfo() {
        System.out.println("课程编号：" + cNumber + "\n课程名：" + cName + "\n学分数：" + cUnit);
    }
}
