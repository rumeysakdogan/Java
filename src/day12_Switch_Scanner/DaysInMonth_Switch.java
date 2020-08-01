package day12_Switch_Scanner;
/*
task: write a program that can find the number of days in a month
        (Assume that Feb has 28 days)

	     HINT:
	            28 days: 2
	            30 days: 4,6,9,11
	            31 days: 1,3,5,7,8,10,12
	            Invalid : month < 1 || month > 12
 */
public class DaysInMonth_Switch {
    public static void main(String[] args) {

        int monthNum = 3;
        String result = "";

        switch (monthNum) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31 days";
                break;

            case 2:
                result = "28 days";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                result = "30 days";
                break;

            default:
                result = "Invalid number!";
        }
        System.out.println(result);
    }
}