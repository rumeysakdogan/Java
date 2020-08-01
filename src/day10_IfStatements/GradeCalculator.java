package day10_IfStatements;
/*
grade: int score = 95
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    otherwise ==> F
    Invalid ==> score<0 || score > 100

 */
public class GradeCalculator {

    public static void main(String[] args) {

        int score = 95;
        char grade ='F'; //String grade = "";

        if(score >=90 && score <=100) {
            grade = 'A';    // grade = "A";
        }else if(score >=80 && score <=89){
            grade = 'B';    // grade = "B";
        }else if(score >=70 && score <=79){
            grade = 'C';    // grade = "C";
        }else if(score >=60 && score <=69){
            grade = 'D';    // grade = "D";
        }else{              // grade = "F";
            grade = 'F';
        }

        System.out.println(grade);
    }
}
