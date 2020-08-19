package day44_Constructor;
/*
2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees
 */
public class HumanResources {

    static Employee employee1; // declare 5 variables of Employee as static
    static Employee employee2;
    static Employee employee3;
    static Employee employee4;
    static Employee employee5;

    static {
        employee1= new Employee(); // initialize those static variables
        employee2= new Employee();
        employee3= new Employee();
        employee4= new Employee();
        employee5= new Employee();

        // set all the info of the Employees
        employee1.setInfo("Muhammed",12312,456432,"SDET",120000,'M');
        employee2.setInfo("Erkan",45678,123987,"QA",115000,'M');
        employee3.setInfo("Asiya",56431,657098,"Instructor",99000,'F');
        employee4.setInfo("Ayse",17876,342567,"SDET",125000,'F');
        employee5.setInfo("Ahmet",67543,987654,"Developer",140000,'M');
    }
}
