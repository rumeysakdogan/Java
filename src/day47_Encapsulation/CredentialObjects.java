package day47_Encapsulation;

public class CredentialObjects {

    public static void main(String[] args) {

        Credentials user1 = new Credentials("Adam",25);

        user1.setUserName("adam456!");
        user1.setPassword("7james89&");

        System.out.println( user1.getUserName() );
        System.out.println( user1.getPassword() );

        System.out.println( user1.name );
        System.out.println( user1.age );
        System.out.println( user1.companyName);

    }
}
