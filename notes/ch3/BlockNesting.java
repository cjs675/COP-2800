public class BlockNesting
{
    public static void main(String[] args)
    {
        methodWithNestedBlocks();
    }

    // a method with nested blocks
    public static void methodWithNestedBlocks()
    { // outer block starts with opening brace

        int aNumber = 10; // aNumber comes into existence
        System.out.println
                ("In outer block, aNumber is " + aNumber);

        { // inner block starts with next opening brace

            int anotherNumber = 512; // anotherNumber comes into existence
            System.out.println
                    ("In outer block, aNumber is " +
                            aNumber + " and another number is " +
                            anotherNumber);

        } // inner block ends, anotherNumber ceases to exist; goes out of scope

// uh oh!        System.out.println("Hello from" + anotherNumber);
        System.out.println("In outer block, aNumber is " + aNumber);

    }
    // outer block ends, aNumber ceases to exist; goes out of scope
}