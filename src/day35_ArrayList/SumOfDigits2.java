package day35_ArrayList;

public class SumOfDigits2 {

    public static void main(String[] args) {

        String str = "Today's date is 04/27/2020";
        int sum = 0;

        for ( char each : str.toCharArray() ){
            if ( Character.isDigit( each )){
                sum += Integer.parseInt( ""+each);
            }
        }

        System.out.println(sum);

        /*
         Character.isDigit(char) : verifies if the char is digit or not, returns boolean
         Character.isLetter(char) : verifires if the cahr is letter or not, returns boolean
         */
    }
}
