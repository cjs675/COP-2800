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
        // A new scanner object is created which takes input from the user
        Scanner userInput = new Scanner(System.in);

        String input = "";

        // To validate the input before calculation, we check whether it's equal to 0, greater than 16 or null
        // the program continues taking input as long as these conditions are met
        while (input.length() == 0 || input.length() >= 16 || input.equals("0"))
        {
            System.out.println("\nPlease enter a binary value of up to 16 digits\n");
            input = userInput.nextLine();
        }

        // Input stored in a local variable of reference type Integer
        // calling the parseInt() method which takes in the input as an argument
        // the parseInt() method takes the input, along with a radix, which is used to calculate the base of the input
        int parsedInput = Integer.parseInt(input, 2);

        binaryToDecimal(parsedInput);
        binaryToOctal(parsedInput);
        binaryToHexadecimal(parsedInput);

        userInput.close();
    }

    public static void binaryToDecimal(int parsedInput)
    {
        // Extract each decimal digit using division and modulo
        // The position of
        int hundredThousandsPos = (parsedInput / 100000) ;
        int tenThousandsPos = (parsedInput / 10000) % 10;
        int thousandsPos = (parsedInput / 1000) % 10;
        int hundredsPos = (parsedInput / 100) % 10;
        int tensPos = (parsedInput / 10) % 10;
        int onesPos = parsedInput % 10;

        System.out.println("\n1\t" + "\t" + onesPos);
        System.out.println("10\t" + "\t" + tensPos);
        System.out.println("100\t" + "\t" + hundredsPos);
        System.out.println("1000\t" + thousandsPos);
        System.out.println("10000\t" + tenThousandsPos);
        System.out.println("100000\t" + hundredThousandsPos);

        System.out.println("Decimal: " + parsedInput + "\n");

    }

    public static void binaryToOctal(int parsedInput)
    {
        // input parsed as binary (base 2) then converted to string equivalent in octal (base 8)

        /**
         * octalRep String object is assigned to an octal "base-equivalent" String
         * takes parsedInput (base 2) as an argument
         */
        String octalRep = Integer.toOctalString(parsedInput);
        /**
         * octalValue takes an octal base value of the octalRep String object
         * takes octalRep (base 8) as an argument
         */
        int octalValue = Integer.parseInt(octalRep, 8);

        // To calculate the respective position of the binary input in the desired format:
        // - take parsed binary value in correct number system
        // - divide value in respective number system by corresponding position value
        // - use modulo to return remainder (desired digit) in position value
        int pos262144 = (octalValue / 262144) % 8;
        int pos32768 = (octalValue / 32768) % 8;
        int pos4096 = (octalValue / 4096) % 8;
        int pos512 = (octalValue / 512) % 8;
        int pos64 = (octalValue / 64) % 8;
        int pos8 = (octalValue / 8) % 8;
        int pos1 = octalValue % 8;

        System.out.println("1\t" + "\t" + pos1);
        System.out.println("8\t" + "\t" + pos8);
        System.out.println("64\t" + "\t" + pos64);
        System.out.println("512\t" + "\t" + pos512);
        System.out.println("4096\t" + pos4096);
        System.out.println("32768\t" + pos32768);
        System.out.println("262144\t" + pos262144);

        System.out.println("Octal: " + octalRep + "\n");

    }

    public static void binaryToHexadecimal(int parsedInput)
    {
        String hexRep = Integer.toHexString(parsedInput);

        // Extract each hex digit from parsedInput
        int tenThousandsPos = (parsedInput / 65536) % 16;
        int thousandsPos = (parsedInput / 4096) % 16;
        int hundredsPos = (parsedInput / 256) % 16;
        int tensPos = (parsedInput / 16) % 16;
        int onesPos = parsedInput % 16;

        System.out.println("1\t\t" + Integer.toHexString(onesPos) + "\t" + onesPos);
        System.out.println("16\t\t" + Integer.toHexString(tensPos) + "\t" + tensPos);
        System.out.println("256\t\t" + Integer.toHexString(hundredsPos) + "\t" + hundredsPos);
        System.out.println("4096\t" + Integer.toHexString(thousandsPos) + "\t" + thousandsPos);
        System.out.println("65536\t" + Integer.toHexString(tenThousandsPos) + "\t" + tenThousandsPos);

        System.out.println("Hexadecimal: " + hexRep);

    }
}