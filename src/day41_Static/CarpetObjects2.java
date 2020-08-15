package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {


        Carpet[] carpets = { new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet() };

        carpets[0].customOrder(15,28,25.50,false);
        carpets[1].customOrder(30,45,40,true);
        carpets[2].customOrder(28,50,37.75,false);
        carpets[3].customOrder(25,60,55,true);
        carpets[4].customOrder(20,50,42,false);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
             persianCarpets.addAll(Arrays.asList( carpets));
        ArrayList<Carpet> regularCarpets = new ArrayList<>();
            regularCarpets.addAll(Arrays.asList( carpets));

        persianCarpets.removeIf(p -> !p.isPersian);

        System.out.println("Total # of Persian Carpets: " + persianCarpets.size());

        regularCarpets.removeAll(persianCarpets);

        System.out.println("Total # of Regular Carpets: " + regularCarpets.size());

    }
}
