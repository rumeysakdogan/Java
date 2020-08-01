package day15_String;

import java.util.jar.JarOutputStream;

public class String_Methods {

    public static void main(String[] args) {
        String name = "Cybertek School is a great place";
        //             0123456789..

        // charAt(index#):
        char ch = name.charAt(0);  //'C'
        char ch1 = name.charAt(5); //'t'

        System.out.println(ch);
        System.out.println(ch1);

        //length() ==> returns int
        int l = name.length();
        System.out.println(l);

        int lastIndex = name.length()-1;  // or l-1

        System.out.println(lastIndex);

        char lastChar = name.charAt(lastIndex);
        System.out.println(lastChar);

        // concat(Str) : concatenation of a string not char or int
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");   // "Cybertek School"

        System.out.println(schoolName);

        String r= "Cybertek" + 123 + 'A' + true;
        System.out.println(r);

        String r2 = "Cybertek".concat("123");
        System.out.println(r2);

        //toLowerCase(): convert all characters to lowercase

        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();

        System.out.println(name1);

        //toUpperCase():

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();

        System.out.println(name2);

        // trim(): get rid of unused spaces ( spaces that are not used for separating words )

        String p = "        Cybertek     School       ";
        p = p.trim();
        System.out.println(p);


    }
}
