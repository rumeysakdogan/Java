package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

/*
   create 5 objects of Cat and store them into an array variable
            print out the information of every single cat
                    (DO NOT use getInfo method)
            ArrayList:
                maleCats
                femaleCats
                first approach: apply loop ( both for each loop and for loop)
                second approach: do not use loop

 */
public class CatObjects {

    public static void main(String[] args) {

        Cat[] cats ={ new Cat(), new Cat(), new Cat(), new Cat(), new Cat() };

        cats[0].setInfo("Minnos",2,'M',"Black","Persian Cat");
        cats[1].setInfo("",3,'F',"Gray","British Shorthair");
        cats[2].setInfo("Oliver",1,'M',"White","British Shorthair");
        cats[3].setInfo("Lilly",4,'F',"Ligth Brown","Persian Cat");
        cats[4].setInfo("Oscar",2, 'M', "Dark Brown","Persian Cat");

        ArrayList<Cat> maleCats = new ArrayList<>();
        ArrayList<Cat> femaleCats = new ArrayList<>();

        // 1st approach: with loops:
/*
        for (int i = 0; i < cats.length; i++) {
            if( cats[i].gender == 'M'){
                maleCats.add( cats[i] );
            }else{
                femaleCats.add( cats[i] );
            }
        }

        for(Cat each : maleCats){
            System.out.println( each );
        }

        System.out.println("=========================================================");

        for(Cat each : femaleCats){
            System.out.println( each );
        }
*/
        // 2nd approach: without loops

        maleCats.addAll(Arrays.asList(cats));

        maleCats.removeIf( p -> p.gender == 'F');
        System.out.println( maleCats );

        System.out.println("=======================================");

        femaleCats.addAll( Arrays.asList(cats));
        femaleCats.removeAll( maleCats );

        System.out.println( femaleCats );


    }
}
