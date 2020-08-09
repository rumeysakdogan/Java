package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        Dog[] dogPark = { new Dog(), new Dog(), new Dog(), new Dog(), new Dog() };
// index#:                  0           1          2          3          4


        dogPark[0].setDogInfo("Karaoglan", "German Shepperd", "Medium",  6, "Black");
        dogPark[1].setDogInfo("Akbas", "Anatolian Sheppard", "Large",  2, "White");
        dogPark[2].setDogInfo("Red", "Golden", "Medium",  4, "Yellow");
        dogPark[3].setDogInfo("Chance", "Cocker spaniel", "small",1,"Golden");
        dogPark[4].setDogInfo("Roko", "German Sheper", "Medium", 3, "Brown");


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
