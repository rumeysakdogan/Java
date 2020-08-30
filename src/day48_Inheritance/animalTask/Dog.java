package day48_Inheritance.animalTask;

public class    Dog     extends     Animal      {
    //    sub(child/derived)   super(parent/base)

    /*
    variables: 4 -> name, size, age, gender
    methods: 5 -> setInfo, eat, sleep, bark, toString
     */

    public Dog(String name, String size, int age, char gender) {
        setInfo(name, size, age, gender);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }





}
