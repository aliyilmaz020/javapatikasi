package employees;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Serdar", 2000, 45, 1985);
        Employee e2 = new Employee("Osman", 10000, 20, 2000);
        e1.printEmployee();
        e2.printEmployee();
    }
}
