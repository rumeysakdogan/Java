package day51_Exceptions.petsTask;
/*
  Animal Task:
            1. create a class called Pet
                    attributes:
                            name, age, gender, breed, color
                    create a constructor that can initialize the instances
                   instance methods (with protected access modifiers):
                            eat(): by default assume all Pets eat  chocolate
                            drink(): by default assume all Pets drink milk
                            sleep(): by default assume all Pet sleep on the floor
                            toString():
            2. create a sub class of Pet called Dog
                    override the instance methods:
                        eat(): Dog eats Chicken
                        drink(): Dog drinks water
                        sleep(): Dog sleeps on the bed
            3. create a sub class of Pet called Cat and override the instance methods

 */
public class Pet {

    public String name;
    public String breed;
    public char gender;
    public int age;
    public String color;

    public Pet(String name, String breed, char gender, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    protected void eat(){
        System.out.println(name + " is eating chocolate");
    }

    protected void drink(){
        System.out.println(name + " is drinking milk");
    }

    protected void sleep(){
        System.out.println(name + " is sleeping on the floor");
    }

    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
