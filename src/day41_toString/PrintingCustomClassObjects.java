package day41_toString;

public class PrintingCustomClassObjects {
    public static void main(String[] args) {

        String str = new String("Cybertek");

        System.out.println(  str  );    // object name
        System.out.println(   new String("School")  );   // object

        // we must call toString() method  whenever we print object and object name !!
        // If we dont call toString(), compiler will call toString() method internally
        System.out.println(  str.toString()  );
        System.out.println(  new String("School").toString()  );

        // toString() : instance method, it returns String

        System.out.println("================================================================================");

        Carpet carpet1 = new Carpet();
            carpet1.customOrder(5,6,19,true);

        System.out.println(carpet1);
        // if you don't customize your method in custom class, it will print a hashcode : day41_Static.Carpet@61bbe9ba



    }
}
