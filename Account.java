import java.util.*;

public class Account {
    private int id=0;
    private double balance=500;
    private double annualInterestRate=7;
    private Date dateCreated= new Date();


    Account() {}

    Account(int id)
    {
        this.id = id;
    }

    Account(int id, double balance)
    {
        this(id);
        this.balance= balance;
    }

    Account(int id, double balance, double annualInterestRate, Date dateCreated)
    {
        this(id, balance);
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest()
    {
        return balance*(annualInterestRate/1200);
    }

    public double withdraw(double a)
    {
        balance-=a;
        return balance;
    }

    public double deposit(double a)
    {
        balance+=a;
        return balance;
    }

    public void moneytransfer(Account Ac,double a)
    {
        withdraw(a);
        Ac.deposit(a);
    }
    public String toString() {
        return "The Account number is " + getId() + "\nThe balance in the Account is " + getBalance() + "\nThe anuuual intersect rate is " + getAnnualInterestRate() + "\nThe data of creation of the account is " + getDateCreated();
    }
}