package day56_Abstraction.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {
        //  Shape shape1 = new Shape();

        Square square1 = new Square(10);

        System.out.println( square1.calculateArea() );
        System.out.println(square1.area);
        System.out.println(square1.perimeter);
        System.out.println(square1.calculatePerimeter());
        System.out.println(square1);

        System.out.println("==============================");

        Cube cube1 = new Cube(10);
        System.out.println(cube1.area);
        System.out.println(cube1.perimeter);
        System.out.println(cube1.volume);

        System.out.println(cube1);


    }
}
