package day55_Abstraction.shapeTask;
/*
 5. create a class called shape objects:
            create objects of each shapes and calculate their area,
             perimeter, and volume
    HINT: Math.PI will give you the actual value of PI
 */
public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(-2.5);
        Rectangle rectangle = new Rectangle(3.2,0);


        System.out.println( circle1 );
        System.out.println( circle1.hasVolume);

        System.out.println("=============================");
        System.out.println(rectangle);
        System.out.println( Rectangle.hasVolume);
        System.out.println("=============================");
        Cylinder cylinder = new Cylinder(6,3);
        System.out.println(cylinder);
    }
}
