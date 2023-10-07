class Box {
    public double calculateArea(double side){
        return  side * side;

    }
    public double calculateArea(double length, double breadth){
        return length * breadth;
    }

}

class Program1 {
    public static void main(String[] args) {
        Box box = new Box();

        double squareSide = 4.0;
        double recLength = 6.0;
        double recBreadth = 5.0;

        double squareArea = box.calculateArea(squareSide);
        double rectangleArea = box.calculateArea(recLength,recBreadth);

        System.out.println("Area of square: " + squareArea);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}