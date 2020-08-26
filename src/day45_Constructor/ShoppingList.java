package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

/*
 create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list
 */
public class ShoppingList {

    public static void main(String[] args) {

        Item item1 = new Item("tomato",0.79,5);
        Item item2 = new Item("potato",0.19,25);
        Item item3 = new Item("apple",0.39,7);
        Item item4 = new Item("banana",0.59,6);
        Item item5 = new Item("cucumber",0.49,4);

        ArrayList<Item> listOfItems = new ArrayList<>();
        listOfItems.addAll(Arrays.asList(item1, item2, item3, item4, item5));


        double totalCost = 0;

        for (Item each : listOfItems){
            totalCost += each.calcCost();
        }

        System.out.println("Total cost for the shopping: "+totalCost);

        System.out.println("============================================");

        Item[] items ={ item1, item2, item3, item4, item5 };

        double totalCost2 = 0;
        for (int i = 0; i < 5; i++) {
            totalCost2 += items[i].calcCost();
        }

        System.out.println("Total cost: " + totalCost2);

    }
}
