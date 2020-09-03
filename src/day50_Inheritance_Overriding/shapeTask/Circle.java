package day50_Inheritance_Overriding.shapeTask;

public class Circle extends Shape{

    public static double pi;
    public double radius;
    public double diameter;

    static{
        pi = 3.14;
    }

    public Circle(double radius){
        this.radius = radius;
        diameter = 2 * radius;
        area = calcArea();
        perimeter = calcPerimeter();
    }

    public double calcArea() {
        return pi * radius * radius;
    }

    public double calcPerimeter() {
        return diameter * pi;
    }
}
