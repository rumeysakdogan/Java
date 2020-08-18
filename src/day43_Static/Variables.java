package day43_Static;

public class Variables {

    int d;  // instance method declared outside of method, inside class.

    static int s;  // static variable can be used in both static and instance methods.

    public void method2(){
        System.out.println( d );
        // instance variables can be used inside the instance method without initializing(default value assigned automatically)
        System.out.println( s );


    }


    public static void main(String[] args) {
       // System.out.println(a);
        System.out.println( s );
      //  System.out.println( d );  static methods only accept static members

        Variables obj = new Variables();

        System.out.println( obj.d );  // Only way : through the object we can call instance variable in static method!

    }


    public static void method1() {
        int a; //           local variable ONLY accessible in the method or the block created inside
                //          local variables declared inside the block or method
        if(true){
            int b = 20;
        }

       // System.out.println(b);
       // System.out.println(a);        you cannot use local variables without initializing

    }
}
