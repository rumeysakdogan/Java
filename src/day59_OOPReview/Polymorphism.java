package day59_OOPReview;

import day55_Abstraction.shapeTask.Circle;
import day55_Abstraction.shapeTask.Rectangle;
import day55_Abstraction.shapeTask.Shape;

public class Polymorphism {

    public static void main(String[] args) {

        Shape shape1 = new Circle(3);

       // System.out.println( shape1.radius);

        System.out.println( ((Circle) shape1).radius ); // downcasting==> precondition: is-a relation

        // shape1.length;
        //System.out.println( ((Rectangle) shape1).length );

        Rectangle r1= new Rectangle(3,5);
        Shape shape3 = r1; // upcasting--> automatically done
    }
}
