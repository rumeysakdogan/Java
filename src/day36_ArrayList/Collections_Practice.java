package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20,15,10,40,30));

        System.out.println( descending(list) );  // [40, 30, 20, 15, 10]

    }

    public static ArrayList<Integer> descending(ArrayList<Integer> list){

        Collections.sort(list);

        ArrayList<Integer> desList = new ArrayList<>();

        for (int i = list.size()-1 ; i >= 0 ; i--){
            desList.add( list.get(i) );
        }

        return desList;
    }
}
