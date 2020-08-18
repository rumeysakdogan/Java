package day43_Static;

public class Static_vs_Instance {

    static int staticVariable;
    int instanceVariable;

    public static void main(String[] args) {

        Static_vs_Instance obj1 = new Static_vs_Instance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;

        Static_vs_Instance obj2 = new Static_vs_Instance();
        obj2.instanceVariable = 200;
        obj1.staticVariable = 400;

        System.out.println( obj1.instanceVariable );
        System.out.println( obj2.instanceVariable );

        System.out.println("=======================================");

        System.out.println( obj1.staticVariable);  // NOT preferred way to call static variables
        System.out.println( obj2.staticVariable);

        System.out.println( Static_vs_Instance.staticVariable ); // preferred way calling statics through classname
    }

}
