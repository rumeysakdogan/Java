package day11_NestedIf_Ternary;
/*
grade: int score = 95
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
     0 ~ 59 ==> F
    Invalid ==> score<0 || score > 100

 */

public class NestedIf {

    public static void main(String[] args) {

        int score = 74;
        String grade = "";

        if(score >= 0 && score <= 100){  // valid score
            if(score>=90){
                grade = "A";
            }else if(score>=80){
                grade = "B";
            }else if(score>=70){
                grade = "C";
            }else if(score>=60){
                grade = "D";
            }else{
                grade = "F";
            }
        }else{
            grade = "Invalid score";
        }
        System.out.println(grade);

        System.out.println("============================");
        /*
                precondition: minimum salary of 30K
                    sub condition: minimum 2 years of job history
         */
        double salary = 37000.5;
        double jobHistory = 3.5;

        if(salary>=30000){
            if(jobHistory>=2){
                System.out.println("You are eligible for loan.");
            }else{
                System.out.println("To be eligible, your job history should be at least 2 years.");
            }
        }else{
            System.out.println("You must earn at least 30K!");
        }

    }
}
