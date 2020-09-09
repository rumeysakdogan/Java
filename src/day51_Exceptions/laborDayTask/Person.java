package day51_Exceptions.laborDayTask;
/*
Task01:
	1. create a class called Person
			attributes:
				name, age, gender

			add a constructor that can initialize the attributes

			create a toString method that can print any Person object

 */
public class Person {

    public String name;
    public int age;
    public char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
