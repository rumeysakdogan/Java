package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {

        //charAt(index) => char

        String str = "Cybertek";
        //            01234567

        char ch = str.charAt(7);

        System.out.println(ch);

        // concat(str) => str

        String str2 = "Cybertek";

        str2 = str2.concat(" School"); // str2+ " School"

        System.out.println(str2);

        // length() => int

        String str3 = "Cybertek";

        int l = str3.length();

        System.out.println(l);

        // last index => length()-1

        char ch1 = str3.charAt(str3.length()-1);

        System.out.println(ch1);

        // toUpperCase() / toLowerCase()

        String str4 = "cybertek";

        str4 = str4.toUpperCase();

        System.out.println(str4);   // CYBERTEK

        String str5 = "JAVA";
        str5 = str5.toLowerCase();

        System.out.println(str5);   // java

        // trim() : get rid of unused spaces

        String str6 = "         Cybertek            ";
        str6 = str6.trim();
        System.out.println(str6);

        // substring(beginning index; ending index(not included))
        // substring(beginning index) : print till the end of string

        String str7 = "I like Java Language";
                    // 0123456789...
        String word = str7.substring(7,11);

        System.out.println(word);

        // indexOf & lastIndexOf()   ==> int

        String str8 = "Hello Batch 20, Have a Wonderful day, We are happy to see you";

        int i1 = str8.indexOf("W");

        System.out.println(i1);
        System.out.println(str8.charAt(23));

        int i2 = str8.indexOf("We");
        System.out.println(i2);

        String str9 = "Java Java Java";
        int i3 = str9.lastIndexOf("Java ");
        System.out.println(i3);


        // replace() , replaceFirst()

        String s1 =  "I like Java, Java is a programming language";
        s1 = s1.replace("Java","C#");

        System.out.println(s1);

        String s2 =  "I like Java, Java is a programming language";
        s2 = s2.replaceFirst("Java","C#");

        System.out.println(s2);

        String s3 =  "I like Java, Java is a programming language";
        s3 = s3.replace("Java is","C# is");

        System.out.println(s3);


    }
}
