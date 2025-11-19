public class preventingInfiniteWhileLoops
{
    public static void main(String[] args)
    {
        // loop control variable initialized
        int loopCount = 1;
        // loop control variable is tested - compared to 10
        while (loopCount < 10)
        {
            System.out.println("Hello");
            // loop control variable is altered - 1 added to it
            // loopCount = loopCount + 1;
            ++loopCount;
        }
    }
}
