import java.util.*;

interface Transaction{
  public void showTransactionType();
}

abstract class Account implements Transaction{
  public String accountNumber;
  public String accountHolder;
  public double balance;
  static int numOfAccountHolder= 0;
  final String bankName = "SBI";

  Account(String accountNumber, String accountHolder, double balance){
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
    numOfAccountHolder++;
  }
  
  abstract public void calculateIntrest();

  public void showBalance(){
    System.out.println("Total Balance: " + this.balance);
  }

  void deposit(double amount){
    this.balance += amount;
  }
  void deposit(double amount, String remarks){
    this.balance += amount;
    System.out.println("Remarks: " + remarks);
  }
}

class savingAccount extends Account{
  savingAccount(String accountNumber, String accountHolder, double balance){
    super(accountNumber, accountHolder, balance);
  }
  public void calculateIntrest(){
    double totalIntrest = 0.4*this.balance;
    System.out.println("ToatalIntrest: " + totalIntrest);
   }

   public void showTransactionType(){
    System.out.println("Saving account transaction typpe");
   }
}

class currentAccount extends Account{
  currentAccount(String accountNumber, String accountHolder, double balance){
    super(accountNumber, accountHolder, balance);
  }
  public void calculateIntrest(){
    System.out.println("No Intrest on current account");
  }

  public void showTransactionType(){
    System.out.println("Current account transaction type");
   }
}

public class Main{
  public static void main(String[] args){
    Account CA = new currentAccount("ac12345", "Mohan", 5000);
    CA.deposit(8000);
    CA.deposit(5000, "money added");
    Account SA = new savingAccount("ac12345678", "Mohit", 8000);
    SA.deposit(700);
    SA.deposit(700, "money added");

    CA.calculateIntrest();
    CA.showTransactionType();

    SA.calculateIntrest();
    SA.showTransactionType();

    System.out.println("Total nuber of account holder: " + Account.numOfAccountHolder);
  }
}