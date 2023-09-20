/*5. Create a class named Employee with public variables ID, name,
department and salary. Write separate methods to assign the values and to
print the values.*/
class Employee {
    int id;
    String name;
    String department;
    double salary;

    public void assignValue(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void printValue(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee salary: " + salary);
    }
}

class Program5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.assignValue(1,"sekar","cse",4000.0);
        e.printValue();
    }
}
