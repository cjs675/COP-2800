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
        displayHours();
    }
}
```

