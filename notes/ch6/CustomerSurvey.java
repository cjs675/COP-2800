import java.util.*;

public class CustomerSurvey
{
    public static void main(String[] args)
    {
        int rating;
        final int MIN = 1;
        final int MAX = 5;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a value that");
        System.out.println("represents your satisfaction with");
        System.out.println("our service");
        System.out.println("Enter a value between " + MIN);
        System.out.println("and " + MAX);
        System.out.println("with " + MAX + " meaning highly");
        System.out.println("satisfied and");
        System.out.println(MIN + " meaning not at all satisfied");
        System.out.println("Enter your rating >> ");

        // get numeric rating from the user
        rating = input.nextInt();

        // loop that continues to execute while the user's response is out of range
        // i.e., less than 1 or greater than 5
        while(rating < MIN || rating > MAX)
        {
            System.out.println("You must enter a value");
            System.out.println("between " + MIN + " and "
                + MAX);
            System.out.println("Please try again >> ");
            rating = input.nextInt();
            System.out.println("Thank you");
        }
    }
}
