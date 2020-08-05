package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
        // remove, size, set, get, equals, contains, clear
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll( Arrays.asList("BMW", "Mercedes", "Infinity", "Tesla", "WV", "Lamborghini", "Lexus", "Tesla", "Tesla", "Mazda") );
                      //             0        1           2          3      4         5            6        7        8

        System.out.println( cars );                     // [BMW, Mercedes, Infinity, Tesla, WV, Lamborghini, Lexus, Tesla, Tesla]

       // cars.remove(3);
       // cars.remove("Tesla");                                                  remove method removes first matching object
       // cars.removeAll ( Arrays.asList("Tesla") );                         // [BMW, Mercedes, Infinity, WV, Lamborghini, Lexus]

       // cars.removeIf( p -> p.toLowerCase().contains("m") );                        // [Infinity, Tesla, WV, Lexus, Tesla, Tesla]

        cars.retainAll( Arrays.asList("Tesla"));                                    //  [Tesla, Tesla, Tesla]

        System.out.println( cars );                            // [BMW, Mercedes, Infinity, WV, Lamborghini, Lexus, Tesla, Tesla]


        System.out.println("=====================================================");

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.addAll( Arrays.asList("Eggs", "Milk", "Paper Towels", "Toilet Paper", "Mango" , "Orange" , "Avocado" , "Dragon Fruit"));
        System.out.println( groceryList );

        // pepsi
        boolean r1 = groceryList.contains("pepsi");
        System.out.println( r1 );

        // eggs, milk, orange, water
        boolean r2 = groceryList.containsAll( Arrays.asList("Eggs", "Milk", "Orange", "Water"));
        System.out.println( r2 );

        System.out.println( "Total # of items: " +groceryList.size() );

        // set the dragon fruit to apple:
        groceryList.set( groceryList.size()-1, "Apple");                            // [Eggs, Milk, Paper Towels, Toilet Paper, Mango, Orange, Avocado, Apple]

        System.out.println( groceryList );

        groceryList.set( groceryList.indexOf("Paper Towels"), "Dishwasher" );      // [Eggs, Milk, Dishwasher, Toilet Paper, Mango, Orange, Avocado, Apple]
        System.out.println( groceryList );

        groceryList.clear();

        System.out.println( groceryList );  // []
    }
}
