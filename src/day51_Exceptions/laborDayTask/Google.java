package day51_Exceptions.laborDayTask;

import day50_Inheritance_Overriding.Test;

import java.util.ArrayList;
import java.util.Arrays;

/*
4. create a class called Google
			create 5 objects of the Tester and 5 objects of Developer
			create an arrayList of Tester and an ArrayList of Developer, store those 5 objects of the Tester & Developers
			use for each loop to iterate Tester & Developer objects from in those arrayLists
				print out the tester & developer who has the highest salary
 */
public class Google {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Alia",32,'F',123,"SDET",100000);
        Tester tester2 = new Tester("John",29,'M',124,"QA",120000);
        Tester tester3 = new Tester("Alex",38,'M',125,"SDET",110000);
        Tester tester4 = new Tester("Kathy",36,'F',126,"QA",115000);
        Tester tester5 = new Tester("George",27,'M',127,"SDET",100000);

        Developer developer1 = new Developer("Sam", 28, 'M', 987,"front-end",150000);
        Developer developer2 = new Developer("Rama", 34, 'F', 765,"front-end",130000);
        Developer developer3 = new Developer("Yolan", 46, 'M', 543,"back-end",140000);
        Developer developer4 = new Developer("Tania", 29, 'F', 245,"fullstack",180000);
        Developer developer5 = new Developer("Mustafa", 35, 'M', 267,"back-end",145000);

        ArrayList<Tester> testers = new ArrayList<>();
            testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));
        ArrayList<Developer> developers = new ArrayList<>();
            developers.addAll(Arrays.asList(developer1,developer2,developer3,developer4,developer5));

        double maxTesterSalary = tester1.salary;
        double maxDeveloperSalary = developer1.salary;

        for (Tester each : testers){
            if(maxTesterSalary < each.salary){
                maxTesterSalary = each.salary;
            }
        }
        for (Tester each : testers){
            if (each.salary == maxTesterSalary){
                System.out.println( each.name + " : " + each.salary);
            }
        }

        for (Developer each : developers){
            if (maxDeveloperSalary < each.salary){
                maxDeveloperSalary = each.salary;
            }
        }

        for (Developer each : developers){
            if (each.salary == maxDeveloperSalary){
                System.out.println( each.name + " : " + each.salary);
            }
        }
    }
}
