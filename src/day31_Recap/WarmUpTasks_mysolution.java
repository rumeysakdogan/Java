package day31_Recap;

import library.Util;

/*
 1.  write a return method called frequency that accepts two parameters: string str and char ch,
 the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop

            please copy paste the method to the util class

    2. use the above method to create another called uniques that accepts a string parameter
     and returns it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"

                please copy paste the method to the util class

    3. use the methods removeDup and frequency in util class to create a third method
    called frequencyOfChars that can find the frequency of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3

            please copy paste the method to the util class

 */
public class WarmUpTasks_mysolution {

    public static void main(String[] args) {

        int n1 = frequency("AAA", 'A');
        int n2 = frequency("ABAB", 'B');
        System.out.println(n1);
        System.out.println(n2);

        System.out.println(  uniques("ABBC")    );
        System.out.println(  uniques("Cybertek")   );

        System.out.println(  frequencyOfChars("AAABBBBCCCC")   );
        System.out.println(  frequencyOfChars("DDEFJJJ")   );

    }

    public static int frequency(String str, char ch){

        int count = 0;

        for(int i = 0; i < str.length(); i++){
          char c = str.charAt(i);
                if ( c == ch){
                    count++;
                }
        }
        return count;
    }

    public static String uniques(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (frequency(str,str.charAt(i)) == 1){
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static String frequencyOfChars(String str){

        String result = "";

        String nonDup = Util.removeDuplicates(str);

        for (int i = 0; i < nonDup.length(); i++){

            result += ""+ nonDup.charAt(i) + Util.frequency(str, nonDup.charAt(i));
        }

        return result;
    }
}
