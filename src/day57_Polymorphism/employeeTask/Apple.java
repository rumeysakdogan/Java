package day57_Polymorphism.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

/*
    4. create a class named Apple:
            create an arraylist(you decide the reference type),
            and store 4 testers and 3 developers objects

 */
public class Apple {
    public static void main(String[] args) {

      Employee tester1 = new Tester("Alex",2345, "QA", 120000,'M');
      Employee tester2 = new Tester("Melanie",1245, "SDET", 115000,'F');

      Employee developer1 = new Developer("Sam",9875, "Front-End", 145000,'M');
      Employee developer2 = new Developer("Jenn",7680, "Back-End", 150000,'F');

      Employee scrumMaster1 = new ScrumMaster("Kamil", 5647, "Scrum master",110000,'M');

      ArrayList<Employee> scrumTeam = new ArrayList<>();
            scrumTeam.addAll(Arrays.asList(tester1, tester2, developer1, developer2,scrumMaster1));

            for(Employee each : scrumTeam){
                System.out.println(each);
            }
    }
}
