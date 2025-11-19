public class decrementingWhileLoop
{
    public static void main(String[] args)
    {
        // loopCount begins with value of 10
        int loopCount = 10;
        // loopCount > 1, so loop body displays Hello & decrements loopCount to 9
        // boolean expression tested continually until it evaluates to false
        while (loopCount > 1)
        {
            System.out.println("Hello");
            // loopCount = loopCount - 1;
            // after loopCount is decremented to the point to where it is not > 1, the loop ends
            --loopCount;
        }
    }
}
