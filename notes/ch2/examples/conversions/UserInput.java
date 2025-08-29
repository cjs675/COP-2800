/** 
Filename: UserInput.java
Written by: cjs675 
Written on: 08/29/25

*/ 

/*
we will take user input using the util.scanner class
this class takes input from a selected input stream source - i.e. std i

source: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html#nextLine--
*/ 
import java.util.Scanner;


public class UserInput{
    public static void main(String[] args){
       /* System.out.printf("To convert two measurements: %n" +
                           "Enter a starting base unit: %n" +  
                           "Enter a unit to convert to: %n" +  
                           "Enter your base unit value: %n");  
        */
        System.out.printf("To convert two measurements: " +
                          "\n" +
                          "Enter a starting, base unit: %n" + 
                          "\n");
        Scanner scanner = new Scanner(System.in);
        String baseUnit = scanner.nextLine();
        System.out.println("your base unit is: " + baseUnit + '\n'); 
        System.out.println("Enter a unit to convert to: "); 
        String conversionUnit = scanner.nextLine();
        System.out.println("your desired unit to conver to is: " + conversionUnit + '\n');
    }
} 

/* 
nextBoolean()	Reads a boolean value from the user
nextByte()	Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	Reads a float value from the user
nextInt()	Reads a int value from the user
nextLine()	Reads a String value from the user
nextLong()	Reads a long value from the user
nextShort() reads short value from the user  
*/ 
