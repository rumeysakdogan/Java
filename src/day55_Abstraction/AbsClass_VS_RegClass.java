package day55_Abstraction;


final class A{        // can create object from it, can be final
    int a = 10;
    static int b = 20;

    public void method1(){}

    static {}

    public A(){}

   // public abstract void method3(); cannot have abstract method

}

abstract class B{    // cannot create object from it, cannot be final

    int a = 10;
    static int b = 20;

    public void method1(){}

    public static void method2(){}

    static {}

    public B(){}

    public abstract void method3();
}



public class AbsClass_VS_RegClass {


}
