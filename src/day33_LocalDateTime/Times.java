package day33_LocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Times {

    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(0,30,29);
        System.out.println(time1);

        LocalTime time2 = LocalTime.now();

        System.out.println( time2 );


        LocalDateTime time3 = LocalDateTime.of(2020,7,25,15,37);
        System.out.println(time3);      // 2020-07-25T15:37

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println( t4 );     // 2020-07-25T13:40:02.245


    }
}
