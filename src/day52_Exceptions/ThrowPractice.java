package day52_Exceptions;

import java.time.LocalTime;

public class ThrowPractice {

    public static void main(String[] args) {

        String driverName = "Chrome";

        if(driverName.equalsIgnoreCase("Chrome")){
            System.out.println("Setup chrome driver");
        }else if(driverName.equalsIgnoreCase("firefox")){
            System.out.println("setup firefox driver");
        }else if(driverName.equalsIgnoreCase("opera")){
            System.out.println("setup opera driver");
        }else{
            throw new RuntimeException("Invalid browser name"); // invalid browser name, unexpected event throw an exception manually stop execution of your test
        }

        System.out.println("=============================");

        if(LocalTime.now().getMinute() == 45){
            throw new RuntimeException("It is BREAK time exception!!!");
        }else{
            System.out.println("Continue");
        }
    }
}
