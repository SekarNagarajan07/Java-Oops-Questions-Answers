class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        }else  {
            System.out.println("Insufficient balance");
        }
    }
    public void displayBalance(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}
class SavingAccount extends BankAccount {
    private double interestRate;
    public SavingAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }
    public void calculateInterest(){
        double interest = balance * (interestRate/100);
        deposit(interest);
        System.out.println("Interest credited: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNUmber, double balance){
        super(accountNUmber,balance);
    }
}
class Program4 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("1234",5000.0, 4.0);
        savingAccount.displayBalance();
        savingAccount.calculateInterest();
        savingAccount.displayBalance();

        CurrentAccount currentAccount = new CurrentAccount("0987",4000.0);
        currentAccount.displayBalance();
        currentAccount.withdraw(500.0);
        currentAccount.displayBalance();
    }
}

