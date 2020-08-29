package day47_Encapsulation;

public class CapitalOneObjects {

    public static void main(String[] args) {

        CapitalOneEmployees employee1 = new CapitalOneEmployees("Sandra", 28, "SDET");

        employee1.setID(1234);
        employee1.setSalary(115000);
        employee1.setAddress("156 Main Ave. Austin TX 78905");

        System.out.println( employee1.employeeName);
        System.out.println( employee1.employeeAge);
        System.out.println( employee1.jobTitle);
        System.out.println( employee1.companyName);

        System.out.println( employee1.getID() );
        System.out.println( employee1.getSalary() );
        System.out.println( employee1.getAddress() );

        System.out.println(employee1);
    }
}
