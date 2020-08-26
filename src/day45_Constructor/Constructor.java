package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {

    public Constructor(){

        System.out.println("No arg constructor");
    }

    public Constructor(int a){
        System.out.println("int arg constructor");
    }

    public Constructor(String a){
        System.out.println("String arg constructor");
    }
    public static void main(String[] args) {

        Constructor obj1 = new Constructor();
/*
        ArrayList<Integer> list1 = new ArrayList<>();   // default constructor for arraylist
        list1.addAll(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list2 = new ArrayList<>(list1);   // constructor that accepts collection type
        System.out.println(list2);

 */




    }

}
