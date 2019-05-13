public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4,5);
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(2,5,7);

        ShapeCalculator calculator = new ShapeCalculator();

        calculator.squareArea(square);
        calculator.rectPerimeter(rectangle);
        calculator.trianglePerimeter(triangle);
        calculator.circleArea(circle);

        
    }
}
