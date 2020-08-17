package day42_static;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {

        // static methods accept ONLY static members!

        System.out.println(b);
        // System.out.println(a);
        // System.out.println(this.a);

        StaticMethods obj = new StaticMethods();
        // to be able to call the instance variable in static method, you SHOULD create an object and call it by object name

        System.out.println( obj.a );
        // the ONLY way to call instances in a static method

        staticMethod();
        StaticMethods.staticMethod();

        //instanceMethod();
        //StaticMethods.instanceMethod();
        obj.instanceMethod();

    }



    public static void staticMethod(){

    }

    public void instanceMethod(){

    }
}

