package day44_Constructor;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Mike", 18, 'M');
        //student1.setInfo("Mike", 18, 'M');

        Student student2 = new Student("Rakhat", 28, 'F');
        //student2.setInfo("Rakhat", 28, 'F');

        Student student3 = new Student("Belek", 30, 'M');
        //student3.setInfo("Belek", 30, 'M');

        System.out.println(student1);
        System.out.println("===================");
        System.out.println(student2);
        System.out.println("===================");
        System.out.println(student3);



    }
}
