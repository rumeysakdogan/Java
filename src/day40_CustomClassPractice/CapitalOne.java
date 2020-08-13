package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount Beslan = new BankAccount();
        BankAccount Ahmet = new BankAccount();
        BankAccount Viorel = new BankAccount();
        BankAccount Nurmamet = new BankAccount();
        BankAccount Waqar = new BankAccount();

        Beslan.setAccountInfo("Checking", "Beslan", "364734892",100);
        Ahmet.setAccountInfo("Checking", "Ahmet", "939837843",400);
        Viorel.setAccountInfo("Checking", "Viorel", "3647378392",500);
        Nurmamet.setAccountInfo("Checking", "Nurmamet", "36434214892",300);
        Waqar.setAccountInfo("Checking", "Waqar", "364748953692",1020);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList( Beslan, Ahmet, Viorel, Nurmamet, Waqar));

        for (BankAccount each : accounts){
            each.deposit(500);
            each.getAccountInfo();
        }

        accounts.get(3).deposit(500);
        accounts.get(3).checkBalance();
        accounts.get(3).withdraw(1000);
        accounts.get(3).checkBalance();

        System.out.println("*****************************************************");

        accounts.removeIf(p -> p.balance < 1000);

        System.out.println(accounts.size());

    }
}
