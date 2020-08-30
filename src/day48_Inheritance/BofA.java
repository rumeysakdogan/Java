package day48_Inheritance;

public class BofA {

    public static void main(String[] args) {


        BankAccount obj = new BankAccount("Samuel", "Jackson");

        obj.setAccountHolder(obj.firstName + " " + obj.lastName);
        obj.setAccountNumber(123456789);
        obj.setBalance(50);
        obj.availableBalance();

        obj.deposit(100);
        obj.availableBalance();

        obj.withdraw(200);

        obj.withdraw(-200);

        obj.withdraw(0);

        obj.withdraw(150);
        obj.availableBalance();

        System.out.println( obj );

    }
}
