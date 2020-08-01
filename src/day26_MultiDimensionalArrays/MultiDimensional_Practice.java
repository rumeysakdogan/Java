package day26_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensional_Practice {
    public static void main(String[] args) {
//                                 0     1      0    1     2    3           0               0                  0
        String[][] scrumTeam = { {"T1","T2"} ,{"D1","D2", "D3","D4"},    {"SM"}    ,      {"PO"}      ,      {"BA"}   };
//                                 TESTERS         DEVELOPERS          SCRUM MASTER     PRODUCT OWNER    BUSINESS ANALYST
//                                    0                1                    2               3                  4



        String[] testers = {"T1","T2"};
        String[] developers = {"D1","D2", "D3","D4"};
        String[] sMaster =  {"SM"};
        String[] pOwner =  {"PO"};
        String[] bAnalyst =  {"BA"};

        String[] testers2 = {"T3", "T4"};

        System.out.println(Arrays.deepToString(scrumTeam));
//       [[T1, T2], [D1, D2, D3, D4], [SM], [PO], [BA]]

        scrumTeam[4][0] = "BA2";

        System.out.println(Arrays.deepToString(scrumTeam));
//      [[T1, T2], [D1, D2, D3, D4], [SM], [PO], [BA2]]

        scrumTeam[1][2] = "D7";

        System.out.println(Arrays.deepToString(scrumTeam));
//      [[T1, T2], [D1, D2, D7, D4], [SM], [PO], [BA2]]

        scrumTeam[0] = testers2;

        System.out.println(Arrays.deepToString(scrumTeam));
//      [[T3, T4], [D1, D2, D7, D4], [SM], [PO], [BA2]]

        System.out.println("========================================");

        for (String[] each :scrumTeam){
            for (String name : each){
                System.out.println(name);
            }
            System.out.println(Arrays.toString(each));
        }

        System.out.println("========================================");


        int[][] scores = { {10, 22, 14, 45}, {11, 55, 75, 105}, {93, 48, 125, 135, 13} };

//  print out all numbers that are divisible by 3 or  5

        for (int[] each1DArray : scores){
            for (int eachElement : each1DArray){
                if ( eachElement%3 == 0  || eachElement%5 == 0){
                    System.out.print(eachElement+" ");
                }
            }
        }


        System.out.println("========================================");


        int[][] a1 = {  {1,2}, {3, 4, 5} };
        int[][] a2 = {  {6,7}, {8, 9, 10} };


//                             0  1    0  1  2         0  1    0  1  2
//                               0        1              0         1
        int[][][] arr3D ={  { {1, 2}, {3, 4, 5} } , { {6, 7}, {8, 9, 10} }  };
//                                    0                     1







    }
}
