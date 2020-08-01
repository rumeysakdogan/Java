package day09_IfStatement;
// write a java program that can identify if a person is eligible to buy alcohol
public class Alcohol {

    public static void main(String[] args) {

        boolean hasId = true;
        int age = 29;

        boolean eligible = hasId && age >=21;

        String result = "";

        if(eligible == true){
           // System.out.println("The person is eligible to buy alcohol");
            result = "The person is eligible to buy alcohol";
        }
        if(!eligible){
           // System.out.println("You are not old enough to buy alcohol");
            result = "You are not old enough to buy alcohol";
        }

        System.out.println(result);

        // my code:
//        if(hasId ==true && age >= 21){
//            System.out.println("The person is eligible to buy alcohol");
//        }if ((hasId == false && age >= 21) || (hasId == true && age < 21) ){
//            System.out.println("The person is not eligible to buy alcohol");
//        }


    }
}
