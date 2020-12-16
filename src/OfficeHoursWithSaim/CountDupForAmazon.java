package OfficeHoursWithSaim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
[ Amazon 1st round question]

* Write a program to identify the frequency of duplicates words in a string. Print duplicates words and their frequency.


 */
public class CountDupForAmazon {

    public static void main(String[] args) {
        String str = "java is java language is useful java";
        countDups(str);
    }

    public static void countDups(String str){

        ArrayList<String> words = new ArrayList<>( Arrays.asList( str.split(" ") ) );
        // converted String to ArrayList of Strings
        String checked = "";

        for(String word : words) {

            if (!checked.contains(word)) {

                int freqOfEach = Collections.frequency(words, word);   // Ready method
                System.out.println(word + " : " + freqOfEach);
                checked += word + " ";
            }
        }
    }
}
