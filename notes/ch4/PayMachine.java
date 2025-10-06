public class PayMachine
{
    public static void main(String[] args)
    {
        System.out.println("Pay machine, v1.0\n");
        System.out.println("copyright (c), 2025 by Chris Silva\n\n");

        // create an instance of PaymentCalculator
        PaymentCalculator p = new PaymentCalculator();
        System.out.printf(String.format("Hours = %s\n", p.hours));


        System.out.println("Thank you for using ");
    }
}
