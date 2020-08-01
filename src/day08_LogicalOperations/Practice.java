package day08_LogicalOperations;

public class Practice {

    public static void main(String[] args) {
        String firstName = "Rumeysa";
        String lastName = "Dogan";
        String citizenShip = "Turkey";
        int age = 33;
        String fullName = firstName + " " + lastName;

        boolean eligibleToVote = (citizenShip == "USA" ) && ( age >= 18);
                            //      19 >= 18   &&   "China" == "USA"
                            //      true    &&   false
                            //          false

        System.out.println("Is "+ fullName+ " eligible to vote?: "+eligibleToVote);
    }
}
