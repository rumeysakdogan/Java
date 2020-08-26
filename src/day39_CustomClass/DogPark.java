package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {

        Dog[] dogPark = { new Dog("Karaoglan", "German Shepperd", "Medium",  6, "Black"),
                new Dog("Akbas", "Anatolian Sheppard", "Large",  2, "White"),
                new Dog("Red", "Golden", "Medium",  4, "Yellow"),
                new Dog("Chance", "Cocker spaniel", "small",1,"Golden"),
                new Dog("Roko", "German Sheper", "Medium", 3, "Brown") };
// index#:                  0           1          2          3          4



        for (int i = 0; i < dogPark.length ; i++) {
            dogPark[i].getDogInfo();
        }

        System.out.println("=======================================================");

        for (Dog eachDog : dogPark){
            eachDog.getDogInfo();
        }

        System.out.println("=======================================================");
        String food = "treats";

        for (Dog eachDog : dogPark){
            eachDog.eat(food);
        }

        System.out.println("=======================================================");
        String drink = "water";

        for (Dog eachDog : dogPark){
            eachDog.drink(drink);
        }

        System.out.println("=======================================================");

        for (Dog eachDog : dogPark){
            eachDog.play();
        }
        System.out.println("=======================================================");

        for (Dog eachDog : dogPark){
            eachDog.sleep();
        }

    }
}
