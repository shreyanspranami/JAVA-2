import java.util.*;
public class Practical_4 extends Account{
    private double overdrawmlimit = getBalance()/10;
    private double totalbalance = getBalance() + overdrawmlimit;

    Practical_4() {}

    Practical_4(int id, double balance, double annualInterestRate, Date dateCreated)
    {
        super(id, balance, annualInterestRate, dateCreated);
    }
    public String toString() {
        return "The Account number is " + getId() + "\nThe balance in the Account is " + getBalance() + "\nThe annual interest rate is " + getAnnualInterestRate() + "\nThe date of creation of the Account is " + getDateCreated() + "\nThe over drawn limit is " + overdrawmlimit;
    }
    public double withdraw(double a)
    {
        if(a<overdrawmlimit)
        {
            overdrawmlimit-=a;
            return overdrawmlimit;
        }
        else
        {
            a-=overdrawmlimit;
            System.out.println("Your over drawn limit is over.");
            super.withdraw(a);
        }
        return getBalance();
    }
}