package day29_CustomMethods;
/*
 9. write a method that can check if a string is palindrome,
  print true if it's  otherwise print false

 */
public class Palindrome {

    public static void main(String[] args) {

        isPalindrome("java");
        isPalindrome("mama");
        isPalindrome("Kayak");
    }

    public static void isPalindrome(String str){

        String reversed = "";

        for (int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }

        System.out.println( str.equalsIgnoreCase(reversed) );
    }
}
