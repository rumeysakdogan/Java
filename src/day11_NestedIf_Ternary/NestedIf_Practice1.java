package day11_NestedIf_Ternary;
/* task:
    1 monday
    2 tuesday
     .
     .
     .
    7 sunday
    invalid ==> there is no such day
 */
public class NestedIf_Practice1 {
    public static void main(String[] args) {

        int day= 1;
        String result = "";

        if (day > 0 && day < 8) {
                if(day ==1){
                    result ="Monday";
                }else if(day ==2){
                result ="Tuesday";
                }else if(day ==3) {
                    result = "Wednesday";
                }else if(day ==4){
                    result ="Thursday";
                }else if(day ==5){
                result ="Friday";
                }else if(day ==6){
                result ="Saturday";
                }else{
                result ="Sunday";
                }
        }else{
            result = "There is no such day!";
        }

        System.out.println(result);

    }
}
