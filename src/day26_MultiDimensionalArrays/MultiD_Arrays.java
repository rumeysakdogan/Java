package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiD_Arrays {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B'};
        char[] ch2 = {'C', 'D', 'E'};
        char[] ch3 = {'F', 'G', 'H'};

//index # of element:       0    1      0    1    2      0    1    2
        char[][] ch2D = { {'A', 'B'}, {'C', 'D', 'E'}, {'F', 'G', 'H'}};
//                            ch1           ch2               ch3
//index # of array:            0             1                 2


        System.out.println(Arrays.toString(     ch2D[0]     ));  //  [A, B]
        System.out.println(Arrays.toString(     ch2D[1]     ));  //  [C, D, E]
        System.out.println(Arrays.toString(     ch2D[2]     ));  //  [F, G, H]

        System.out.println(     ch2D[2][2]   );     // H
        System.out.println(     ch2D[1][0]   );     // C
        System.out.println(     ch2D[2][1] +"  "+ ch2D[0][1]    );   // G B


        System.out.println("========================");


        // {1, 2, 3}  , {4} , {5, 6} , {7, 8, 9, 10}

//                             0  1  2      0     0  1     0  1  2   3
        int[][] numbers2D = { {1, 2, 3}  , {4} , {5, 6} , {7, 8, 9, 10} };
//                                0         1       2           3

        System.out.println(Arrays.toString(    numbers2D[3]     )); // [7, 8, 9, 10]
        System.out.println(Arrays.toString(    numbers2D[2]     )); // [5, 6]
        System.out.println(Arrays.toString(    numbers2D[1]     )); // [4]
        System.out.println(Arrays.toString(    numbers2D[0]     )); // [1, 2, 3]

        for (int[] each: numbers2D){
            System.out.println(Arrays.toString( each ));
        }

        // to print multi-dimensional array we use Arrays.deepToString(arrayName):

        System.out.println(Arrays.deepToString(numbers2D)); // [[1, 2, 3], [4], [5, 6], [7, 8, 9, 10]]
    }
}
