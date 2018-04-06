package HomeWork14;

public class Run {
    public static void main(String[] args) {
        Employee employee = new Employee("陈思怡",1,"无锡市工艺技术学院",10000);
        employee.empInfo();
        employee.raiseSalary(0.1f);
        employee.empInfo();
    }
}
