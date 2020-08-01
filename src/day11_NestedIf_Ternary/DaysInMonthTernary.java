package day11_NestedIf_Ternary;

public class DaysInMonthTernary {
    public static void main(String[] args) {

        int month = -1;
        boolean days28 = month == 2;  //for the months that has 28 days

        boolean days30 = (month == 4) || (month == 6) || (month == 9) || (month == 11);
        // for the months that has 30 days

        boolean invalid = month < 1 || month > 12;

        String days = (days28) ? "28 days" : (days30) ? "30 days" : (invalid) ? "Invalid month" : "31 days";

        System.out.println(days);
    }
}
