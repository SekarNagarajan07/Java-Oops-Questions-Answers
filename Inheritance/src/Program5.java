class Employee {
    private String name;
    private int id;
    private String designation;
    private String department;
    private double salary;

    public Employee(String name, int id, String designation, String department, double salary) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

 class Marketing extends Employee {
    private double salesIncentives;

    public Marketing(String name, int id, String designation, String department, double salary, double salesIncentives) {
        super(name, id, designation, department, salary);
        this.salesIncentives = salesIncentives;
    }

    public double getSalesIncentives() {
        return salesIncentives;
    }

    public void setSalesIncentives(double salesIncentives) {
        this.salesIncentives = salesIncentives;
    }

    public double calculateTotalSalary() {
        double salary = 0;
        double totalSalary = salary + salesIncentives;
        return totalSalary;
    }
}
class Program5 {
    public static void main(String[] args) {
        Marketing marketingEmployee = new Marketing("John Doe", 12345, "Marketing Manager", "Marketing", 100000, 10000);
        double totalSalary = marketingEmployee.calculateTotalSalary();

        System.out.println("Total salary of marketing employee: " + totalSalary);

    }
}