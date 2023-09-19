/*1.Create a class for Calculator. Write methods for finding sum, difference,
product and quotient. All methods should take 2 numbers as input and
return one integer.*/
class Calculator {
    public void add(int num1, int num2){
        System.out.println("Total: " + (num1 + num2));
    }
    public void diff(int num1, int num2){
        System.out.println("Different: " + (num1-num2));
    }
    public void product(int num1, int num2){
        System.out.println("product: " + (num1 * num2));
    }
    public void quotient(int num1, int num2){
        System.out.println("Quotient: " + (num1/num2));
    }
}
class Program1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,20);
        c.diff(20, 10);
        c.product(20,10);
        c.quotient(20,10);
    }
}