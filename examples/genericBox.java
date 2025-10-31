public class genericBox
{
    // a generic type is a generic class or interface that is parameterized over types

    // first ex. shows a non-generic box class that operates on objects of any type
    // needs only to provide two methods:
    // set -> adds object to the box
    // get -> retrieves the object from the box


    private Object object;

    public void set(Object object)
    {
        this.object = object;
    }

    public Object get()
    {
        return object;
    }

    // since its methods accept or return an Object, free to pass whatever, provided its not
    // one of primitive types

    // Issue --> no way to verify (at compile time) how class is used
    // one part of code may place an Integer in the box & expect Integers out
    // other part may mistakenly pass in a String, resulting in runtime error


    /* A generic version of the Box class.
       A generic class is defined in following format:

       class name<T1, T2, ... Tn> {}
       The type parameter section, delimited by <> follows the class name
        - specifies the type parameters
       The type variable T can be used anywhere inside the class
        - can be any non-primitive type: class, interface type, array type, or even another
          type var.
        - same technique can be applied to creating generic interfaces

        Naming Conventions:
            - single, uppercase letters
            - most commonly used:
                - E (element)
                - K (key)
                - N (number)
                - T (type)
                - V (value)
                - S, U, V (etc, 2nd, 3rd, 4th types)

        To reference generic classes -> generic type invocation
            - replaces T with some concrete value, such as Integer
                Box<Integer> integerbox;
            - similar to ordinary method invocation, instead of passing argument to method,
                pass a type argument (integer in ex. above) to the class itself
        An invocation of a generic type -> parameterized type.
        To instantiate this class, use the new keyword but place <Integer> between class name &
            parentheses
                Box<Integer> integerBox = new Box<Integer>():




     */

    /** A generic version of the Box class.
     * @param <T> the type of value being boxed
     */
    public class Box<T>
    {
        // T = "type"
        private T t;

        public void set(T t)
        {
            this.t = t;
        }

        public T get( )
        {
            return t;
        }
    }
}