package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuestionsFromNadir {
    public static void main(String[] args) {

/*
task1:
        => Given a String with numbers and letters. Output the sum of all numbers in given String.
        For example: Input: String str = “jav34ajs4jk6”; Output: 44 (34 + 4 + 6 = 44)
*/
        String str = "jav340ajs6jk5hjh5kjk8kjkj";
//        int sum = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            String temp = "";
//            if( Character.isDigit( str.charAt(i) )){
//                for (int j = i; j < str.length(); j++) {
//                    if(Character.isDigit(str.charAt(j))){
//                        temp += str.charAt(j);
//                        i++;
//                    }else{
//                        break;
//                    }
//                }
//                sum+=Integer.parseInt(temp);
//                continue;
//            }
//        }
//        System.out.println(sum);
        

/*
task2:
        Given an array of integers. how do you put zeros at the end of array without sorting an array?
        For example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0]  done!
*/
        int[] nums = {4,5,0,0,2,0,1,0};

        int[] array = new int[nums.length];

        int k = 0;
        for ( int each : nums){
            if (each != 0){
                array[k] = each;
                k++;
            }
        }

        System.out.println( Arrays.toString( array ));

    }
}
