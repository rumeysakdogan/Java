package day16_String;
/*
3. write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself
    4. Write a program  for CheckWords:
        Program accepts 3 words and :
            - if they are same length:      print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
public class CheckWords {

    public static void main(String[] args) {

        String str = "I like Java";

        if(str.length()==0){
            System.out.println("String is empty");
        }else if(str.length()>3){
            System.out.println(str.substring(str.length()-3));
        }else{
            System.out.println(str);
        }

        String result = (str.length()==0) ? "String is empty" :(str.length()>3)
                ? str.substring(str.length()-3) : str;

        System.out.println(result);

        System.out.println("===================");

        String str1 = "abc";
        String str2 = "abcd";
        String str3 = "abcd";

        boolean allSame = (str1.length() == str2.length()) && (str1.length() == str3.length());
        boolean allDifferent = (str1.length() != str2.length()) && (str1.length() != str3.length()) && (str2.length() != str3.length());

        String result2 = "";

        if(allSame){
            result2 = "All words have same length";
        }else if(allDifferent){
            result2 = "All different length";
        }else{
            result2 = "Not Same nor Different lengths";
        }
        System.out.println(result2);

    }
}
