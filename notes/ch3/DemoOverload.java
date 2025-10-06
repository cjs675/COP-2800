// ex. -> Method Overloading
/*
    - whether we call the displayDate() method using one, two or even three args,
        the date is displayed correctly because we've successfully overloaded the
        displayMethod()
*/

public class DemoOverload
{
    public static void main(String[] args)
    {
        int month = 6, day = 24, year = 2025, moon = 1;
        float interest = 5.5F, balance = 10000F;
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
        displayDate(month, day, year, moon);
        displayDate(interest, balance);
    }

    public static void displayDate(int mm)
    {
        System.out.println("Event date " + mm + "/9/2025");
    }

    public static void displayDate(int mm, int dd)
    {
        System.out.println("Event date " + mm + "/" + dd + "/2025");
    }

    public static void displayDate(int mm, int dd, int yy)
    {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
    }

    public static void displayDate(int mm, int dd, int yy, int moon)
    {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy + " moon: " + moon);
    }

    public static void displayDate(float interest, float balance)
    {
        System.out.println("The interest rate is: " + interest + "\nThe balance is: " + balance);
    }
}


