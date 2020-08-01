package day04_Variables;

import javax.xml.bind.SchemaOutputResolver;

/*
Task: declare those variables and print them to the console:

    firstName
    lastName
    age
    country
    SSN
    Gender
    isEmployed

 */
public class PersonalInfo {
    public static void main(String[] args) {

      String firstName = "Rumeysa";
      String lastName = "Dogan";
      int age = 33;
      String country = "Turkey";
      String SSN = "123-78-9876";
      String gender = "Female";
      boolean isEmployed = false;

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name:  " + lastName);
        System.out.println("Age:        " + age);
        System.out.println("Country:    " + country);
        System.out.println("SSN:        " + SSN);
        System.out.println("Gender:     " + gender);
        System.out.println("Employed:   " + isEmployed);



    }
}
