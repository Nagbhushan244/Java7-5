public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id=id;
        this.salary=salary;
    }
    public void displayInfo() {
        System.out.println("Employe  ID: " +id);
        System.out.println("Employee Name: " +name );
        System.out.println("Salary :$ " +salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Xyz", 101, 5000.0);
        emp1.displayInfo();
    }
        
}
