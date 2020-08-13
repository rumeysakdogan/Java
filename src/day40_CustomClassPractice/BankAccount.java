package day40_CustomClassPractice;
/*
 create a custom class for BankAccount
        attributes/data that can have are:
                1. AccountHolder, 2. AccountNumber, 3. Balance, 4. AccountType
          Actions: showBalance, deposit, withdraw
          requirements:
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
            3. user should be able to see their balance
 */
public class BankAccount {
    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String userAccountType, String name, String userAccountNumber, double userBalance ){
        accountType = userAccountType;
        accountHolder = name;
        accountNumber = userAccountNumber;
        balance = userBalance;
    }

    public void getAccountInfo(){
        System.out.println("===============================================");
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Available Balance: $" + balance);
        System.out.println("===============================================");
    }

    public void checkBalance(){
        System.out.println("Available Balance: $" + balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+ amount + " to account number " + accountNumber);
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount > balance ){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing $"+ amount + " from account number " + accountNumber);
        balance -= amount;

    }

}
