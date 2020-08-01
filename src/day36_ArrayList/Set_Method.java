package day36_ArrayList;

import java.util.ArrayList;

/*
warmup tasks:
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]

 */
public class Set_Method {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);

            list.set( list.size()-1, 0 );

        System.out.println( list );

        System.out.println("==========================================");

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++){
            list2.add(i);
        }

        for (int i = 0; i < list2.size(); i++){

            if ( list2.get(i) % 2 != 0){
                list2.set( i, list2.get(i) * 2 );
            }else{
                list2.set( i, list2.get(i) * 3 );
            }

        }

        System.out.println( list2 );

/*      for-each loop version:

        for (Integer each : list2){
            if ( each % 2 != 0){
                list2.set( list2.indexOf(each), each * 2);
            }
        }
*/

    }
}
