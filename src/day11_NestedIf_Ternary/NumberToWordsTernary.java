package day11_NestedIf_Ternary;
/*
	1. write a java program that can convert numbers between 0 ~ 9 to words,
	if the number is greater than 9 or less than zero, out put should be "Invalid".
 */
public class NumberToWordsTernary {

    public static void main(String[] args) {

        int n = 9;

        String word = (n==1) ? "one" : (n==2) ? "two" : (n==3) ? "three" :
                (n==4) ? "four" : (n==5) ? "five" : (n==6) ? "six" :
                        (n==7) ? "seven" : (n==8) ? "eight" : (n==9) ? "nine" : "Invalid";

        System.out.println(word);
    }
}
