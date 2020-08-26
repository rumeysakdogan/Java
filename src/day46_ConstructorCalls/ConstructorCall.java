package day46_ConstructorCalls;

public class ConstructorCall {

    // in constructor, you can call instance and static methods
    public ConstructorCall(){
        method1();
        method2();
        method3();
    }

    // Other methods (either static or instance) CANNOT call Constructor!
    // OnLY the constructor can call another constructor.
    public static void method1(){
        method2();
        //ConstructorCall();
    }

    public static void method2(){
        method1();

    }

    public void method3(){
        //ConstructorCall();
    }
}
