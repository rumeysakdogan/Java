package day50_Inheritance_Overriding.shapeTask;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        area = calcArea();
        perimeter = calcPerimeter();
    }

    @Override
    public double calcArea() {
        return length * width;
    }

    public double calcPerimeter() {
        return 2 * (length + width);
    }
}
