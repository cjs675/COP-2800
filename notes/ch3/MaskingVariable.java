public class MaskingVariable
{
    public static void main(String[] args)
    {
        int aNumber = 10; // aNumber is declared in main()
        System.out.println("In main(), aNumber is " + aNumber);
        firstMethod();
        System.out.println("Back in main(), aNumber is " + aNumber);
        secondMethod(aNumber);
        System.out.println("Back in main() again, aNumber is " + aNumber) ;
    }
    public static void firstMethod()
    {
        int aNumber = 77; // this aNumber resides at a different
                          // memory address from the one in main()
                          // declared locally in this method
        System.out.println("In firstMethod(), aNumber is "
        + aNumber);
    }
    public static void secondMethod(int aNumber) // this aNumber resides at a different
                                                 // memory address from the one in main()
                                                 // declared locally in this method
    {
        System.out.println("In secondMethod(), at first " +
                "aNumber is " + aNumber);
        aNumber = 862;
        System.out.println("In secondMethod(), after an assignment " +
                "aNumber is " + aNumber);
    }
}
