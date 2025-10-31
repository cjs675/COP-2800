public class Array
{
    public static void main(String[] args)
    {
        String[] Cards = {"Ace", "King", "Queen"};

        // prints contents of an array, begin from first element
        System.out.println("Original Array:");
        for (int i = 0; i < Cards.length; i++)
        {
            System.out.println(Cards[i]);
        }
        // print array starting from last element
        System.out.println("Reverse Order: ");
            for (int i = Cards.length-1; i >= 0; i--)
                System.out.println(Cards[i] + " ");

    }
}
