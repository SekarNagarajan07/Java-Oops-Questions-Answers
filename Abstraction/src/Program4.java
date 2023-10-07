abstract class Employee {
    private String employeeId;
    private String employeeName;
    private double basicPay;
    private double pf;

    public Employee(String employeeId, String employeeName, double basicPay, double pf) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicPay = basicPay;
        this.pf = pf;
    }


    public abstract void attendance();

    public final void removeEmployee() {
        System.out.println("Employee " + employeeName + " has been removed.");
    }


    public double calculateSalary() {
        double salary = basicPay - pf;
        return salary;
    }

    public double calculateTotalSalary(double incentives) {
        double totalSalary = calculateSalary() + incentives;
        return totalSalary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getPf() {
        return pf;
    }

    public void setPf(double pf) {
        this.pf = pf;
    }
}

class Marketing extends Employee {
    private double incentives;

    public Marketing(String employeeId, String employeeName, double basicPay, double pf, double incentives) {
        super(employeeId, employeeName, basicPay, pf);
        this.incentives = incentives;
    }

    public void attendance() {
        System.out.println("Attendance marked for Marketing employee: " + getEmployeeName());
    }

    public double calculateTotalSalary() {
        return super.calculateTotalSalary(incentives);
    }
}

class NewJoinee extends Employee {
    public NewJoinee(String employeeId, String employeeName, double basicPay, double pf) {
        super(employeeId, employeeName, basicPay, pf);
    }

    public void attendance() {
        System.out.println("Attendance marked for New Joinee employee: " + getEmployeeName());
    }
}

 class Program4 {
    public static void main(String[] args) {
        Marketing marketingEmployee = new Marketing("M123", "John Doe", 5000.0, 500.0, 1000.0);
        NewJoinee newJoineeEmployee = new NewJoinee("N456", "Jane Smith", 4000.0, 400.0);


        marketingEmployee.attendance();

        double totalSalaryMarketing = marketingEmployee.calculateTotalSalary();
        System.out.println("Total Salary for Marketing Employee: $" + totalSalaryMarketing);

        newJoineeEmployee.attendance();
    }
}
