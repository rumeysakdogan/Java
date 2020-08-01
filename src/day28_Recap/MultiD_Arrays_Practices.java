package day28_Recap;

/*
int arr2D[][] = { {1,2,3},  {4,5,6,7,8}, {9,10,11,12,13} };

task 1:
9 10 11 12 12
4 5 6 7 8
1 2 3

task 2:
3 2 1
8 7 6 5 4
13 12 11 10 9

task 3:
13 12 11 10 9
8 7 6 5 4
3 2 1
 */
public class MultiD_Arrays_Practices {
    public static void main(String[] args) {

    int arr2D[][] = { {1,2,3},  {4,5,6,7,8}, {9,10,11,12,13} };
    //                  0           1              2

        // TASK1:


    for ( int i = arr2D.length-1; i >= 0; i--){
        for (int j = 0; j < arr2D[i].length; j++ ){
            System.out.print(arr2D[i][j]+" ");
        }
        System.out.println();
    }

        System.out.println("\n==============================");
        // TASK2:

        for (int i = 0; i < arr2D.length; i++){
            for (int j = arr2D[i].length-1; j >= 0 ; j-- ){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("\n==============================");

        // TASK3:

        for ( int i = arr2D.length-1; i >= 0; i--){
            for (int j = arr2D[i].length-1; j >= 0 ; j-- ){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }







    }
}
