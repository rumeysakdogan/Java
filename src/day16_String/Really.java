package day16_String;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/*
ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"
 */
public class Really {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = in.next();

        String result;

        if(word.endsWith("ly")){
            result = "really???";
        }else{
            result = "never mind";
        }
        System.out.println(result);
    }
}
