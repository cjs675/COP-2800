## ch. 3 using methods 

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

### 3.2 understanding method construction 
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
- defines cirumstances under which a class can be accessed + other classes that have the right to use a class 
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

  






