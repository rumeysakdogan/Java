package day28_Recap;

import java.util.Arrays;

public class MultiD_ArrayPractice2 {
    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5} };

// index # of elements:        0 1 2    0 1         0 1 2     0   1
// index # of 1D-ARRAYS:         0       1            0         1
        int[][][] arr3D = { { {1,2,3}, {4,5} }, { { 6,7,8}, { 9, 10} } };
// index # of 2D-ARRAYS:         0                         1

        System.out.println(Arrays.deepToString(arr3D));  // [[[1, 2, 3], [4, 5]], [[6, 7, 8], [9, 10]]]

        System.out.println(Arrays.deepToString(arr3D[1])); // [[6, 7, 8], [9, 10]]

        System.out.println(Arrays.toString(arr3D[0][1])); // [4, 5]

        System.out.println(arr3D[1][0][1]);    // 7


        System.out.println("============================================");

        for ( int i = 0; i < arr3D.length; i++){
            for (int j = 0; j < arr3D[i].length ; j++) {
                for (int k = 0; k < arr3D[i][j].length ; k++) {
                    System.out.print(   arr3D[i][j][k] + " "    );
                }
                System.out.println();
            }
        }

        System.out.println("\n============================================");

        for (int[][] each2D : arr3D){
            for (int[] each1D : each2D){
                for (int each : each1D){
                    System.out.print( each+ " " );
                }
            }
            System.out.println();
        }

        System.out.println("\n============================================");

    }
}
