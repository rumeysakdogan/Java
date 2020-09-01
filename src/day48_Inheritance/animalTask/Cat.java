package day48_Inheritance.animalTask;

public class Cat extends  Animal {

    /*
    variables: 6 -> name, size, age, gender, breed, lb
    methods: 6 -> setInfo, eat, sleep, bark, toString, meow
     */

    public Cat(String name, String size, int age, char gender, String breed, double lb) {
        setInfo(name, size, age, gender, breed, lb);
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }

}
