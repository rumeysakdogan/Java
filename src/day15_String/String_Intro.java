package day15_String;

// import  java.lang.String; for string you don't need to import explicitly, it will be done implicitly by Java

public class String_Intro {

    public static void main(String[] args) {

        String name = "Cybertek";

        String name2 = new String("Cybertek");

        String s1 = "Cat"; // String literal
        String s2 = "Cat"; // Cat is one object, it is shared by 2 variables, so s1 == s2

        System.out.println(s1 == s2);

        String d1 = "Dog";  // Dog and Dog are two different objects, bcs Java is  case sensitive
        String d2 = "Dog";  // d1 != d2

        System.out.println(d1 == d2);

        String t1 = new String("Tiger"); // in Java heap, two objects created for t1 and t2.
        String t2 = new String("Tiger");  // they are in different locations and t1 != t2

        System.out.println(t1 == t2);

        System.out.println("====================================");

        String c1 = "Cybertek";  // in String pool
        String c2 = new String("Cybertek");  // in Java Heap, outside of String pool
        String c3 = new String("Cybertek");  // heap

        System.out.println(c1 == c2);
        //          "Cybertek" == new String("Cybertek")  ===>   false

        System.out.println(c2 == c3);  // false

        System.out.println("==================================");

        String str = "Java";
        str = "Javascript";

        System.out.println(str);
        str = "Java";
        System.out.println(str);





















    }
}
