import java.util.Scanner;

/**
 * This class represents a tool for converting between common number systems
 * @author Chris Silva
 * @version 1.0
 */

public class NumSysCon
{
    private static String input;
    private static int parsedInput;

    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEnter a binary value between 1 - 16 digits: \t\n");

        input = userInput.nextLine();

        binaryToDecimal();
        binaryToOctal();
        binaryToHexadecimal();

        userInput.close();
    }

    public static void binaryToDecimal()
    {
        parsedInput = Integer.parseInt(input, 2);
        System.out.println("Decimal: " + parsedInput);

    }
    public static void binaryToOctal()
    {
        // input parsed as binary (base 2) then converted to string equivalent in octal (base 8)

        parsedInput = Integer.parseInt(input, 2);
        String octalRep = Integer.toOctalString(parsedInput);
        System.out.println("Octal: " + octalRep);

    }
    public static void binaryToHexadecimal()
    {
        // input parsed as binary (base 2) then converted to string equivalent in hexadecimal (base 16)

        parsedInput = Integer.parseInt(input, 2);
        String hexRep = Integer.toHexString(parsedInput);
        System.out.println("Hexadecimal: " + hexRep);

    }
}
