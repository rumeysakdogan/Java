package day59_OOPReview;

interface X{

    public abstract void method1();
    void method2();

    int a = 100;  // by default all variables are public static final
    static int b = 200;
}

abstract class Y{

    int a;
    static int b;
    public abstract void method1();

    Y(){

    }

    static{

    }
}

public class Abstraction {

    public static void main(String[] args) {
       // Y obj = new Y(); we cannot create objects from abstract class and interface
       // X obj = new X();

    }
}
