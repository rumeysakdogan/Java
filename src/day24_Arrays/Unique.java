package day24_Arrays;
/*
1. write a program that can find the unique characters from a String
		Ex:
			input: aabccd
			output: bd

 */
public class Unique {
    public static void main(String[] args) {

        String str = "aabccd";

        String uniques = "";

        // easy approach:(only applicable for Strings)
        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            int first = str.indexOf(ch);
            int last = str.lastIndexOf(ch);

            if ( first == last ){
                uniques += ch;
            }
        }

        System.out.println(uniques);



    }
}

