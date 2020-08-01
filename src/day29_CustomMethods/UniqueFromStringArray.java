package day29_CustomMethods;
/*
 Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */
public class UniqueFromStringArray {
    public static void main(String[] args) {

        String arr[] = {"A", "B", "B", "C"};

        for(String each : arr){
            int count = 0;
            for (String i : arr){
                if ( each.equals(i) ){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(each);
            }
        }




    }
}
