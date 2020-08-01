package day24_Arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {

        // toCharArray(): to create a char array from a string

        String str = "ABCDE";

        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("==================");

        String str1 = "DCEBA";
        String str2 = "ADCBE";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));       // [D, C, E, B, A]
        System.out.println(Arrays.toString(ch2));       // [A, D, C, B, E]

        System.out.println(Arrays.equals(ch1,ch2));

        Arrays.sort(ch1);       // [A, B, C, D, E]
        Arrays.sort(ch2);       // [A, B, C, D, E]

        System.out.println(Arrays.equals(ch1,ch2));

        System.out.println("==================");

        // split(value): returns a String array, splits the string by given value

        String sentence = "I love Programming language";

        String[] words = sentence.split(" "); // [I, love, Programming, language]

        System.out.println(Arrays.toString(words));

        for (int i = words.length-1; i >= 0 ; i--){
            System.out.print(words[i]+" ");
        }

        System.out.println("\n==================");

        String s = "JAVA";

        String[] arr = s.split("");     // [J, A, V, A]  ==> each element is "String"

        System.out.println(Arrays.toString(arr));

        char[] c = s.toCharArray();             // [J, A, V, A]  ==> each element is "char"

        System.out.println(Arrays.toString(c));


    }
}
