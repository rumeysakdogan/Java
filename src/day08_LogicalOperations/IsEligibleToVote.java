package day08_LogicalOperations;

public class IsEligibleToVote {

    public static void main(String[] args) {

        int age = 18;
        String citizenShip = "USA";

        if ( (age >= 18) && (citizenShip == "USA")){
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }
    }
}
