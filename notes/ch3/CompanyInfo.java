public class CompanyInfo
{
    public static void main(String[] args)
    {
        System.out.println("\t\tSWFL Smart Electronics");
        spaceDividers();
        displayHours();
    }

    public static void displayHours()
    {
        System.out.println("Monday - Friday 8am to 6pm");
        System.out.println("Saturday        8am to noon");
        System.out.println("Sunday          CLOSED");
    }

    public static void spaceDividers()
    {
        System.out.println("*".repeat(50)
                + "\n\t\t\tOperating Hours: \n"
                + "*".repeat(50));
    }

}
