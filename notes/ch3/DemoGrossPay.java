public class DemoGrossPay
{
    public static void main(String[] args)
    {
        double hours = 25;
        double yourHoursWorked = 37.5;
        calculateGross(10);
        calculateGross(hours);
        calculateGross(yourHoursWorked);
        calculateGross(50, 45);
    }
    // since calculateGross never changes hours, we could also pass in
    // hours as a final double as an argument within the parameters of the
    // calculateGross method
    // in this way, readers would be to more easily see that the parameter is not intended to change

    // public static void calculateGross(double hours)
    public static void calculateGross(final double hours)
    {
        final double STD_RATE = 22.75;
        double gross;
        gross = hours * STD_RATE;
        System.out.println(hours + " hours at $" +
                STD_RATE + " per hour is $" + gross);
    }


    // overloading of methods
    public static double calculateGross(final double hours, final double hourlyRate)
    {
        final double WORKED = 40;
        final double  WAGE = 25.00;
        double gross;

        gross = WORKED * WAGE;
        System.out.println(WORKED + "hours at $" +
                WAGE + "per hour is " + gross);
        return gross;
    }

}
