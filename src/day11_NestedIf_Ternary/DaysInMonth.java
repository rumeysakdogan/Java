package day11_NestedIf_Ternary;
/*
task: write a program that can find the number of days in a month
        (Assume that Feb has 28 days)

	     HINT:
	            28 days: 2
	            30 days: 4,6,9,11
	            31 days: 1,3,5,7,8,10,12
	            Invalid : month < 1 || month > 12
 */
public class DaysInMonth {

    public static void main(String[] args) {

        int month = 4;
        boolean days28 = month ==2;  //for the months that has 28 days

        boolean days30 = (month ==4) || (month == 6) || (month ==9) || (month ==11);
        // for the months that has 30 days

        boolean invalid = month < 1 || month > 12;

        // my condition:
        // boolean days31 = !days28 && !days30 && !invalid;

        String result ="";

        if(days28){
            result = "28 days";
        }else if(days30){
            result = "30 days";
        }else if(invalid){
            result = "Invalid month";
        }else{
            result = "31 days";
        }

        System.out.println(result);
    }
}
