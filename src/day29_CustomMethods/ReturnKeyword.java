package day29_CustomMethods;
// calculate the grade of the student based on the score
public class ReturnKeyword {

    public static void grade(int score){

        if ( score < 0 || score > 100) {
            System.out.println("Invalid score!");
            return;     // exits the method
//          System.exit(0);  it exits whole program not just the method.
// if you use System.exit(0), it will not print task completed statement.
        }

        char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ?
                    'C' : (score >= 60) ? 'D' : 'F';

        System.out.println("Grade is: "+grade);
    }

    public static void main(String[] args) {

        grade(110);
        grade(83);
        grade(-10);

        System.out.println("Task completed!");
    }
}
