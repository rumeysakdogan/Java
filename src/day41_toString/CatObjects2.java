package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {
    public static void main(String[] args) {

        Cat[] cats ={ new Cat(), new Cat(), new Cat(), new Cat(), new Cat() };

        cats[0].setInfo("Minnos",2,'M',"Black","Persian Cat");
        cats[1].setInfo("",3,'F',"Gray","British Shorthair");
        cats[2].setInfo("Oliver",1,'M',"White","British Shorthair");
        cats[3].setInfo("Lilly",4,'F',"Ligth Brown","Persian Cat");
        cats[4].setInfo("Oscar",2, 'M',"Dark Brown","Persian Cat");

        ArrayList<Cat> maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(cats));

        maleCats.removeIf( p -> p.gender == 'F');
        System.out.println( maleCats );

        System.out.println("=======================================");


        ArrayList<Cat> femaleCats = new ArrayList<>();
        femaleCats.addAll( Arrays.asList(cats));
        femaleCats.removeAll( maleCats );

        System.out.println( femaleCats );




    }
}
