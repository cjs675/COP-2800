public class loopCountPrint
{
    public static void PrintIntegers(int numberOfIntegers)
    {
        // set initial condition, start = 1, end = 10
        int index = 1;
        int end = 15;
        // check loop condition
        while(index <= end)
        {
            // do the work that should be repeated
            System.out.println(index);
            // modify loop condition (increment counter)
            index++;
        }
    }
    // achieves same as above
    // anytime a counting algo is being used, the for loop is more convenient
    public static void PrintIntegersTwo(int numberOfIntegers)
    {
        // sets initial condition (index) to 1
        // checks condition (index)
        // increments index, modifies condition
        for (int index = 1; index <= numberOfIntegers; index++)
        {
            System.out.println(index);
        }
    }
    public static void main(String[] args)
    {
        PrintIntegers(10);
        PrintIntegersTwo(10);
    }
}
