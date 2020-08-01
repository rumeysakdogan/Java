package day25_Practices;
/*
Create an int array called numbers that has length of 100 and Assign 1-100 to each index of the array.
 then print out all the even numbers. MUST use continue statement

 */
public class Array_1_100 {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for ( int i = 0; i < numbers.length ; i++){
            numbers[i] = i+1;
        }

        for (int each : numbers){
            if ( each % 2 != 0){
                continue;
            }
            System.out.print(each+" ");
        }
    }
}
