package day58_Polymorphism;

import day55_Abstraction.shapeTask.*;

import day58_Polymorphism.animalTask.Animal;
import day58_Polymorphism.animalTask.Cat;
import day58_Polymorphism.animalTask.Dog;

public class InstanceOf_Keyword {
    public static void main(String[] args) {

        Animal animal1 = new Animal(10, 'F');
        Animal animal2 = new Dog("Lessie", 6, 'M');
        Animal animal3 = new Cat("Pamuk", 3, 'F');

        // verify animal3 is the object of Animal Class
        boolean r1 = animal3 instanceof Animal;  // IS-A relation ==> true
        System.out.println(r1);

        // verify that animal3 is the object of Cat class
        boolean r2 = animal3 instanceof Cat;
        System.out.println(r2);

        // verify that animal3 is the object of Dog class
        boolean r3 = animal3 instanceof Dog; // there is no "IS-A relation" ==> false
        System.out.println(r3);

        boolean r4 = animal2 instanceof Animal;
        System.out.println(r4);

        boolean r5 = animal1 instanceof Dog; // child class CANNOT be a reference for parent class object
        System.out.println(r5);

        System.out.println(animal2 instanceof Dog);  // Dog is a Dog

        System.out.println("=============================================");

        Shape shape1 = new Circle(3);
        identifyShape(shape1);

        Shape shape2 = new Circle(3);
        System.out.println(equalShapes(shape1,shape2));

        System.out.println("=============================================");
        Shape shape3 = new Rectangle(4,6);
        Shape shape4 = new Rectangle(1,8);
        Shape shape5 = new Rectangle(4,6);

        System.out.println(equalShapes(shape3,shape4));
        System.out.println(equalShapes(shape3,shape5));
        
    }

        public static void identifyShape(Shape shape){
            if (shape instanceof Circle){
                System.out.println("The shape is circle");
            }else if ( shape instanceof Rectangle){
                System.out.println("The shape is rectangle");
            }else{
                System.out.println("The shape is cylinder");
            }
        }


        public static boolean equalShapes(Shape shape1, Shape shape2){

        boolean result = false;

        boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;
        boolean bothRectangle = shape1 instanceof Rectangle && shape2 instanceof Rectangle;
        boolean bothCylinder = shape1 instanceof Cylinder && shape2 instanceof Cylinder;

            if (bothCircle){
                Circle c1 = (Circle) shape1;
                Circle c2 = (Circle) shape2;
                if (c1.radius == c2.radius) {
                    result = true;
                }
            }
            if (bothRectangle) {
                Rectangle r1 = (Rectangle) shape1;
                Rectangle r2 = (Rectangle) shape2;
                if (r1.width == r2.width && r1.length == r2.length){
                  result = true;
                }
            }
            if(bothCylinder){
                Cylinder cy1 = (Cylinder) shape1;
                Cylinder cy2 = (Cylinder) shape2;
                if( cy1.radius == cy2.radius && cy1.height == cy2.height){
                    result = true;
                }
            }
            return result;
        }

}

