package library;

import day47_Encapsulation.AccessModifiers;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);// public is visible at everywhere
        AccessModifiers.publicMethod();

        //System.out.println(AccessModifiers.defaultVariable );// default cannot be accessed from outside package
        //AccessModifiers.defaultMethod();

        //System.out.println(AccessModifiers.privateVariable); private is not visible outside of the class.
        //AccessModifiers.privateMethod();


    }
}
