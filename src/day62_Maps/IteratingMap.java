package day62_Maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();

        map.put("John", LocalDate.of(1999, 8,9));
        map.put("Aaron", LocalDate.of(1999, 4,11));
        map.put("Daniel", LocalDate.of(1979, 5,23));
        map.put("James", LocalDate.of(1998, 7,9));
        map.put("Caleb", LocalDate.of(1972, 1,5));
        map.put("Erik", LocalDate.of(1988, 3,18));

        for(String eachName : map.keySet()){
            System.out.println( eachName );
        }

        List<String> names = new ArrayList<>( map.keySet()); // keySet method will return a collection you can put it any collection type
        System.out.println(names);
        System.out.println( names.get(1) );

        System.out.println("=====================================");

        for (LocalDate each : map.values()){
            System.out.println( each );
        }

        List<LocalDate> DOB = new ArrayList<>( map.values() );
        System.out.println( DOB.get(1) );

        System.out.println("=====================================");

        for (Map.Entry<String,LocalDate> each : map.entrySet()){
            System.out.println( each );
        }
    }
}
