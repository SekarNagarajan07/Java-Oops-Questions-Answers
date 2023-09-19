/*2. Create a class named Circle. Should have one method to read input radius
as input. Copy radius into a public variable. Using that public variable,
calculate area and perimeter in 2 separate methods.*/

import java.util.Scanner;

class  Circle {
    public double radius;

    public void Radious(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    public void calculateArea(){
        System.out.println("Area of the circle: " + 3.14 * radius * radius);
    }

    public void calPerimeter(){
        System.out.println("Perimeter of the circle: " + 2 * 3.14 * radius);
    }
}

class Program2 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.Radious();
        c.calculateArea();
        c.calPerimeter();
    }
}
