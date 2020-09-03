package day50_Inheritance_Overriding.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 4.1);

        System.out.println("Area of rectangle: " + rectangle.calcArea() );
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter );

        System.out.println("=================================================");

        System.out.println("Area of circle: " + circle.calcArea() );
        System.out.println("Circumference of circle: " + circle.perimeter );

    }
}
