package day43_Static;

public class Test {

    public static void main(String[] args) {

// if we initialize these variables in main method in class Staticblock3, those values cannot be recognized in another class.

        System.out.println( StaticBlock3.a); // 0
        System.out.println( StaticBlock3.b); // 0
        System.out.println( StaticBlock3.c); // 0

// after we initialize them in static block , it gives the given values

    }
}
