public class methodWithMultipleParameters
{
    public static void main(String[] args)
    {
     double hours = 25;
     double yourHoursWorked = 37.5;
     calculateGross(hours, yourHoursWorked);
    }

    public static void calculateGross(double hours, double rate)
    {
        double gross;
        gross = hours * rate;
        System.out.println(hours + " hours at $" +
            rate + " per hour is $" + gross);
    }
}

