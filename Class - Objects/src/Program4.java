/*4. Create a class named Banking. It should contain methods for withdraw
and deposit. Account balance should be defined as public variable and
used in both methods.*/

class Banking {

    public double accountBalance;

    public Banking(double initialBalance){
        this.accountBalance = initialBalance;
    }

    //Deposit Method
    public void deposit(double amount){
        if(amount>0){
            accountBalance = accountBalance + amount;
            System.out.println("Deposited: " + amount);
        }else {
            System.out.println("Invalid deposit amount");
        }

    }
    //Withdraw Method

    public void withdraw(double amount){
        if(amount>0 && accountBalance >=amount){
            accountBalance = accountBalance - amount;
            System.out.println("Withdraw: " + amount);
        } else if (amount<=0) {
            System.out.println("Invalid withdrawal amount");
        }else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        Banking banking = new Banking(5000.0);
        System.out.println("Initial account balance: " + banking.accountBalance);

        banking.deposit(1000.0);
        System.out.println("Deposited Amount: " + banking.accountBalance);

        banking.withdraw(500.0);
        System.out.println("Withdraw Amount: " + banking.accountBalance);

        
    }
}
