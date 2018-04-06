package HomeWork14;

public class Employee {
    private String name, address;
    private int number;
    private float salary;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public float getSalary() {
        return salary;
    }

    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Employee(String name, int number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public Employee(String name, int number, String address, float salary) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.salary = salary;
    }

    public void empInfo() {
        System.out.println("工号：" + number + "\n姓名：" + name + "\n家庭住址：" + address + "\n基本工资：" + salary);
    }

    public void raiseSalary(float proportion) {
        salary *= (1f + proportion);
        System.out.println("工资增长了 " + proportion * 100 + "%");
    }

}
