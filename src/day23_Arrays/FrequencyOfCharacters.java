package day23_Arrays;

import java.util.Scanner;

/*
 write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps

 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();    // "ABAB"
        String nonDup = "";     // "AB"
        String result = "";     // "A2B2"

        for ( int i = 0; i < str.length(); i++){     // removing duplicates from str
            String s = ""+str.charAt(i);    // A, B, A, A
            if (!nonDup.contains(s)){
                nonDup += s;
            }
        }

        System.out.println(nonDup);

        // str ="ABAB"     nonDup = "AB"  ===> result = "A2B2"

        for(int j=0; j <= nonDup.length()-1; j++ ){

            char ch = nonDup.charAt(j);
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i) == ch){
                    count+=1;
                }
            }
            result += ""+ch + count;
        }

        System.out.println(result);

    }
}
