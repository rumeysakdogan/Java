package day31_Recap;

import library.Util;
/*
    3. use the methods removeDup and frequency in util class to create a third method
        called frequencyOfChars that can find the frequency of all characters from a string
        Ex:
        frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
        frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3

 */
public class FrequencyOfChars {

    public static void main(String[] args) {
        
        String str = "AABBBCCC";  // => A2B3C3

        String expectedResult = "";   //  A2B3C3

        String nonDup = Util.removeDuplicates(str); //ABC

        System.out.println( frequencyOfChars(str)  );
    }

    public static String frequencyOfChars( String str ){

        String result = "";

        String nonDup = Util.removeDuplicates(str);

        for ( char each : nonDup.toCharArray()){
            result += ""+ each + Util.frequency(str, each);
        }
        return result;
    }
}
