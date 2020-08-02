package day37_ArrayList;

import library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 2. write a program that can find the frequency of character from a String
                DO NOT use nested loop
                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2
 */
public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "AABBCCDDEE";
        String result = "";

        ArrayList<String> list = new ArrayList<>();
            list.addAll(Arrays.asList(str.split("")));

        String nonDup = Util.removeDuplicates(str);

        for (String each : nonDup.split("")){
            result += each + Collections.frequency(list,each);
        }

        System.out.println(result);

    }
}
