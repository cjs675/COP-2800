public class definiteWhileLooping
{
    public static void main(String[] args)
    {
        int lcv;
        final int LIMIT = 11;

        lcv = 1;
        while (lcv < LIMIT)
      //  while(4 > 2)
      // an expression such as the above (which always evaluates to true) will result in errors
        {
            System.out.println(lcv);
            lcv = lcv + 1;
        }
    }
}
