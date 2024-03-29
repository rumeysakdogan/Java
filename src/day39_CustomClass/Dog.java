package day39_CustomClass;

public class Dog {
  /*
    instance variables:
            name, breed, size, age, color
    instance methods:
            setDogInfo, getDogInfo, eat, drink, sleep...
   */

    String name;
    String breed;
    String size;
    int age;
    String color;


    public Dog(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        name = dogName;
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
    }

 /*    sets the info of the Dog

    public void setDogInfo(String dogName, String dogBreed, String dogSize, int dogAge, String dogColor){
        name = dogName;
        breed = dogBreed;
        size = dogSize;
        age = dogAge;
        color = dogColor;
    }
 */

    public void getDogInfo(){
        System.out.println("Name: " + name + ", Breed: " + breed +", Size: " + size +", Color: " + color + ", Age: "+age+" years old");
    }
    // prints the Dog info

    public void eat(String food){
        System.out.println(name+ " is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void play(){
        System.out.println(name + " is playing");
    }
}
