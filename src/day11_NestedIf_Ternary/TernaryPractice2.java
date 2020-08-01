package day11_NestedIf_Ternary;

public class TernaryPractice2 {
// ? means if,  : means else
    public static void main(String[] args) {

        int num = 12;

        String result = "";

        if(num>0){
            result = "Positive";
        }else if(num<0) {
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("=====================");

        String result2 = (num>0) ? "Positive" : (num<0) ? "Negative" : "Zero";
        System.out.println(result2);

        System.out.println("=====================");

        int a = 46;
        int b = 26;

        String compare = (a>b) ? a+" is greater" : (b>a) ? b+" is greater" : a+" is equal to "+b;

        System.out.println(compare);

    }
}
