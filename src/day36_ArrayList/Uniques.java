package day36_ArrayList;

import java.util.ArrayList;

/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
public class Uniques {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

            list.add(1);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(3);
            list.add(4);
            list.add(5);

        ArrayList<Integer> uniques = new ArrayList<>();

        for  (Integer each : list){
            if ( list.indexOf( each ) == list.lastIndexOf(each) ){
            uniques.add(each);
            }
        }

        System.out.println( uniques );

    }
}
