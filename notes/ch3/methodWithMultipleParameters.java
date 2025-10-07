public class methodWithMultipleParameters
{
    public static void main(String[] args)
    {
     double hours = 25;
     double yourHoursWorked = 37.5;
     int yearsOfExp = 10;
     calculateGross(hours, yourHoursWorked);
     calculateGross(hours, yearsOfExp, yearsOfExp);
    }

    public static void calculateGross(double hours, double rate)
    {
        double gross;
        gross = hours * rate;
        System.out.println(hours + " hours at $" +
            rate + " per hour is $" + gross);
    }
    public static void calculateGross(double hours, double rate, int yearsOfExp)
    {
        double gross;
        gross = hours * rate * yearsOfExp;

        System.out.println(hours + " hours at $" +
        rate + " per hours is $" + gross);


    }
}



