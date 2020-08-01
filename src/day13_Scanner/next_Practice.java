package day13_Scanner;

import java.util.Scanner;

public class next_Practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // if you write two words  like 'Cybertek School'
        System.out.println("Enter your first name: ");
        String firstName = scan.next(); // 'Cybertek' will be stored here
        scan.next(); // if you write this line, 'School' will be assigned here you will be able to enter your input

        System.out.println("Enter your last name: ");
        String lastName = scan.next(); // 'School' automatically will be assigned to second word

        String fullName = firstName+" "+lastName; // when you execute the code,
                                                // it will print line13 but skip entering value

        System.out.println("Your fullname is: "+fullName); // prints Cybertek School as your fullname
    }
}
