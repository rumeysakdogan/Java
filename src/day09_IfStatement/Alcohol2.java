package day09_IfStatement;

public class Alcohol2 {

    public static void main(String[] args) {
        int age = 43;
        boolean hasID = false;

        boolean eligible = hasID && age >=21;

        if(eligible){
            System.out.println("You can buy alcohol");
        }else{
            System.out.println("Go buy some other drinks");
        }

    }
}
