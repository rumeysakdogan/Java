package day29_CustomMethods;
// create a method that can reverse any String
public class ReverseString {

    public static void main(String[] args) {
        reverseString("rumeysa");
    }

    public static void reverseString(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}
