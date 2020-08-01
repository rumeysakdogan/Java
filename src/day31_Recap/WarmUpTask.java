package day31_Recap;

public class WarmUpTask {

    public static void main(String[] args) {

        String str = "aabcccd";

        System.out.println( uniques("aabcccd") );

    }

    /*
    1.  write a return method called frequency that accepts two parameters: string str and char ch,
        the method returns the frequency of the ch from the str as an int
        Ex:
        frequency("AAA", 'A') ==>  3
        frequency("ABAB", 'B') ==> 2
        Note: MUST use Arrays and for each loop

        please copy paste the method to the util class
*/

   public static int frequency(String str, char ch){
       int count = 0;
       char[] arr = str.toCharArray();

       for (char each: arr){
           if (each == ch){
               count++;
           }
       }
       return count;
   }

    /*
    2. use the above method to create another called uniques that accepts a string parameter
            and returns it's unique characters as String
            Ex:
            uniques("ABBC");       ==> "AC"
            uniques("Cybertek");   ==> "cybrtk"

   */

   public static String uniques(String str){

       String uniques ="";

       for ( char each : str.toCharArray() ){
           if ( frequency(str,each)==1 ){
               uniques += each;
           }
       }
       return uniques;
   }


}
