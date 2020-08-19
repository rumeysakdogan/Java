package day43_Static;

class A{
    static int a = 200;
}



public class CybertekStudent {

    String studentName;
    int age;
    char gender;

    static  String schoolName = "Cybertek School";


    public static void main(String[] args) {
        System.out.println(  A.a  );
    }

    public void getInfo(){
        System.out.println("Name: " + studentName);
    }

    public static void printSchoolName(){
        System.out.println("School name: " + schoolName);
    }
}
