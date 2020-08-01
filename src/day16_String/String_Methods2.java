package day16_String;

public class String_Methods2 {

    public static void main(String[] args) {
        // isEmpty(): returns true if string is not empty otherwise returns false

        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String name2 = "";
        System.out.println(name2.isEmpty());

        // equals(str): compares the text of the strings

        String str1 = "Java"; // string pool
        String str2 = new String("Java"); // heap

        System.out.println(str1 + " : " + str2);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); // false

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true

        String str5 = "Java";
        String str6 = "Java";
        System.out.println(str5 == str6);  // true
        System.out.println(str5.equals(str6)); // true

        // equalsIgnoreCase():

        String str7 = "JAVA";
        String str8 = "java";
        System.out.println(str7.equals(str8)); // false
        System.out.println(str7.equalsIgnoreCase(str8)); // true

                    // YES, yes, Yes ,yEs  ==> yes

        // contains() :
        String str9 = "I like to learn java programming language";
        System.out.println(str9.contains("Python"));
        System.out.println(!str9.contains("Python"));

        // startsWith(str):
        String s10 = "Rumeysa";
        System.out.println(s10.startsWith("R"));

        // endsWith(str) :
        String s11 = "Rumeysa";
        System.out.println(s10.endsWith("sa"));


    }

}
