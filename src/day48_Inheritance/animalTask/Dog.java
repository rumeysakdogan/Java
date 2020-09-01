package day48_Inheritance.animalTask;

public class    Dog     extends     Animal      {
    //    sub(child/derived)   super(parent/base)

    /*
    variables: 6 -> name, size, age, gender, breed, lb
    methods: 5 -> setInfo, eat, sleep, bark, toString
     */

    public Dog(String name, String size, int age, char gender, String breed, double lb) {
        setInfo(name, size, age, gender, breed, lb);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }





}
