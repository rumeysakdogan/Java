package day28_Recap;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[] arr1D = {1,2,3};
//                         0 1 2    0 1 2 3 4    0  1  2  3  4
        int[][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13}  };
//                          0           1               2

        System.out.println(Arrays.toString(arr2D[1]));  // single-dimensional array
        System.out.println(Arrays.deepToString(arr2D)); // multi-dimensional array

        System.out.println(arr2D[1][3]); // 7

        System.out.println("====================================");
//          nested for-loop:

        for ( int i = 0; i <= arr2D.length-1; i++ ){
            int[] each1DArray = arr2D[i];
            System.out.println(Arrays.toString(each1DArray));
            for (int j = 0; j <= each1DArray.length-1 ; j++) {
                    int eachNum = each1DArray[j];
                    if ( eachNum % 2 ==0) {
                        System.out.print(eachNum + " ");
                    }
            }
            System.out.println();
        }

        System.out.println("====================================");
//          nested for-each loop:

        for ( int[] each1D : arr2D){
            System.out.println(Arrays.toString(each1D));
            for (int eachElement : each1D){
                if (eachElement %2 != 0){
                    System.out.print(eachElement+" ");
                }
            }
            System.out.println();
        }



    }
}
