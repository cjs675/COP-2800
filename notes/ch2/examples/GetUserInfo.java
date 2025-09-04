package examples;

// import scanner class
import java.util.Scanner;

public class GetUserInfo
{
    public static void main(String[] args)
    {
        // vars to be scanned declared, left uninitialized
        String name;
        int age;

        // scanner object initialized with variable name inputDevice
        // takes input from System.in (keyboard)
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter your name >> ");

        // scanner object used with nextLine() & nextInt() methods
        name = inputDevice.nextLine();
        System.out.print("Please enter your age >> ");
        age = inputDevice.nextInt();

        System.out.println("Your name is " + name +
                " and you are " + age + " years old");
    }
}
