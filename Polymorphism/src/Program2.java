class Bank {
    protected double interestRate = 0.03;


    public double calculateInterest(double balance){
        return balance * interestRate;
    }
}

class ICICI extends Bank {
    private double interestRate = 0.04;

    public double calculateInterest(double balance){
        return balance * interestRate;
    }
}

class SBI extends Bank {
    private double interestRate = 0.045;

    public double calculateInterest(double balance){
        return balance * interestRate;
    }
}

class Program2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ICICI icici = new ICICI();
        SBI sbi = new SBI();

        double balance = 1000.0;

        System.out.println("Interest from Bank: " + bank.calculateInterest(balance));
        System.out.println("Interest from ICICI: " + icici.calculateInterest(balance));
        System.out.println("Interest from SBI: " + sbi.calculateInterest(balance));

    }
}