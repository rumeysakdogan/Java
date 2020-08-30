package day48_Inheritance.animalTask;

public class Cat extends  Animal {

    /*
    variables: 4 -> name, size, age, gender
    methods: 6 -> setInfo, eat, sleep, bark, toString, meow
     */

    public Cat(String name, String size, int age, char gender) {
        setInfo(name, size, age, gender);
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }

}
