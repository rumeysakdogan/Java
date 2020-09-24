package day56_Abstraction.shapeTask;

public class Circle extends Shape{

    public double radius;

    public Circle(double radius) {
        if  (radius <= 0){
            throw new RuntimeException("Radius of circle cannot be negative or 0.");
        }
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
