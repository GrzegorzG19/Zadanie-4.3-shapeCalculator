public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(2, 5, 7);

        ShapeCalculator calculator = new ShapeCalculator();

         System.out.println(calculator.squareArea(square));
         System.out.println(calculator.rectPerimeter(rectangle));
         System.out.println(calculator.trianglePerimeter(triangle));
         System.out.println(calculator.circleArea(circle));


        double squaArea = square.squareArea();
        double rectArea = rectangle.rectPerimeter();
        double circArea = circle.circleArea();
        double trianArea = triangle.trianglePerimeter();

        System.out.println(squaArea);
        System.out.println(rectArea);
        System.out.println(circArea);
        System.out.println(trianArea);
    }
}
