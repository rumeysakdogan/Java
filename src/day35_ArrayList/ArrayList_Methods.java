package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {

        ArrayList<String> earlyBirds = new ArrayList<>();
            earlyBirds.add("Ibrahim");
            earlyBirds.add("Virginia");
            earlyBirds.add("Ziiadin");  // [Ibrahim, Virginia, Ziiadin, Erfan, Aalia]
            earlyBirds.add("Erfan");
            earlyBirds.add("Aalia");


//      set(index, newElement) : updates the old element at the given index, with the new element
//                               it does not make any adjustment to the arraylist size

            earlyBirds.set(2,"Aslan");  // [Ibrahim, Virginia, Aslan, Erfan, Aalia]
            earlyBirds.set(0,"Ian");    // [Ian, Virginia, Aslan, Erfan, Aalia]

        System.out.println( earlyBirds );

//      clear() : clears the arrayList and sets its size to 0.

            earlyBirds.clear();

        System.out.println( earlyBirds );  // []
        System.out.println( earlyBirds.size() );  // 0


        System.out.println("================================================");

// remove (int index) : removes the element at the given index, and adjusts the size.

        ArrayList<Integer> list = new ArrayList<>();
            list.add(1);    // index# : 0
            list.add(2);    //          1
            list.add(3);    //          2
            list.add(4);    //          3
            list.add(5);    //          4

//                                index#:   0  1  2  3

        list.remove(2);          //  [1, 2, 4, 5]
        list.remove(3);          //  [1, 2, 4]
        System.out.println( list );     //  [1, 2, 3, 4, 5]

        System.out.println("================================================");

//  remove ( Element ) : removes the first matching element , and adjusts the size.

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);    // index# : 0
        list2.add(2);    //          1
        list2.add(3);    //          2
        list2.add(4);    //          3
        list2.add(5);    //          4

//   int a = 1;
//   list2.remove(a);  // [1, 3, 4, 5] : removes the element at index 1

    Integer a = 1;

    list2.remove(a);  // [2, 3, 4, 5] : removes element 1

        System.out.println( list2 ); // [1, 2, 3, 4, 5]


        System.out.println("================================================");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Hamit");     // index# : 0
        list3.add("Lilia");     //          1
        list3.add("Bulent");    //          2
        list3.add("Viorel");    //          3
        list3.add("Musa");      //          4


       //   list3.remove(2);          // [Hamit, Lilia, Viorel, Musa]
       // list3.remove("Bulent");  // [Hamit, Lilia, Viorel, Musa]

        boolean isRemoved = list3.remove("Bulent");  // true
        System.out.println( isRemoved );
        System.out.println( list3 );





    }
}
