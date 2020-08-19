package day43_Static;

import java.util.Arrays;

import static library.Resources.a;  // imports only specific static members from Resources
import static library.Resources.method1;

import static library.Resources.*;  // imports all class members from Resources

public class Test {

    public static void main(String[] args) {

// if we initialize these variables in main method in class Staticblock3, those values cannot be recognized in another class.

        System.out.println( StaticBlock3.a); // 0
        System.out.println( StaticBlock3.b); // 0
        System.out.println( StaticBlock3.c); // 0

// after we initialize them in static block , it gives the given values

        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);

        System.out.println(a);

    }
}
