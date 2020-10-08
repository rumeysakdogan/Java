package day60_Collection;

import java.util.*;

public class SetPractice {
// write a program that can remove duplicates from string

    public static void main(String[] args) {
        String str = "aaaabbbcccccddddddee";

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        Set<String> s1 = new LinkedHashSet<>();
        s1.addAll( Arrays.asList(arr));

        System.out.println( s1 );

        System.out.println("========================");
        // easier way removing duplicates:

        String str2 = "zzzzyyyyxxxxx";
        str2 = new LinkedHashSet<>( Arrays.asList( str2.split("") ) ).toString();

        str2 = str2.replaceAll("[] ,\\[]","");
        System.out.println(str2);

        System.out.println("========================");
        // solution without using temporary variables (by using instance of class):

        String a1 = "abcabc";   //a, b, c
        String a2 = "cbabbcc";      //a, b, c

        a1 = new HashSet<>(Arrays.asList( a1.split(""))).toString();
        a2 = new HashSet<>(Arrays.asList( a2.split(""))).toString();

        System.out.println( a1.equals(a2));

        System.out.println("============================================");

        String str5 = "ttttyyyyyuuuuuuuiiiiiiaaaaaaaaa";

        str5 = new LinkedHashSet<>( Arrays.asList(str5.split(""))).toString() ;

        System.out.println(str5);

        str5 = str5.replace("[", "").replace(", ", "").replace("]","");

        System.out.println(str5);

        System.out.println("=============================================");

        String d1 = "abcabc";   // a b c
        String d2 = "cabbbc";   // a b c

        HashSet<String> b1 = new HashSet<>();
        b1.addAll(  Arrays.asList( d1.split("")  ) );
        System.out.println(b1);

        HashSet<String> b2 = new HashSet<>();
        b2.addAll( Arrays.asList( d2.split("")) );
        System.out.println(b2);

        a1 = b1.toString();
        a2 = b2.toString();

        System.out.println( a1.equals(a2));

        System.out.println("========================================================");
        String x1 = "cacacabb";
        String x2 = "bbcaaaaa";

        x1 =   new TreeSet<>(Arrays.asList( x1.split(""))).toString(); // a b c
        x2 =   new TreeSet<>(Arrays.asList( x2.split(""))).toString(); // a b c

        System.out.println(x1.equals(x2));

        System.out.println("===========================================================");

        String[] names = {"Aalia", "Mustafa", "Elkem", "Aalia", "Aalia", "Virginia"};

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.addAll( Arrays.asList( names ) );

        names = set1.toArray(new String[0]);  // converting collection type to array

        System.out.println(  Arrays.toString(names) );

        System.out.println("===============================================================");

        String[] names2 = {"Roman", "Abzal", "Nurbiye", "Roman", "Roman", "Roman", "Roman", "Roman"};

        names2 = new LinkedHashSet<>( Arrays.asList(names2) ).toArray( new String[0] );

        System.out.println( Arrays.toString(names2) );

        System.out.println("====================================================================");
        Integer[] numbers = {1,1,1,2,2,2,2,0,0,0,0,0,1,1,1,2,3,4,5,6,7,8,9};

        numbers =  new TreeSet<>( Arrays.asList(numbers) ).toArray(new Integer[0]);

        System.out.println( Arrays.toString(numbers));

    }
}
