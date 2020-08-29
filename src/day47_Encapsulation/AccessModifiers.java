package day47_Encapsulation;

public class AccessModifiers {

    // public: you can access from any package in the project. If it is in the same package no import needed,
    // if it will be used in different package, import statement needed.
    public static int publicVariable = 100;

    public static void publicMethod(){
        System.out.println("public method");
    }


    //default: no keyword used, it is visible ONLY within the same package
    static int defaultVariable = 200;

    static void defaultMethod(){
        System.out.println("default method");
    }

    //private: ONLY visible within the same class
    private static int privateVariable = 300;

    private static void privateMethod(){
        System.out.println("private method");
    }

}
