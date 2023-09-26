class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double Area(){
        return length * breadth;
    }
    public double Perimeter(){
        return 2*(length + breadth);
    }
}

class Square extends Rectangle{
    public Square(double side){
        super(side,side);
    }

}

class Program2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,3);
        System.out.println("Rectangle Area: " + rectangle.Area());
        System.out.println("Rectangle Perimter: " + rectangle.Perimeter());

        Square square = new Square(5);
        System.out.println("Square Area: " + square.Area());
        System.out.println("Square Perimter: " + square.Perimeter());
    }
}
