import java.util.Scanner;

/**
 * This class represents a tool for converting between common number systems
 * @author Chris Silva
 * @version 1.0
 */

public class NumSysCon
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        String input = "";
        // To validate the input before calculation, we check whether it's equal to 0, greater than 16 or null
        // the program continues taking input as long as these conditions are not met
        while (input.length() == 0 || input.length() > 16 || input.equals("0"))
        {
            System.out.println("\nPlease enter a binary value of up to 16 digits\n");
            input = userInput.nextLine();
        }
        // Converts binary string input (base-2) received to its decimal base (base-10)
        // parseInt() takes the input string and radix 2 (base of 2 for binary)
        // This integer value is passed to conversion methods below
        int decimalValue = Integer.parseInt(input, 2);

        // Each method is passed the binary value in its decimal format
        // The methods then perform their corresponding calculations to output the binary value in their respective formats
        binaryToDecimal(decimalValue);
        binaryToOctal(decimalValue);
        binaryToHexadecimal(decimalValue);
        userInput.close();
    }
    /**
     * Displays the decimal representation with positional breakdown
     * Calculates and extracts each digit with the value in its respective place
     * @param decimalValue the decimal integer to be displayed
     */
    public static void binaryToDecimal(int decimalValue)
    {
        // Extract each digit using (value / position) % 10
        int digit100000 = (decimalValue / 100000) ;
        int digit10000 = (decimalValue / 10000) % 10;
        int digit1000 = (decimalValue / 1000) % 10;
        int digit100 = (decimalValue / 100) % 10;
        int digit10 = (decimalValue / 10) % 10;
        int digit1 = decimalValue % 10;

        System.out.println("\n1\t" + "\t" + digit1);
        System.out.println("10\t" + "\t" + digit10);
        System.out.println("100\t" + "\t" + digit100);
        System.out.println("1000\t" + digit1000);
        System.out.println("10000\t" + digit10000);
        System.out.println("100000\t" + digit100000);

        System.out.println("Decimal: " + decimalValue + "\n");
    }

    /**
     * Displays the octal representations with positional breakdown
     * Calculates and extracts each digit with the value in its respective place
     * @param decimalValue the decimal integer to be converted to octal
     */
    public static void binaryToOctal(int decimalValue)
{
        // Creates an octal-formatted string to display in the final print statement
        String octalRep = Integer.toOctalString(decimalValue);

        // Extract each octal digit using (value / position) % 8
        int digit262144 = (decimalValue / 262144) % 8;
        int digit32768 = (decimalValue / 32768) % 8;
        int digit4096 = (decimalValue / 4096) % 8;
        int digit512 = (decimalValue / 512) % 8;
        int digit64 = (decimalValue / 64) % 8;
        int digit8 = (decimalValue / 8) % 8;
        int digit1 = decimalValue % 8;

        System.out.println("1\t" + "\t" + digit1);
        System.out.println("8\t" + "\t" + digit8);
        System.out.println("64\t" + "\t" + digit64);
        System.out.println("512\t" + "\t" + digit512);
        System.out.println("4096\t" + digit4096);
        System.out.println("32768\t" + digit32768);
        System.out.println("262144\t" + digit262144);

        System.out.println("Octal: " + octalRep + "\n");
    }

    /**
     * Converts and displays the hexadecimal representation with positional breakdown
     * Calculates and extracts each hex digit and displays both hex and decimal values
     * @param decimalValue the decimal integer to be converted to hexadecimal
     */
    public static void binaryToHexadecimal(int decimalValue)
    {
        // Converts the decimal integer value to hexadecimal string format for display
        String hexRep = Integer.toHexString(decimalValue);

        // Extract each hexadecimal digit using (value / position) % 16
        int digit65536 = (decimalValue / 65536) % 16;
        int digit4096 = (decimalValue / 4096) % 16;
        int digit256 = (decimalValue / 256) % 16;
        int digit16 = (decimalValue / 16) % 16;
        int digit1 = decimalValue % 16;

        System.out.println("1\t\t" + Integer.toHexString(digit1) + "\t" + digit1);
        System.out.println("16\t\t" + Integer.toHexString(digit16) + "\t" + digit16);
        System.out.println("256\t\t" + Integer.toHexString(digit256) + "\t" + digit256);
        System.out.println("4096\t" + Integer.toHexString(digit4096) + "\t" + digit4096);
        System.out.println("65536\t" + Integer.toHexString(digit65536) + "\t" + digit65536);

        System.out.println("Hexadecimal: " + hexRep);
    }
}