package day10_IfStatements;

public class Character_Identify {

    public static void main(String[] args) {

        char character = '!';

        boolean isAlphabetic = (character >=65 && character <=90) || (character >= 97 && character <= 122);
        // String alphabet ="";

        if (isAlphabetic){
            System.out.println(character+" is an Alphabetic");
            // alphabet = character+" is an Alphabetic";
        }else{
            System.out.println(character+" is not an Alphabetic");
            // alphabet = character+" is an Alphabetic";
        }
           // System.out.println(alphabet);

        boolean isDigit = character >= 48 && character <=57;
        String digit = "";

        if(isDigit){
            digit = character+" is a digit";
        }else{
            digit = character+" is not a digit";
        }
            System.out.println(digit);

        boolean specialChar = !isAlphabetic && !isDigit;
        String specialCharacter = "";

        if(specialChar){
            specialCharacter = character+" is a special character";
        }else{
            specialCharacter = character+" is not a special character";
        }
        System.out.println(specialCharacter);
    }
}
