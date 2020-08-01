package day08_LogicalOperations;

public class Practice2 {

    public static void main(String[] args) {
        int age = 45;
        String firstName = "Daisy";
        String lastName = "Edward";

        String citizenShip1 = "Canada";
        String citizenShip2 = "Australia";

        boolean eligibleAge = age >= 18;
                                // 12 >= 18  => false
        boolean usCitizen = citizenShip1 == "USA" || citizenShip2 == "USA";
                                //          true  ||    false
                                //              true
        boolean isEligibleToVote = eligibleAge && usCitizen;
                                    //  false  &&  true
                                    //      false

        String fullName = firstName + " " + lastName;

        System.out.println(fullName+" is eligible to vote for Trump?: "+isEligibleToVote);
    }
}
