package day60_Collection;

import day54_Abstraction.carTask.Car;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();  // get, add, remove, set, removeAll, contains, size ..
            list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
            list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
            list1.add(6);
        System.out.println("Arraylist: " + list1);
        System.out.println(list1.get(2)); // fastest


        List<Integer> list2 = new LinkedList<>();// get, add, remove, set, removeAll, contains, size ..
            list2.addAll(Arrays.asList(1, 2, 3, 4, 5));
            list2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list2.add(6);   // add/remove fastest
        System.out.println("LinkedList: " + list2);
        System.out.println(list2.get(2));


        List<Integer> list3 = new Vector<>();// get, add, remove, set, removeAll, contains, size ..
            list3.addAll(Arrays.asList(1, 2, 3, 4, 5));
            list3.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list3.add(6);
        System.out.println("Vector: " + list3);
        System.out.println(list3.get(2));


        List<Integer> list4 = new Stack<>();// get, add, remove, set, removeAll, contains, size ..
            list4.addAll(Arrays.asList(1, 2, 3, 4, 5));
            list4.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list4.add(6);
        System.out.println("Stack: " + list3);
        System.out.println(list3.get(2));

        ((Stack)list4).pop();
        System.out.println( list4 );

        System.out.println("================================");

        Stack<Integer> list5 = new Stack<>();
            list5.addAll( Arrays.asList(1,2,3,4,5,6,7));
        System.out.println( list5);
        int lastObject = list5.pop();  // return the last object from the stack and remove from the stack

        System.out.println( list5);

        list5.removeAll( Arrays.asList(1,4,5));

        System.out.println(list5);

        int lastObject3 = list5.pop();

        System.out.println(list5);

        System.out.println("====================================================");

        int[] arr1 = {1,2,3,4};
        int[][] arr2 = { {1,2,3,4}, {5,6,7,8,9} }; // multidimensional

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");


        ArrayList<ArrayList<Integer>>  l2 = new ArrayList<>();  // list of lists
        //   l2.add("M");
        //   l2.add(5);

        l2.add(  new ArrayList<>( Arrays.asList(1,2,3,4))    );
        l2.add( new ArrayList<>( ) );

        l2.get(1).addAll( Arrays.asList(5,6,7,8,9) );

        l2.get(0).removeAll(Arrays.asList(1,3));

        System.out.println(l2);
        System.out.println("Size of first arrayList: " + l2.get(0).size() );
        System.out.println("Size of second arrayList: " + l2.get(1).size() );

        System.out.println("======================================================");

        List< List<String> >  groups = new ArrayList<>();
        groups.addAll( Arrays.asList(
                new ArrayList<>(Arrays.asList("Ali", "Veli", "Isa", "Olcay", "Adem")),
                new ArrayList<>(Arrays.asList("Muhtar", "Asiya", "Gurhan", "Saim", "Nadir")),
                new ArrayList<>(Arrays.asList("Mike", "Ayse", "Gokhan", "Sait", "Ross")),
                new ArrayList<>(Arrays.asList("Joe", "Hillary", "Bill", "Barack", "Luther"))


        ));

        for (List<String> eachGroup : groups) {
            System.out.println(eachGroup);
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        System.out.println(groups);

        System.out.println("======================================================");

        List< List<String> > groups2 = new ArrayList<>();
        groups.addAll( Arrays.asList(
                new Stack<>(), new Stack<>(),
                new Stack<>(), new Stack<>(),
                new Stack<>()));

        groups.get(0).addAll( Arrays.asList( "Alexey","Ana","Andrei","Busra Y","Busra O"    ));
        groups.get(1).addAll( Arrays.asList("Nickolas","Evgeniya","Aizhan","Kalbinur","Paola"));
        groups.get(2).addAll( Arrays.asList("Ceren","Elizaveta","Heydar","Hunisddin","Kalbinur"));
        groups.get(3).addAll( Arrays.asList("Murat", "Ayhan", "Uros", "Aysel", "Esra"));
        groups.get(4).addAll( Arrays.asList("Ashenafi", "Ali", "Hamid", "Mokinur", "Nikola"));

        for( List<String>  eachGroup : groups ){
            ( (Stack)eachGroup ).pop();
            System.out.println(eachGroup);
        }
          /*
        1. add 5 different names in each group
        2. iterate the list of lists (groups)
        3. print out the names of each student
         */

        System.out.println("======================================================");


        List< List<Car> > SUVs = new ArrayList<>();
        List< List<Car> > sedans = new ArrayList<>();
        List< List<Car> > trucks = new ArrayList<>();
        List< List<Car> > convertible = new ArrayList<>();



        List< List<Car> > cars = new ArrayList<>();

         /*
        iterate every single car and print out the:
            brand : model : price
         */

    }


        public void method1(){

        }  // methods in ArrayList

        public synchronized void method2(){

        }  // methods in Vector class

}
