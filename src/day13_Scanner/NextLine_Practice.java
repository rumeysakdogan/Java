package day13_Scanner;

import java.util.Scanner;

public class NextLine_Practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   //1235Enter

        System.out.println("Enter your building number: ");
        int buildingNumber = scan.nextInt();     //1235

        scan.nextLine();    //Enter

        System.out.println("Enter your full street name: ");
        String streetName = scan.nextLine();    // Moon Ave

        System.out.println("Your address is: "+buildingNumber+" "+streetName);

        scan.close();
    }
}
