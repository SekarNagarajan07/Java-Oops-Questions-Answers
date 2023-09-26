class Shape {
    public void print(){
        System.out.println("This is shape");
    }
}
class Rectangle1 extends Shape {
    public void print(){
        System.out.println("This is Rectangle");
    }
}
class Circle extends Shape {
    public void print(){
        System.out.println("This is Circle");
    }
}
class Square1 extends Rectangle1 {
public void print(){
    System.out.println("This is Square");
}
}
class Program3 {
    public static void main(String[] args) {
        Square1 square = new Square1();
        square.print();
        ((Rectangle1)square).print();
    }
}
