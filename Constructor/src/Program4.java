//4. Create a class named Banking. It should contain methods for withdraw
//and deposit. Account balance should be initialized in a constructor.

class Banking {
    private double accountBalance;

    public Banking(double initialBalance){
        this.accountBalance = initialBalance;
    }

    //Withdraw
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid withdrawal amount");
        } else if (amount > accountBalance) {
            System.out.println("Insufficient funds");
        }else {
            accountBalance = accountBalance - amount;
            System.out.println("Withdrean: " + amount);
        }
    }
    //Deposit

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid deposit amount");
        }else {
            accountBalance = accountBalance + amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void checkBalance(){
        System.out.println("Account Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        Banking account = new Banking(10000.0);
        account.checkBalance();
        account.deposit(5000.0);
        account.checkBalance();
        account.withdraw(3000.0);
        account.checkBalance();
        account.withdraw(1000.0);
    }
}