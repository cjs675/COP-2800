package examples;
import java.util.Scanner;

public class IntegerDemoInteractiveWithName
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        String name;
        String greeting;
        int age;

        System.out.print("Please enter your name:  ");
        name = input.nextLine();
        System.out.print("Please enter a byte:   ");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer:   ");
        aShort = input.nextShort();
        System.out.print("Please enter an int:  ");
        anInt = input.nextInt();
        System.out.print("Please enter a long integer:  ");
        aLong = input.nextLong();

        System.out.println(name);
        System.out.println(aByte);
        System.out.println(anInt);
        System.out.print(aLong);

    }
}
