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
public class DaysInMonthNestedIf {
    public static void main(String[] args) {

        int month = 7;
        boolean validMonth = month > 0 && month < 13;
        boolean days28 = month ==2;  //for the months that has 28 days

        boolean days30 = (month ==4) || (month == 6) || (month ==9) || (month ==11);
        // for the months that has 30 days

        String days = "";

        if(validMonth){
            if(days28){
                days = "28 days";
            }else if(days30){
                days = "30 days";
            }else{
                days = "31 days";
            }
        }else{
            days = "Invalid month";
        }

//        if (validMonth) {
//            if (month == 1) {
//                days = "31 days";
//            } else if (month == 2) {
//                days = "28 days";
//            } else if (month == 3) {
//                days = "31 days";
//            } else if (month == 4) {
//                days = "30 days";
//            } else if (month == 5) {
//                days = "31 days";
//            } else if (month == 6) {
//                days = "30 days";
//            } else if (month == 7) {
//                days = "31 days";
//            } else if (month == 8) {
//                days = "31 days";
//            } else if (month == 9) {
//                days = "30 days";
//            } else if (month == 10) {
//                days = "31 days";
//            } else if (month == 11) {
//                days = "30 days";
//            } else {
//                days = "31 days";
//            }
//        } else {
//            days = "Invalid month";
//        }

        System.out.println(days);
    }
}
