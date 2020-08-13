package day40_CustomClassPractice;

public class BofA {


    public static void main(String[] args) {

      BankAccount Dawud = new BankAccount();
      Dawud.setAccountInfo("Saving", "Dawud Abduweli", "123467867", 25 );

      Dawud.getAccountInfo();

      Dawud.deposit(1000);
      Dawud.checkBalance();

      Dawud.withdraw(500);
      Dawud.checkBalance();

        Dawud.withdraw(1000);
        Dawud.checkBalance();

    }
}
