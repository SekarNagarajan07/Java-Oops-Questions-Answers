/*6. Write a program to swap two values. Your program should have a swap
function. In main method read 2 numbers and pass it to swap method.*/
class Swap {
    int temp;

    public void swap(int a, int b){
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
class Program6 {
    public static void main(String[] args) {
        Swap s = new Swap();
        s.swap(10,20);

    }
}
