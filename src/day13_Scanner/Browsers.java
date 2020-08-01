package day13_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName = "chrome";
        String result = "";

        switch(browserName){
            case "chrome":
                result = "Your browser is chrome";
                break;
            case "firefox":
                result = "Your browser is firefox";
                break;
            case "safari":
                result = "Your browser is safari";
                break;
            case "opera":
                result = "Your browser is opera";
                break;
            case "edge":
                result = "Your browser is edge";
                break;
            default:
                result = "Invalid Browser Name";
        }
        System.out.println(result);
    }
}
