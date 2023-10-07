import java.util.Scanner;

class Employee {
    private int staffId;
    private String name;
    private double basicSalary;
    private double allowances;

    public void getInput(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Staff ID: ");
        staffId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        System.out.print("Enter Allowances: ");
        allowances = sc.nextDouble();
    }

    public double calculateNetPay(){
        return basicSalary + allowances;
    }

    public void displayDetails(){
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowances: " + allowances);
    }
}

class Marketing extends Employee {
    private double salasIncentives;

    public void getInput() {
        super.getInput();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales Incentives: ");
        salasIncentives = scanner.nextDouble();
    }

    @Override
    public double calculateNetPay() {
        return super.calculateNetPay() + salasIncentives;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Sales Incentives: " + salasIncentives);
    }
}

class Program3 {
    public static void main(String[] args) {
        Marketing marketingEmployee = new Marketing();

        System.out.println("Enter Marketing Employee Details:");
        marketingEmployee.getInput();

        System.out.println("\nEmployee Details:");
        marketingEmployee.displayDetails();
        System.out.println("Net Pay: " + marketingEmployee.calculateNetPay());
    }
}