package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(1987, 2,11);
//      dataType  varName = class.method(args)
//      year-month-days

        System.out.println(DOB);

        LocalDate today = LocalDate.now();

        System.out.println( today );

        LocalDate y = LocalDate.of(2020,1,1);
        Boolean isLeap = y.isLeapYear();   // returns a boolean to check leap year
        System.out.println( isLeap );


        System.out.println("======================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year  = scan.nextInt();

        Boolean result2 = LocalDate.of(year,1,1).isLeapYear();

        System.out.println(result2);

        System.out.println("======================================");

        System.out.println("Enter birth year, birth month, birthday:");

        LocalDate d = LocalDate.of( scan.nextInt(), scan.nextInt(), scan.nextInt() );
//                                      1987            2               11
        System.out.println(d);   //  1987-02-11
        System.out.println( d.isLeapYear()  );



    }
}
