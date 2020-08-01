package day32_MethodOverLoading;

import library.Util;
/*
Write a method header on line two with the following specs:

Returns:
a String
Name:
alphabetical
Parameters:
a String called str
Purpose:
Return a string that is composed of each letter as long as the letter is later on in the alphabet
than its previous one.  You can assume actual parameters are lowercase.
See below examples.

Additional Info:
You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:
'a' < 'b' ==> True
'a' < 'a' ==> False
'a' > 'b' ==> False

Examples:
alphabetical("abczef") ==> "abcz"
alphabetical("adatplqzh") ==> "adtz"
alphabetical("dbeuptvwmy") ==> "deuvwy"
 */
public class alphabetical {
    public static void main(String[] args) {
        System.out.println( alphabetical("dbeuptvwmy") );
    }

    public static String alphabetical(String s){

        String result = "";

        s= Util.removeDuplicates(s);
        char[] arr= s.toCharArray();

        char temp = arr[0];

        result += temp;

        for (int i = 0; i <s.length(); i++) {
            if(arr[i]>temp){
                temp=arr[i];
                result += temp;
            }
        }
        return result;
    }
}
