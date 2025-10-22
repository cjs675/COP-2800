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
        String input;
        int parsedInput;
        Scanner userInput = new Scanner(System.in);
        System.out.println("\n Enter a string of 1 to 16 0's and 1's");

        input = userInput.nextLine();
        parsedInput = Integer.parseInt(input, 2);

        System.out.println(" decimal value = " + parsedInput);
        binaryToOctal();
    }

    public static void binaryToDecimal()
    {

    }
    public static void binaryToOctal()
    {
        String input;
        int parsedInput;

        Scanner userInput = new Scanner(System.in);
        System.out.println("\n enter a string of 1's and 0's");
        input = userInput.nextLine();
        parsedInput = Integer.parseInt(input, 8);
        System.out.println("octal rep: " + parsedInput);

    }
    public static void binaryToHexadecimal()
    {


    }
}
