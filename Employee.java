public class Employee {
    String name;
    int id;
    double salary;
    String DOJ;
    String department;

    public Employee(String name, int id, double salary,String DOJ, String department) {
        this.name = name;
        this.id=id;
        this.salary=salary;
        this.DOJ=DOJ;
        this.department=department;
    }
    public void displayInfo() {
        System.out.println("Employe  ID: " +id);
        System.out.println("Employee Name: " +name );
        System.out.println("Salary :$ " +salary);
        System.out.println("Date Of Join: " +DOJ);
        System.out.println("Dapartment : " +department);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Xyz", 101, 5000.0,"05-10-2004","Cloud Computing");
        emp1.displayInfo();
    }
        
}
