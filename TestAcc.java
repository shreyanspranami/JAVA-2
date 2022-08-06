/* Shreyans j. pranami 21CE1110 */
import java.util.*;
public class TestAcc {
        public static void main(String[] args) {
            Date dateCreated = new Date("12/12/2012 12:12:12");
            Account AC = new Account(10, 30000, 7, dateCreated);
            Practical_4 CAC = new Practical_4(10, 30000, 7, dateCreated);
            Savings SAC = new Savings(10, 30000, 7, dateCreated);
            System.out.println("Account class toString method\n" + AC);
            System.out.println("\nChecking class toString method\n" + CAC);
            System.out.println("\nSavings class toString method\n" + SAC);
            System.out.println("Shreyans 21CE110");
        }
    }

