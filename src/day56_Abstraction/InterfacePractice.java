package day56_Abstraction;

public interface InterfacePractice {

    int a = 10; // all variables by default public static final

    public static final int b = 300;

    public static void method1(){
        System.out.println(a);  // static only accepts statics
        System.out.println(b);

//        a =100; since there are final you cannot reassign values.
//        b= 30;

    }


}
