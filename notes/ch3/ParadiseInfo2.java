import java.util.Scanner;

public class ParadiseInfo2
{
    public static void main(String[] args)
    {
        double price;
        double discount;
        double savings;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter cutoff price for discount >> ");
        price = keyboard.nextDouble();
        System.out.println("enter discount rate as a whole number >> ");
        discount = keyboard.nextDouble();

        displayInfo();
        savings = computeDiscountInfo(price, discount);

        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + "percent");
        System.out.println("That's a savings of at least $" + savings);

        returnDiscount(5.0);
    }
    public static void displayInfo()
    {
        System.out.println("Paradise Day Spa wants to pamper you\n");
        System.out.println("We will make you look GOOD!! ");
    }
    public static double computeDiscountInfo(double price, double discountRate)
    {
        double savings;
        savings = price * discountRate / 100;
        return savings;
    }

    public static double returnDiscount(double price)
    {
        double discount;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a discount: ");
        discount = keyboard.nextDouble();
        return discount;
    }

}

