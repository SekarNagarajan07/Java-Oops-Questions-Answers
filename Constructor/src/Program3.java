//3. Write a class with constructor. Initialize 2 numbers in constructor. Write
//methods to return quotient and reminder of those 2 numbers.

class Calculator {
    private int num1;
    private  int num2;

    public Calculator(int number1, int number2){
        this.num1 = number1;
        this.num2 = number2;
    }

    public int Quotient() {
        if (num2 == 0) {
            System.out.println("cannot divide by zero");
            return 0;
        }
        return  num1 / num2;
    }

    public  int Remainder(){
        if (num2 == 0) {
            System.out.println("cannot calculate remainder by zero");
            return 0;
        }
        return  num1 % num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,5);

        System.out.println("Quotient: " + calculator.Quotient());
        System.out.println("Remainder: " + calculator.Remainder());
    }
}
