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

