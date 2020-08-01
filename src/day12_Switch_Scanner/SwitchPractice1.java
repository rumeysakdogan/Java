package day12_Switch_Scanner;

public class SwitchPractice1 {

    public static void main(String[] args) {

        int day = 0;
        String result = "";

        switch(day){
            case 1 :
            result = "Monday";
                break;      // to exit the switch
            case 2 :
                result = "Tuesday";
                break;
            case 3 :
                result = "Wednesday";
                break;
            case 4 :
                result = "Thursday";
                break;
            case 5 :
                result = "Friday";
                break;
            case 6 :
                result = "Saturday";
                break;
            case 7 :
                result = "Sunday";
                break;
            default:    // optional, it can placed anywhere, but preferred way is the bottom.
                result = "Invalid day";
        }
        System.out.println(result);

        System.out.println("===================");

        char ch = 'Z';
        String result2 = "";

        switch (ch){
            case 'A':
                result2 = " A found";
                break;
            case 'B':
                result2= "B found";
                break;
            case 'C':
                result2 = "C found";
                break;
            case 'D':
                result2 = "D found";
                break;
            case 'E':
                result2 = "E found";
                break;
            default:
                result2 = "Letter could not find";
        }
        System.out.println(result2);
    }
}
