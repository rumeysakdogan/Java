package day09_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        int age = 56;
        boolean usCitizen = true;

        if (age >= 18 && usCitizen) {
            System.out.println("This person is eligible to vote");
        } else {
            System.out.println("This person is not eligible to vote");
        }
    }
}
