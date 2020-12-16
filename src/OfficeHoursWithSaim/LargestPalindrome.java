package OfficeHoursWithSaim;

import java.util.ArrayList;
import java.util.Arrays;

/*
* Create a method that will accept a String ArrayList and return the largest Palindrome String from it

	=> Assume there is no Strings with the same length and there will be at least one element
	*
	*  -> "dad" , "abcba" , "racecar" , "cat"
	*
	*

 */
public class LargestPalindrome {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("dad" , "abcba" , "racecar" , "cat", "deleveled"));
        System.out.println( largestPalindrome(words));
    }

    public static String largestPalindrome(ArrayList<String> words){

        String largestStr = "";

        for(String word : words){

            if(word.length() > largestStr.length()){
                if(isPalindrome(word)){
                    largestStr = word;
                }
            }
        }

        return largestStr;
    }

    // helper method : to check if a word isPalindrome or not
    private static boolean isPalindrome(String str){

        for (int i = 0; i < str.length()/2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

}
