package day35_ArrayList;

import java.util.ArrayList;

/*
    1. write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
 */
public class ReversedOrder {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
                list.add(1);    // index# : 0
                list.add(2);    //          1
                list.add(3);    //          2
                list.add(4);    //          3
                list.add(5);    //          4

        for (int i = list.size()-1; i >= 0; i--){
            System.out.print( list.get(i)+" ");
        }

    }
}
