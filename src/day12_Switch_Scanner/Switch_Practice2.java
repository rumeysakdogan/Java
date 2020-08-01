package day12_Switch_Scanner;

public class Switch_Practice2 {

    public static void main(String[] args) {

        String productName = "iPod";

        switch (productName){
            case "Galaxy":
                System.out.println("Samsung");
                break;

            case "iPhone" :
            case "MacBook":
            case "iPad":
            case "iPod":
                System.out.println("Apple");
                break;
        }

    }
}
