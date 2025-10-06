/*
in this example we show how variables with the same name can be used
within different methods by delineating each individual method's scope via {}


 */


public class TwoMethodsVarSameName
{
    public static void main(String[] args)
    {
        twoDeclarations();
    }

    public static void twoDeclarations()
    {
        {
            int someVar = 6;
            System.out.println(someVar);
        }
        {
            int someVar = 744523;
            System.out.println(someVar);
        }
    }
}
