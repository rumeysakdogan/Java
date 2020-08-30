package day47_Encapsulation;

import java.time.LocalDate;

public class personObject {

    public static void main(String[] args) {

        Person person1 = new Person("Jack",31,'M', LocalDate.of(1988,2,12));

        System.out.println(person1);

        person1.setSsn(145678987);
        person1.setId(345);
        person1.setAddress("Texas");

        Person person2 = new Person("Sandy",21,'F', LocalDate.of(1997,11,18));
        Person person3 = new Person("Rachel",42,'F',LocalDate.of(1976,4,26));

    }
}
