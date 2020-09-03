package library;

import day50_Inheritance_Overriding.AccessModifiers;

public class Inheritance_Test extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println( Inheritance_Test.publicData );  // public is visible outside of the package
        System.out.println( Inheritance_Test.protectedData );   // protected is always visible to any child class, also within the package



    }
}
