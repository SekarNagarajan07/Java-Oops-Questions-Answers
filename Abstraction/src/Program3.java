abstract class Shape {
    public abstract void printArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void printArea(){
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public void printArea(){
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void printArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Program3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
    }
}
