leep# ch. 3 using methods 

### 3.1 understanding method calls and placement 
- __method:__ program module that contains series of statements that carry out a task 
  - __ex.__ Java classes that contain a __main()__ method 
    - can execute additional methods, & those additional methods can also execute others 
- any class can contain an unlimited number of methods, and each method can be called an unlimited number of times 
- to execute a method, we call or __invoke__ it 
  - iotw, a __calling method__ (aka a _client method_) invokes a __called method__
- suppose we have a class that displays org name in single line of output
  - then, suppose we wish to add three lines of output to this application to display the biz. hours for the company 
    - one approach would be to simply __add three new println()__ statements: 
```java
public class CompanyInfo
{
    public static void main(String[] args)
    {
        System.out.println("Smart Electronics"); 
        System.out.println("Monday - Friday 8am to 6pm");
        System.out.println("Saturday        8am to noon"); 
        System.out.println("Sunday          closed");
    }
} 
```
- ^ too verbose 
- instead of adding three __println()__ statements to og app, might prefer to call a method that executes the three new print statements 
- in this way, the __main()__ method would look like the following, which invokes the __displayHours()__ method 
```java
public class CompanyInfo
{
    public static void main(String[] args)
    {
        System.out.println("Smart Electronics");
        displayHours(); // call to method 
    }
}
```
- advantages of creating a separate method to display the three new lines: 
  - by using a method call to execute the three separate __println()__ statements, the __main()__ method remains short and easy to follow
  - by using a well named method, its easy to see overall intent of the separate __println()__ statements 
  - a method is easily reusable. after you create the __displayHours__ method, can use it in __any__ application that needs the company's hours of operation 
    - iotw, you do the work once, and can reuse the method many times 
- before calling the method, the entire method itself must be defined within a class, outside of any other methods  
- can't place a method within another method  
- following shows other acceptable places to add a method in the __CompanyInfo__ class 
```java
public class CompanyInfo
{
    // method can be placed here before main()
    // displayHours();
    public static void main(String[] args)
    {
        System.out.println("Smart Electronics");
        displayHours();
    }
    // method can also be placed here, after main() 
    // displayHours();
}
```
- order in which methods appear in a class has no bearing on order in which the methods are called or executed 
- no matter where you place it, __main()__ method always executed first in __any__ java app 
  - might call other methods in any order and any number of times 
- __order in which you call methods, not their physical placement is what makes a difference in how a java app executes__ 
- a __main()__ method executes automatically when you run a program, but other methods do not execute simply because they're placed within a class - must be __called__ 
- a class might contain methods that are never called from a particular app, just as some electronic devices have features one might never use 
```java
// complete CompanyInfo class with a displayHours() method 
public class CompanyInfo
{
    public static void main(String[] args)
    {
        System.out.println("Smart Electronics");
        displayHours();
    }       
    
    public static void displayHours()
    {
        System.out.println("Monday - Friday 8am to 6pm"); 
        System.out.println("Saturday         8am to noon"); 
        System.out.println("Sunday            closed");
    }
}
``` 

## 3.2 understanding method construction 
- every method must include two parts: 
  1. __method header__ provides information about how other methods can interact with it 
     i. aka __method declaration__  
  2. __method body__ between {} - contains statements that carry out the work of the method 
     ii. method body is called its __implementation__ 
- method __header__ is first line of a method 
- contains following: 
  - optional access specifiers
  - optional __static__ modifier
  - a return type 
  - an identifier
  - parentheses, which may or may not be empty 


### access specifiers 
- defines circumstances under which a class can be accessed + other classes that have the right to use a class 
- aka __access modifier__ 
- the access specifier for a java method can be any of the following modifiers: 
  - public 
  - private 
  - protected 
  - package (if left unspecified by default)
- most often, methods are given __public__ access 
  - endowing a method with a __public__ access means that any other class can use it, not just the class in which the method resides 
- __ex.__ access specifiers for two methods 
```java
public static void main(String[] args) 

public static void displayHours()
```
- the __main()__ method in an app (a runnable program) must specify __public__ access 
- the __static__ modifier means these methods do __not__ require an object when they are called 
- the __displayHours()__ method is not required to specify public access
  - however, if access is __public__, the method can be used by other, outside classes 

### the __static__ modifier
- any method that can be used without instantiating an object requires the keyword modifier __static__ 
- the __main()__ method in an app __must__ use the keyword static, but other methods, like __displayHours()__ can use it too 
### return type 
- describes the type of data the method sends back to its calling method 
- not all methods __return a value__ to their calling methods
- a method that returns no data has a return type of __void__
- the __main()__ method in an app __must__ have a return type of void 
- phrases _void method_ and _method of type void_ both refer to a method that has a __void__ return type 
```java
public static void main(String[] args)

public static void displayHours()

// displayHours() method not required to specify public access
// if access is public, the method can be used by other, outside classes 
``` 

### method name
- can be any legal identifier 
  - must be one word with __no__ embedded spaces
  - cannot be a Java keyword 
- method that executes first when an app is run __must__ be named __main()__ 
- names of methods frequently contain a verb, such as __display__ or __compute__ (since they often times perform some action)

### parentheses 
- every method header contains a set of parentheses that follow an identifier 
- the parentheses might contain data to be sent to the method 
- __fully qualified identifier:__ complete method name that includes a class 
  - ex. (from examples above)  __CompanyInfo.displayHours()__ 
- when using a method within its own class - no need to use fully qualified name (though you can)
  - method name alone is enough 
- when using a method in __another__ class - compiler doesn't recognize the method unless it's full name is used 
  - ex. __JOptionPane.showMessageDialog()__ 
- ex. 
  - we could have two distinct classes with methods of the _same_ name -> __displayHours()__ 
    - either of the methods would be entirely different from their identically named counterparts  
    - these two methods could then be used within a third class by using their __fully qualified identifier__
- __Note:__ 
  - think of the class name as the family name 
  - within one's own family, an activity might be referred to as _the family reunion_, but outside the family, people need to use a surname as well, 
  as in the Smith Family reunion
  - similarly, a method name alone is sufficient without a class, but __outside__ the class, a fully qualified name is required 

    
### in short
- a method header is a __declaration__
- a method body is its __implementation__ 
- when a method is declared with __public__ access, methods in other classes can call it 
- not __all__ methods return a value, but __every__ method requires a __return type__ 

## 3.3 adding parameters to methods 
- some methods require that data items be sent to them when they are called 
- we call these data items used in a call to a method _arguments_  
- when a method receives a data item, its called a __parameter__ 
- methods that receive data are flexible because they can produce different results depending on the data they receive 
- object-oriented programs use __implementation hiding__, which describes the encapsulation of method details 
  - a client doesn't need to know how a method works internally, only the name of the called method & type of info to send 
  - usually want to know of any data returned by the method 
  - calling method only needs to understand only the interface to the called method 
- the __interface to a method__ is the only part of a method that the method's client sees or with which it interacts 
  - in addition, if you sub a new or revised method implementation, as long as the interface to the method doesn't change, you won't need to make any changes in any methods that call the altered method 
- hidden implementation methods often referred to as existing in a __black box__ 
  - many everyday devices are black boxes - can use them without understanding how they work 

### creating a method that receives a single parameter 
- all method declarations contain the same elements 
  - optional access specifiers 
  - return type for the method 
  - method name 
  - set of parentheses 
- if method receives a parameter, __two__ additional items are required within the parentheses: 
  - parameter type 
  - local name for the parameter 
- __ex.__ in creating a  method to compute gross pay based on std. hourly pay rate, gross pay
is number of hours an employee worked x hourly pay rate (before deductions) 
  - declaration for a public method named __calculateGross()__ that accepts a value for an employee's hours worked could be written as follows: 
  ```public static void calculateGross(double hours)```  
- can think of the parentheses in a method declaration as a _funnel_ into the method - parameters listed there contain data that's "dropped into" the method 
- a parameter accepted by a method can be any data type, including the primitive types, such as __int, double, char__ 
  - can also be a built-in class type such as __String__ or __PrintStream__, or a class type you create 
- in the following method header for __calculateGross()__, the parameter __double hours__ within the parentheses indicates that the method will receive a value of type __double__, and that within the method, the passed value will be 
known as __hours__ 
```java
public static void calculateGross(double hours)
{
    final double STD_RATE = 22.75;
    double gross;
    gross = hours * STD_RATE;
    System.out.println(hours + " hours at $" + 
    STD_RATE + " per hours is $" + gross);
}
```
- the __calculateGross()__ method is a __void__ method because it does not need to return a value to any other method that calls it - its only function is to receive the __hours__ value, multiply it by the __STD_RATE__ constant, 
and then display the result 
- the __calculateGross()__ method's parameter is a __double__, so you can call it using any argument that can be promoted to a __double__ 
  - __Recall:__ order of promotion
    - ```double, float, long, int``` 
    - any type in this list can be promoted to any type that precedes it 
- iotw, a method that has a __double__ parameter can accept a variable, constant, or expression that is a ```double, float, long, int, short or byte``` 
- for example, all the following method calls are valid: 
  - __calculateGross(10)__ - this call uses an unnamed __int__ constant that is promoted to a __double__ 
  - __calculateGross(28.5)__ - this call uses an unnamed __double__ constant 
  - __calculateGross(7.5 * 5)__ - this call uses an arithmetic expression that results in a __double__
  - __calculateGross(STANDARD_WORK_WEEK)__ - this call uses a named constant that might be a __double, float, long, int, short or byte__ 
  - __calculateGross(myHours)__ - this call uses a variable that might be a __double, float, long, int, short or byte__ 
  - __calculateGross(getGross())__ - this call assumed that the __getGross()__ method returns a __double, float, long, int, short or byte__ 
- can call __calculateGross()__ method any number of times, with a different argument each time 
  - each of these arguments becomes known as __hours__ within the method 
    - the identifier __hours__ represents a variable that holds a copy of the value of any __double__ value passed into the method 
- see [DemoGrossPay] class with a __main()__ method that calls the __calculateGross()__ method three times
- in the preceding example, the identifier __hours__ in the __main()__ method that is used as an argument in one of the method calls refers to a 
different memory location than __hours__ in the __calculateGross()__ method 
  - the parameter __hours__ is simply a placeholder while its being used within the method, no matter what name its value "goes by" in the calling method 
  - the parameter __hours__ is a __local variable__ to the __calculateGross()__ method
    - that is, its known only within the boundaries of the method 
    - the variable constant declared within the method are also local to the method 
- each time the __calculateGross()__ method executes, an __hours__ variable is redeclared 
  - i.e. a new memory location large enough to hold a __double__ is set up & named __hours__ 
  - within the method, __hours__ holds a copy of whatever value is passed into the method by the __main()__ method 
  - when __calculateGross()__ method ends at the closing {}, the local __hours__ variable ceases to exist 
    - iotw, if you change the value of __hours__ after you have used it in the calculation within __calculateGross()__, it affects nothing else 
  - the memory location that holds __hours__ is released at the end of the method & changes to its value within the method don't affect any value in the calling method 
- similarly, there is no change in the variable named __hours()__ in the __main()__ method
  - that variable, even though it has the same name as the locally declared parameter in the __calculateGross()__ method, is a different variable with its own memory address 


### creating a method that requires multiple parameters 
- a method can require more than one parameter 
- ex. rather than creating a __calculateGross()__ method that uses a standard hourly rate for every employee, might prefer to create a method to which you can pass 
two values - the hours worked as well as a custom hourly rate 

```java
public static void calculateGross(double hours, double rate)
{
    double gross;
    gross = hours * rate;
    System.out.println(hours + " hours at $" + 
    rate + " per hour is $" + gross); 
}
```
- in the preceding example, two parameters (__double hours__ and __double rate__) appear within the parentheses in the method header 
  - a comma separates each parameter, & each parameter requires its own declared type  (in this case, both are __double__) 
and its own identifier 
- a declaration for a method that receives multiple parameters must list the type for each parameter separately, even if the params are of same type 
- can pass multiple args to a method by listing the args within the call to the method & separating them with commas 
- can write a method so it takes any number of parameters in any order 
  - however, when calling a method, the args sent to it must match in order - both in __number__ and __type__ (params listed in method declaration)
- __ex.__ the call __calculateGross(10, 20)__ results in output describing 10hrs worked at $20/hr
  - __calculateGross(20, 10)__ results in output describing 20hrs worked at $10/hr 
- if args to a method are passed in wrong order: one of following occurs: 
  - if the method can still accept all the args, the result is a logical error - that is, the program compiles & executes, but produces incorrect results 
  - if the method cannot accept the args, passing args in the wrong order constitutes a syntax error, & program doesn't compile 
    - ex. try to pass a double to method that accepts an int, program fails to compile 
- method __signature:__ combo of method name, number, types & order of args 
- therefore, a __method call__ must match the called method's __signature__  
- __actual parameter:__ an argument in a method call 
- __formal parameter:__ variable in the method declaration that accepts the values from an actual parameter 
- __method overloading:__ 
  - the ability to execute different method implementations by altering the argument used with the method name 

## 3.4 creating methods that return values 
- a method ends when any of the following events takes place: 
  - method completes all of its statements 
  - method throws an exception (error)
  - method reaches a __return__ statement 
- __return__ statement causes method to end & program's logic is returned to the calling method 
  - also frequently sends value back to calling method 
- return type for method can be any type used in Java, which includes primitive types ``int, double, char, etc`` as well as class types (including class types one has created)
- methods can also return _nothing!_ (__void__)
- method return types known more succinctly as a __method's type__
```java
// this method's return type is void, so it returns nothing
public static void displayHours()
// this method's return type is of int, so it returns an int    
public static int getAge() 
// this method's return type is of boolean, so it returns a boolean 
public static boolean didWorkOvertime()
``` 

```java
// version of calculateGross() methods that returns a double 
public static double calculateGross(double hours, double rate)
// return type ^
{
    double gross;
    gross = hours * rate;
    return gross;
// value returned ^
}
```
- a method's declared return type must be compatible with the type of value used in the __return__ statement 
- iotw, the return value must match the return type or be promotable to the return type 
  - if the return is not compatible with the method's return type, the class does __not__ compile 
- __ex.__ a method with a __double__ return type might have a return statement that looks like either of the following: 
  - ``return 1;``
  - ``return 1.0;`` 
- if the types are compatible, a method might return a: 
  - variable 
  - named constant 
  - call to another method 
  - result of a calculation
```java
return myHoursWorked;
return MAXIMUM_PAY;
return getHours();
return myRate * 1.2;
```
- all methods (except void) require a return statement that returns a value of the appropriate type 
- can place a __return__ statement in a __void__ method that is simply the word __return__ followed by a semicolon
  - most java devs don't include a __return__ statement in a method when nothing is returned 
- cannot place any statements after a method's return statement 
  - aka __unreachable statements__ 
    - logic flow leaves method at the __return__ statement 
    - can never execute, causes compiler error 
    - aka __dead code__ 
- if a method returns a value, then when you call the method, you normally use the returned value, although you aren't required to do so
  - __ex.__ when invoking the __calculateGross()__ method, might want to assign the returned value (also called method's value) to a __double__ variable named __myPay__
```
myPay = calculateGross(myHoursWorked, myRate);
```
- alternatively, can choose to use a method's returned value directly, without storing it in any variable
- when a method's value is used, it is used in the same way any variable of the same type is 
  - __ex.__ can display a method's returned value from within a __println()__ method call: 
```
System.out.println("My pay is " + 
    calculateGross(myHoursWorked, myRate));
```
- because __calculateGross()__ returns a __double__, this method call can be used in the same way any simple __double__ value would be used 
- might also use a method's return value directly in an arithmetic expression: 
```
double spendingMoney = calculateGross(myHoursWorked, myRate) - expenses;
```
- any method might call any number of other methods 
- __ex.__ a __main()__ method might call a __calculateNetPay()__ method, and the __calculateNetPay()__ method might call both __calculateGross()__ and __calculateWithholding__ 
```java
// calculateNetPay() method calling two other methods 
public static double calculateNetPay(double hours, double rate)
{
    double gross;
    double withholding;
    double net;
    gross = calculateGross(hours, rate);  
    // call to calculateGross() ^
    withholding = calculateWithholding(gross); 
    // call to calculateWithholding() ^
    net = gross - withholding;
    return net;
}
```
- when we look at the call to __calculateWithholding()__ method from the __calculateNetPay()__ method, we do not know how __calculateWithholding()__ works
- we know only that the method accepts a __double__ as a parameter (because __gross__ is passed into it) and that it must return either a __double__ or a type 
that can automatically be promoted to a __double__ (because the result is stored in the __double__ variable __withholding__ )
  - iotw, the method acts as a black box 
- we can also __nest__ method calls within method calls 
  - if we create methods __getHours()__ and __getRate()__, and each returns a __double__, then we might want to call __calculateNetPay()__ as follows: 
    ``double net = calculateNetPay(getHours(), getRate());`` 
- __Recall:__ 
  - a method's declared __return__ type must match the type of value used in the __return__ statement  

- In this chapter, so far we've learned methods can be used without knowing details of their implementation
  - as an example of how pro devs use __implementation hiding__, visit Java website to see the interfaces of thousands of prewritten methods that reside in the Java preqritten classses 
  - aren't allowed to see the code inside these methods; only see their interfaces, which is __all__ you need to use the methods 

## 3.5 understanding blocks and scope
- within any class or method, the code between a pair of curly braces is a _block of code_ or more simply, a _block_ 
- the following method contains two blocks: 
  - the __outer block__ begins at the first opening curly brace & ends at the last closing curly brace, at the end of the method 
  - the __inner block__ starts with the second opening curly brace & ends with the first closing curly brace 
    - it contains two executable statements: the declaration of __anotherNumber__ and a __println()__ statement 
    - the inner block is __nested__, or contained entirely within the outer block
```java 
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

    System.out.println("In outer block, aNumber is " + aNumber);

} // outer block ends, aNumber ceases to exist; goes out of scope 
```
- a block can exist __entirely__ within another block or entirely outside and separate from another block, but blocks can never overlap 
- cannot refer to a variable outside the block in which it is declared 
- __scope:__ refers to the portion of a program within which you can refer to a variable is the variable's _scope_ 
- in java, a variable __comes into scope__ upon declaration 
  - __goes out of scope__ (ceases to exist) at end of block in which its declared 
- a java variable's __scope level__ is its block
- although we can create as many variables & blocks as needed within any program, unwise to do so without a reason 
- the use of unnecessary variables & blocks increases likelihood of improper use of variable names and scope 
- in the __methodWithNestedBlocks()__ method above, the variable __aNumber__ exists from the point of its declaration until the end of the method 
  - this means __aNumber__ exists both in the outer block & in the inner block & can be used anywhere in the method 
  - the variable __anotherNumber__ comes into existence within the inner block & goes out of scope when the inner block ends & cannot be used beyond its block  
- __cannot__ use a data item thats not in scope 
- vertically aligning {} for a block makes programs easier to read 
- within a method, we can declare a variable with the same name multiple times, as long as each declaration is in its own nonoverlapping block 
- __ex.__ the two declarations of variables named __someVar__ are valid because each variable is contained within  its own block 
  - the first instance of __someVar__ has gone out of scope before the second instance comes into scope 
  - good practice __NOT__ to do as such (worsens readability) 
```
public static void twoDeclarations() 
{
    {
        int someVar = 7; // someVar goes out of scope after next closing }
        System.out.println(someVar);
    }
    {
        int someVar = 845; // completely different from someVar in prior block although same identifier 
        System.out.println(someVar);
    }
}
```
- cannot declare the __same__ variable more than __once__ within a block, even if a block contains other blocks 
  - when you declare a variable more than once in a block, you attempt to __redeclare a variable__ which is an illegal action
- __ex.__ 
```
public static void invalidRedeclarationMethod() 
{
    int aValue = 35; 
    int aValue = 122;
    {
        int anotherValue = 0;
        int aValue = 10;  // invalid redeclaration - even though this is a new block
                          // this block is still inside the first block 
    }
}
```
- although we can't declare a variable twice within the same block, we can declare a variable within one method of a class & use the same variable name within another method of the class 
  - in this case, the variable declared inside each method resides in its own location in computer memory  
- __iotw__, a locally declared variable always __masks__ or hides another variable with the same name elsewhere in the class  
- variables and fields with the same names represent _different_  


## 3.6 method overloading 
- __overloading__ a method allows you to use one identifier to execute diverse tasks 
- in java, specifically refers to writing multiple methods in the same scope that have the same name but different parameter lists 
  - iotw, you overload methods by providing different parameter lists for methods with the same name 
  - in overloaded methods, the parameter identifiers __dont't__ have to be different
    - parameter lists must satisfy one or both of these conditions: 
      - the lists must have different numbers of parameters 
        - __ex.__ one list could have one __double__, another list could have two __doubles__, a third list could have 10 __doubles__ 
      - the lists must have parameter data types in different orders 
        - __ex.__ one list could have two __doubles__, another could have an __int__ followed by a __double__, and a third 
        could have a __double__ followed by an __int__  
- when overloading a java method, multiple methods share a name, & the compiler understands which one to use based on the 
args in the method call  
- __ex.__
  - suppose we create a java class method to apply a simple interest rate to a bank balance 
    - the method is named __calculateInterest()__ 
    - receives two __double__ params 
      - bank balance 
      - interest rate 
    - displays multiplied result 
```
public static void calculateInterest(double bal, double rate) 
{
    double interest;
    interest = bal * rate;
    System.out.println("Simple interest on $" + bal + 
        " at " + rate + "% rate is " + interest);
}
``` 
- when an application calls the __calculateInterest()__ method & passes two __double__ values, as in __calculateInterest(1000.00, 0.04)__,
the interest is calculated correctly as 4 percent of $1,000 
    - assume, different users wish to calculate interest using different arg types 
    - some who wish to indicate an interest rate of 4% might use __0.04__, and assume it means 4% 
  - when the __calculateInterest()__ method is called with the args __1000.00__ and __0.04,__ the interest is calculated correctly as __$40__
  - when the method is called using __1000.00__ and __4__, the method _works_ because the __int__ arg is promoted to a __double__, but the interest is calculated incorrectly as 4000.00, which is 100x too high
- a solution for the conflicting use of numbers to represent parameter values is to overload the __calculateInterest()__
    - __ex.__ in addition to the __calculateInterest()__ method shown above, could add the method shown _below_:
```
// calculateInterest() method with a double parameter and an int parameter 

public static void calculateInterest(double bal, int rate) 
{
    double interest, rateAsPercent;
    rateAsPercent = rate / 100.0;
    interest = bal * rateAsPercent;
    System.out.println("Simple interest on $" + 
    bal + " at " + rate + "% rate is " + 
    interest);
}
``` 



## 3.7 ambiguity 

- overloading methods useful since you can use a single identifier to execute different ixns depending on args sent to the method 
- however, when overloading methods, run risk of creating an __ambiguous__ situation - 
  - one in which compiler can't control method to use 
- __ex.__ 
```java
public static void computeBalance(double deposit)
public static void computeBalance(double withdrawl)
```
- a program that contains these two methods _wont_ compile 
- a program containing the following method declarations _will_ compile since they have different types in their parameter lists
```java
public static void calculateInterest(int bal, double rate)
public static void calculateInterest(double bal, int rate)
```
- a call to __calculateInterest()__ with an __int__ and a __double__ argument executes the first method 
- a call to __calculateInterest()__ with a __double__ and an __int__ argument executes the second version of the method 
- with each of these calls, the compiler can find an exact match for the arguments send 
- the two versions of the above method declarations with a single parameter could coexist if no ambiguous calls were ever made 
  - an overloaded method with different parameter lists is not ambiguous on its own 
    - becomes ambiguous only if you make an ambiguous method call 
    - a program containing a potentially ambiguous situation will run problem free if no ambiguous method calls are made 
- __Note:__ 
  - methods can be successfully overloaded by providing different parameter lists for methods with the same name 
  - methods with identical names that have identical parameter lists but different return types are not overloaded - they're __illegal__ 
- __ex.__ 
```java
// the following two methods are illegal in the same class 

int aMethod(int x )
int aMethod(int x)
```
- the compiler determines which of several versions of a method to call based on the args in the method call 
  - it does __not__ consider the __return__ type 
- __Note:__ 
  - if the keyword __final__ appears in a method's parameter list, it's ignored when determining ambiguity 
    - i.o.t.w, two methods with the headers __void aMethod(int x)__ and __void aMethod(final int x)__ are ambiguous 


```
Don't Do It

- don't place semicolon at end of method header 
  - easy to get used to putting ; everywhere after every statement 
  - methods never end in a semicolon 
- don't try to use a variable that's out of scope 
- don't assume a constant is still a constant when passed to a method's parameter 
  - if you want a parameter to be a constant within a method, must use __final__ in the parameter list 
- don't try to overload methods by giving them different return types 
  - if their identifiers and parameter lists are the same, then two methods are ambiguous no matter what their return types are 
```
 
















