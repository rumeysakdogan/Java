package day25_Practices;
/*
Create an int array called numbers that has length of 100 and Assign 1-100 to each index of the array.
 then print out all the even numbers. MUST use continue statement
 */
public class EvenNumbers {
    public static void main(String[] args) {

        int[] arr = new int[100];

        for (int i = 1; i <= 100 ; i++){
            arr[i-1] = i;
            if ( i % 2 != 0){
                continue;
            }
            System.out.print(arr[i-1]+" ");
        }

/*     for-each approach: not preferred for this one

        int i = 1;
         for (int each : arr){
             each = i;
             i++;
             if ( i % 2 == 0){
               continue;
             }
            System.out.print(each+" ");
         }
*/

    }
}
