package day23_Arrays;

public class Array_GroceryList {
    public static void main(String[] args) {

        String[] shoppingList = new String[7];

        shoppingList[0] = "Toilet Paper";
        shoppingList[1] = "Hand Sanitizer";
        shoppingList[4] = "Eggs";
        shoppingList[6] = "Hand Soap";
        shoppingList[3] = "Water";
        shoppingList[2] = "Milk";
        shoppingList[5] = "Bread";

        for (int i = 0; i < shoppingList.length; i++){
            System.out.println( shoppingList[i] );
        }

        System.out.println("=============================");

        String[] groceries = {"Cherry", "Tomato", "Potato", "Onion"};
        double[] prices = { 4.30, 1.19, 2.10, 1.15};

        for (int i = 0; i < groceries.length; i++){
            System.out.println( groceries[i] + " : $" + prices[i] );
        }


    }
}
