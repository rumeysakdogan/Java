package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {

    public static void main(String[] args) {


        ArrayList<Character> charList = new ArrayList<>();
        charList.addAll( Arrays.asList('a', 'b', 'c', '3', '4', '5', '6' ,'&', '%', '@', '#', '*'));


        charList.removeIf( p -> Character.isDigit(p) || Character.isAlphabetic(p) );

        System.out.println(charList);

        System.out.println("==================================================");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll( Arrays.asList('a', '1', 'b','2', 'c', 'd', '$', '?' ,'&', '@', '#', '*'));

        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> specialChar = new ArrayList<>();


        digits.addAll(chars);

        digits.removeIf( p -> !Character.isDigit(p) );

        System.out.println( "Digits: " + digits );  // [1, 2]



        letters.addAll(chars);

        letters.removeIf( p -> !Character.isLetter(p) );

        System.out.println("Letters: " + letters);  // [a, b, c, d]



        specialChar.addAll(chars);

        specialChar.removeAll(digits);
        specialChar.removeAll(letters);

        // specialChar.removeIf( p -> Character.isDigit(p) || Character.isLetter(p) );

        System.out.println( "Special characters: " + specialChar);  // [$, ?, &, @, #, *]

    }
}
