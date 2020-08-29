package day47_Encapsulation;

public class Test {

    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicVariable );// public is accessible at everywhere
        AccessModifiers.publicMethod();

        System.out.println( AccessModifiers.defaultVariable); // default is accessible in the same package
        AccessModifiers.defaultMethod();

        //System.out.println(AccessModifiers.privateVariable); private is accessible only in the same class.
        //AccessModifiers.privateMethod();
    }
}
