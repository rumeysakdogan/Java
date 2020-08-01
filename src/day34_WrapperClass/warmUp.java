package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class warmUp {
    public static void main(String[] args) {
//      Sunday, 08:00 AM, Jul/26/2020

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        LocalDateTime rNow = LocalDateTime.now();
        System.out.println( rNow.format( dateFormat) );
    }
}
