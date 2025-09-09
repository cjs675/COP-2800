package examples;
import java.util.Scanner;

public class ArithmeticDemo
{
    public static void main(String[] args)
    {
        // declaration of variables, left uninitialized
        // used to hold two variables + their sum, diff & avg
        float firstNumber;
        float secondNumber;
        float sum;
        float difference;
        double average;


        System.out.println("*".repeat(50)
                + "\n\t\twelcome to the arithmetic demo\n"
                + "*".repeat(50));
        // declaration of a new scanner object
        // named input to accept keyboard input
        // takes System.in as its argument
        Scanner input = new Scanner(System.in);

        // prompt user for & accept two integers
        System.out.println("\nPlease enter a number, whole or partial:  ");
        firstNumber =  (float) input.nextDouble();

        System.out.println("\nPlease enter another number, whether whole or partial:  ");
        secondNumber =  (float) input.nextDouble();

        // perform arithmetic, creating variables storing values of each
        // sum, difference and average

        sum =  firstNumber +  secondNumber;
        difference = (int) firstNumber - (int) secondNumber;
        // average = (double) sum / 2;
        // we can also achieve the same as the above line by dividing by a float type,
        // so the result is a double without having to explicitly convert the type
        average = sum / 2.0;

        // print out three calculated values using
        // println() statements, include concatenation
        // of multiple statements

        System.out.println("\n" + firstNumber + " + " +
                secondNumber + " is " + sum);
        System.out.println("\n" + firstNumber + " - " +
                secondNumber + " is " + difference);
        System.out.println("\nthe average of " + firstNumber +
                " and " + secondNumber + " is \n" + average);
        System.out.println("\nthe difference of " + firstNumber +
                " and " + secondNumber + " is \n" + difference);
    }
}


