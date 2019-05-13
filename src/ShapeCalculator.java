public class ShapeCalculator {
    double squareArea(Square square){

        return (square.a * square.a);
    }
    double circleArea(Circle cirle){

        return (cirle.r * cirle.r *3.14);

    }
    double trianglePerimeter(Triangle triangle){
        return (triangle.a + triangle.b + triangle.c);

    }

    double rectPerimeter(Rectangle rectangle){

        return (rectangle.a * rectangle.b);
    }
}
