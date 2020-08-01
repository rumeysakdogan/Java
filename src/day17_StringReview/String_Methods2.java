package day17_StringReview;

public class String_Methods2 {
    public static void main(String[] args) {

        // equals(str) => boolean

        String s1 = "Cat";  // string pool
        String s2 = new String("Cat");    // heap

        System.out.println(s1 == s2);  // false
        String s3 = new String("Cat");    // heap

        System.out.println(s2 == s3);   // false

        System.out.println(s2.equals(s3)); // true
        System.out.println(s1.equals(s3));  // true

        // equalsIgnoreCase(str) => boolean

        String s4 = "java";
        String s5 = "Java";

        System.out.println(s4.equals(s5)); // false
        System.out.println(s4.equalsIgnoreCase(s5));  // true

        String s6 = "MuHTaR";
        String s7 = "mUhtar";

        System.out.println(s6.equalsIgnoreCase(s7));

        // isEmpty() : checks if the length is 0

        String str = "";

        System.out.println(str.isEmpty());

        String str2 = "  ";

        str2 = str2.trim(); // ""

        System.out.println(str2.isEmpty());

        // contains(str):

        String str3 = "Java, C#, Python, Ruby, C++";

        System.out.println(str3.contains("Java")); // true
        System.out.println(str3.contains("java"));  // false

        String str4 = "ABCD";

        System.out.println(str4.contains("D"));

        // startsWith() , endsWith():

        String str5 = "Cybertek School";

        System.out.println(str5.startsWith("E") || str5.startsWith("C")); // true

        System.out.println(str5.startsWith("CyberABC")); // false

        String str6 = "Corona";

        System.out.println(str6.endsWith("Virus"));

        String str7 = "Today is a great day";

        System.out.println(str6.endsWith("great"));
        
    }
}
