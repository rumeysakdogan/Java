package day54_Abstraction.employeeTask;

import java.time.LocalDate;

/*
4. create a class called PenFed
            create 3 objects of Tester and Developers
            try to make change to the gender & DOfB of the employees

 */
public class PenFed {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Alia", 'F', LocalDate.of(1987,3,11) , "SDET", 100000);
      //  tester1.gender = 'M'; // CAN only read it, cannot modify it
      //  tester1.DOfB = LocalDate.of(2000,11,20); // CAN only read it, cannot modify it
        System.out.println( tester1.gender );
        System.out.println( tester1.DOfB );

        Developer developer1 = new Developer("Sam",'M',LocalDate.of(1990,03,10),"fRONT-END",150000);
        System.out.println( developer1 );
    }
}
