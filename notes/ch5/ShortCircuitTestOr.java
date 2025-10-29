public class ShortCircuitTestOr
{
    public static void main(String[] args)
    {
        //if ( trueMethod() && falseMethod() )
        // the if statement makes a call to falseMethod()
        // since it evaluates to false, no need to check condition of remaining operand on the right ( trueMethod() )
        if ( falseMethod() || trueMethod())
            System.out.println("Either are true");
        else
            System.out.println("Both are not true");
    }
    public static boolean trueMethod()
    {
        System.out.println("Within trueMethod()");
        return true;
        // return false;
    }
    public static boolean falseMethod()
    {
        System.out.println("within falseMethod()");
        return false;
    }
}
