package day53_FinalKeyword;

public class InvalidBrowserNameException extends RuntimeException {
    public InvalidBrowserNameException() {
        super("Invalid Browser Name");
    }

    public InvalidBrowserNameException(String str){
        super(str);
        System.err.println("Are you kidding?");
    }
}


class Test2{
    public static void main(String[] args) {

        String name = "Cybertek";

        switch (name.toLowerCase()){
            case "chrome":
                System.out.println("chrome is selected");
                break;
            case "firefox":
                System.out.println("Firefox is selected");
                break;
            case "safari":
                System.out.println("safari is selected");
                break;
            default:
                throw new InvalidBrowserNameException("Please enter a valid browser name");
        }

    }
}