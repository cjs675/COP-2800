import java.util.Scanner;

/**
 * java doc comments - double asterisk 
 * Author: Chris Silva 
 * Project: Interest Calculator
 */
public class calculateInterest
{
    public static void main(String[] args)
    {
        /**
         * calculates interest based off two parameters
         * @param balance the starting balance
         * @param int the interest, expressed as a whole integer
         * @see #calculateInterest(balance, rate)
         */
        String stringBalance, stringInterest;
        double balance;
        int rate;

        Scanner input = new Scanner(System.in);

        welcome();
        System.out.println("\nStarting balance:  \n\t");

        stringBalance = input.nextLine();
        System.out.println("\nInterest Rate:  \n\t");
        stringInterest = input.nextLine();

        balance = Double.parseDouble(stringBalance);
        rate = Integer.parseInt(stringInterest);

        calculateInterest(balance, rate);
        goodbye();
    }

    public static void welcome()
    {
        System.out.println("*".repeat(80) +
                "\n" +
                "\t".repeat(5) +
                "Interest Calculator\n" +
                "*".repeat(80));
    }

    public static void calculateInterest(double bal, int rate)
    {
        double interest, rateAsPercent;
        rateAsPercent = rate / 100.0;
        interest = bal * rateAsPercent;
        System.out.println("\nSimple interest on $ " +
                bal + " at " + rate + "% rate is " +
                "$" +
                interest);
    }

    public static void goodbye()
    {
        System.out.println("*".repeat(80) +
                "\n" +
                "\t".repeat(5) +
                "\n" +
                "*".repeat(80));
    }
}
