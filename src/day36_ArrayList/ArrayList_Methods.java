package day36_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

    // indexOf() : to find the index number of specific element

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);  // 0
        list.add(20);  // 1
        list.add(30);  // 2
        list.add(40);  // 3
        list.add(50);  // 4
        list.add(40);  // 5

        int a = list.indexOf(40);

        System.out.println(a);  // 3

        System.out.println( list.indexOf(60) );  // -1 mean that element does not exist in the list

    // lastIndexOf(): to find the index of last matching element

        int b = list.lastIndexOf(40);

        System.out.println(b);

     // contains() : returns boolean if list contains the given element or  not

        boolean bool = list.contains(300);

        System.out.println(bool);  // false

    // equals() : to compare if given two arrayLists are equal or not

        ArrayList<String> list1 = new ArrayList<>();
            list1.add("Cybertek");

        ArrayList<String> list2 = new ArrayList<>();
             list2.add("Cybertek");

        System.out.println( list1.equals( list2 )); // true

    // isEmpty() : returns boolean if arraylist size is 0 or not

        ArrayList<String> list3 = new ArrayList<>();

        System.out.println( list3.isEmpty() );  // true

    }
}
