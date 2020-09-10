package day53_FinalKeyword;

import day33_LocalDateTime.Birthday;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyeColor = "Brown";
    final String bloodType = "A";

    final int x;    //  final instance variables need to be initialized right away
    final static int y; // final static variables need to be initialized right away

    public FinalVariable() {
        x = 700;
    }

    static{
        y = 300;
    }
    public static void main(String[] args) {

        final LocalDate dateOfBirth = LocalDate.of(2000,5,7);

     //   dateOfBirth  = LocalDate.of(1990,6,5); cannot be reassigned

        System.out.println(dateOfBirth);

        final long ssn = 1234567;

        System.out.println(ssn);

        final double PI = 3.14;

        System.out.println(PI);

        final String birthPlace = "USA";
        // birthPlace = "England";
    }
}
