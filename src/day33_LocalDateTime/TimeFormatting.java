package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
/*
    year : yy, yyyy
    Month: MM (number), MMM (three letters) , MMMM (fullname of month)
    day: dd
    weekdays name: E (three letters), EEEE (fullname of weekday)
 */
    public static void main(String[] args) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMM/dd/yyyy, EEEE");

        LocalDate ld = LocalDate.of(2020,7,25);

        System.out.println(ld);     // 2020-07-25 (default)

        System.out.println(     ld.format(dateFormat)   );    // 07/25/2020 (after formatting)
                                                              // Sat, Jul/25/2020 , Jul/25/2020, Saturday
        System.out.println("====================================");
/*
    hour: hh ( 0-11) , HH (military time  1-23)
    minutes: mm
    seconds: ss
    am/pm : a
 */
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now);    // 14:01:59.105 (default)
        System.out.println(     now.format(timeFormat)   ); // 02:01 PM or 02:02:31 PM ( after formatting)

        // May/20/19 Monday 04:30 PM

        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm a");

        LocalDateTime ldt = LocalDateTime.of(2019,5,20,16,30);

        System.out.println(     ldt.format(dateTimeFormat)      );

        // Saturday 02:35:26 PM

        LocalDateTime rNow = LocalDateTime.now();

        DateTimeFormatter dTFormat = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");

        System.out.println(  rNow.format(dTFormat)  );


    }

}
