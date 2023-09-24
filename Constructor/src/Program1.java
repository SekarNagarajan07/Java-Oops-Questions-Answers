// Use constructor to initialize radius.And use the same in other methods.
class Circle{
    private double radius;

    //Construtor

    public Circle(double radius){
        this.radius = radius;
    }
    //Method to get the radius

    public double getRadius(){
        return radius;
    }

    public double Area(){
        return Math.PI * radius * radius;
    }

    public double Perimeter(){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(6.0);

        double radius = circle.getRadius();
        System.out.println("Circle Radius: " + radius);

        double area = circle.Area();
        System.out.println("Circle Area: " + area);

        double perimeter = circle.Perimeter();
        System.out.println("Circle Perimeter: " + perimeter);
    }
}
