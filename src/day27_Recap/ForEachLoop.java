package day27_Recap;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5 };

        for ( int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n===========================");

// you CANNOT reverse the indexes in for-each loop:

        for  (int each : arr){
            System.out.print(each+" ");
        }

        System.out.println("\n===========================");

        for ( int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n===========================");

        int[] scores = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};

        int countDivBy3 = 0;
        for (int each : scores){
            if ( each % 3 != 0){
                continue;
            }
            System.out.print(each+" ");
            countDivBy3++;
        }
        System.out.println("\n"+countDivBy3);

        System.out.println("\n===========================");

        String[] names = { "AB", "ABC", "A", "AB", "ABCD" };

        for ( String each : names){
               if ( !each.contains("C")){
                   continue;
               }
            System.out.print(each+" ");
        }

        System.out.println("\n===========================");

        int[] grades = {80, 75, 65, 110, 90, 45, 56, 78};

        int max = grades[0];
        int min = grades[0];

        for (int each : grades) {
            if (each > max){
                max = each;
            }
            if (min > each){
                min = each;
            }
        }

        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min);


    }
}
