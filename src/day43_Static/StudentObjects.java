package day43_Static;

public class StudentObjects {

    public static void main(String[] args) {

        CybertekStudent student1 = new CybertekStudent();
        student1.studentName = "Ivan";

        CybertekStudent student2 = new CybertekStudent();
        student2.studentName = "Christina";

        System.out.println( student1.studentName );
        System.out.println( student2.studentName );

        System.out.println( CybertekStudent.schoolName );

    }
}
