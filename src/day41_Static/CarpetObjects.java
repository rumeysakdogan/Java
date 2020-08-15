package day41_Static;

import java.util.ArrayList;

/*
 create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects
            ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all
             regular carpets into the list of regularCarpets
                    use for each loop to print out all the persian carpets
 */
public class CarpetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = { new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet() };

        carpets[0].customOrder(15,28,25.50,false);
        carpets[1].customOrder(30,45,40,true);
        carpets[2].customOrder(28,50,37.75,false);
        carpets[3].customOrder(25,60,55,true);
        carpets[4].customOrder(20,50,42,false);

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Carpet> regularCarpets = new ArrayList<>();


        for (int i = 0; i < carpets.length ; i++) {
            if (carpets[i].isPersian){
                persianCarpets.add(  carpets[i]  );
            }else{
                regularCarpets.add(  carpets[i]  );
            }
        }
//        for (Carpet each : carpets){
//            if(each.isPersian){
//                persianCarpets.add(each);
//            }else{
//                regularCarpets.add(each);
//            }
//        }
//
//        for (Carpet each : persianCarpets){
//            each.getCarpetInfo();
//        }



    }
}
