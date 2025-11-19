# ch.5 Making decisions 

## 5.1 planning decision-making logic 

- __pseudocode:__ tool that helps plan a program's logic by writing down in plan english steps needed to accomplish given task 
- __flowchart:__ steps written in diagram form, in series of shapes connected by arrows 
  - rectangle -> represent any unconditional step 
  - diamond -> represent any decision 
    - hold a "question" 
    - paths drawn to alternate courses of action emerging from sides of diamons 
- __sequence structure:__ logical structure in which one step follows another unconditionally 
  - might contain any number of steps in which one task follows another with no chance to branch away or skip a step  
- __decision structure__ flowchart involving choosing between alternative courses of action based on some value within a program 

## 5.2 if and if..else statements 

- in java, when we wish to take an action if a Boolean expression is true, we use an __if__ statement 
- if we wish to take an action when a boolean expression is true, but take a different course of action when the expression is false, use an __if...else__ statement 

### the if statement 
- simplest statement that can be used to make a decision 
- aka __single-alternative selection__ (offers only one alternative - the true alternative) 
- double equal sign (==) used to determine equality --> __equivalency operator__ 
```
if (quizScore == 10)
    {
        System.out.println("The score is perfect");
    }
``` 
- java if statements always include parentheses 
  - can place any boolean expression within the parentheses 
  - most often use a comparison that includes 1/6 relational operators (==, <, >, <=, >= !=)  
  - can use any expression that evaluates as true or false, such as a simple __boolean__ variable or a call to a method that returns a boolean value 
  - never contain semicolons at end of first line 
  - statements end after the action that should execute if the boolean expression in the __if__ statement is true 
- can use standard operational operators to compare values of primitive data types such as __int__ and __double__ 
  - cannot use <, >, <=, >= to compare objects -- won't compile 
    - can put == & != comparisons, but in doing so compare memory addresses 
    - equivalency operators compare objects' references 
  - to compare values of objects -> write specialized methods 
- object names are __references__, but values that are simple data types are not
- an alternative to using a boolean expression in an __if__, such as __quizScore == 10__ is to store the boolean expression's value in a __boolean__ type variable 
  - __ex.__ 
  - if __isPerfectScore__ is a boolean variable, then the following statement compares __quizScore__ to 10 and stores __true__ or __false__ in __isPerfectScore__: 
```
isPerfectScore = (quizScore == 10);

if (isPerfectScore)
{
    System.out.println("The score is perfect");
}
```

### the if..else statement 
- __if...else__ statement provides mechanism to perform one action when a boolean expression evaluates as __true__ and a different action when a boolean expression evaluates to __false__ 
- used for __dual-alternative selection__ 
  - __ex.__ would use an if...else statement if we wanted to display one message when value of __quizScore__ == 10, & different message when != 
- illegal to code an __else__ without an if that precedes it 
- when an if...else statement is executed, only one of the resulting actions takes place depending on the evaluation of the Boolean expression

```
if (quizScore == 10)
    System.out.println("The score is perfect");
else 
    System.out.println("It's not perfect");
```

## 5.3 using multiple statements in if and if...else clauses  
- often, wish to take more than one action following the evaluation of a boolean expression within an if statement 
- __ex.__ might wish to display several lines of output or perform several math calcs. 
  - to execute more than one statement that depends on the evaluation of a boolean expression, use pair of {} to place dependent statements within a block 
  ```
  if (hoursWorked > FULL_WEEK)
    {
        regularPay = FULL_WEEK * rate;
        overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
    }
  ```
  - indentation __does not__ cause statements following an __if__ statement to be dependent 
    - rather, curly braces {} required if multiple statements must be treated as a block 
    - correct blocking is crucial to achieving valid output 
    - __Recall:__ blocking statements causes any variable declared within the block to be local to that block 
  - when failing to block statements that should depend on an __if__, and an __else__ clause is used, the program won't compile 
  - __ex.__ Payroll class (containing an if and else clause with blocks)  


## 5.4 nesting if and if..else statements 
- within an __if__ or an __else__ clause, can code as many dependent statements as needed, including other __if__ and __else__ statements 
- __nested if statements:__ statements in which a decision is contained inside either the __if__ or __else__ clause of another decision 
  - particularly useful when two or more conditions must be met before some action is taken
- __ex.__ 
  - suppose we wish to pay a $50 bonus to a salesperson only if the salesperson sells at least three items with a total value >= $1000 
```
final int MIN_ITEMS = 3;
final int MIN_VALUE = 1000;
final int SALES_BONUS = 50;
int bonus = 0;

if (itemsSold >= MIN_ITEMS)
    if (totalValue >= MIN_VALUE)
        bonus = SALES_BONUS;
```
- when one __if__ statement follows another, the first __else__ clause encountered is paired with the most recent __if__ encountered 
- __else__ statements are always associated with their __ifs__ on a __first-in-last-out__ basis, regardless of how many levels of __if...else__ statements are needed to produce a solution 
- indentation of the lines of code helps to show which __else__ statement is paired with which __if__ statement 
  - consistent indentation helps readers understand logic  
  ```
  final int MIN_ITEMS = 3;
  final int MIN_VALUE = 1000;
  final int LARGE_BONUS = 50;
  final int MEDIUM_BONUS = 25;
  final int SMALL_BONUS = 10;
  
  int bonus = 0;
  
  if (itemsSold >= MIN_ITEMS)
    if (totalValue >= MIN_VALUE)
        bonus = LARGE_BONUS;
    else 
        bonus = MEDIUM_BONUS;
  else 
    bonus = SMALL_BONUS;
  ```

- summary: 
  - statements in which an __if__ statement is contained inside another __if__ statement commonly are called __nested__ if statements 
  - when one __if__ statement follows another, the first __else__ clause encountered is paired with the most recent __if__ encountered 
  - a complete nested __if...else__ statement always fits entirely within either the __if__ portion or the __else__ portion of its outer __if...else__ statement 
  

## 5.5 using logical AND and OR operators 
- can combine boolean tests into a single expression using the logical __AND__ and __OR__ operators 
- aka __compound boolean expression__ or a __compound condition__ 

### The AND Operator 
- can be used as an alt. to some nested __if__ statements __&&__ between two boolean expressions 
  - creates a compound boolean expression that is __true__ when both of its operands are true  
- achieves same result as nested-if's, often makes code more concise, less error-prone & easier to understand 
- following two statements work in the same way   
- __note:__ when using the __&&__ op, must include a complete boolean expression on each side 
  - is a binary operator which requires an operand on each side
``` 
if (itemsSold > MIN_ITEMS)
    if (totalValue >= MIN_VALUE) 
        bonus = SALES_BONUS;
``` 

```
if (itemsSold > MIN_ITEMS && totalValue >= MIN_VALUE)
    bonus = SALES_BONUS:
```

- __ex.__ set bonus -> $400 when a __saleAmount__ is both > $1000 and < $5000
```
if (saleAmount > 1000 && saleAmount < 5000)
    bonus = 400;
``` 
- for clarity, many devs prefer to surround each boolean expression that is part of a compound boolean expression with its own set of parentheses: 
```
if ((saleAmount > 1000) && (saleAmount < 5000)) 
    bonus = 400;  
```

### the OR operator 
- useful when wanting to trigger some action if only 1/2 conditions == __true__ 
- can use nested if's, or use __logical OR operator__ __||__  
- often makes code more concise, less error-prone & easier to understand 
- used to create compound boolean expression that is true when at least one of its operands is true
- 
- __ex.__ if we wish to give discount to any customer who satisfied >= 1/2 conditions 
  - buying a min. # items 
  - buying any # of items that total a min. $ value 
```
// using nested ifs 
if (itemsBought >= MIN_ITEMS)
    discountRate = DISCOUNT;
else 
    if (itemsValue >= MIN_VALUE)
        discountRate = DISCOUNT;
        
// using logical OR operator         
if (itemsBought >= MIN_ITEMS || itemsValue >= MIN_VALUE) 
    discountRate = DISCOUNT;
```

### short-circuit evaluation 
- feature in which the expressions on each side of the __&&__ and __||__ operators are evaluated only as far as necessary to determine whether the entire expression is __true__ or false__ 
- with the __&&__ operator, booth boolean expression operands must be true before the action in the result statement can occur 
  - if first tested operand is false, second never tested because its value does not matter 
- with the __||__ operator, because only one of the boolean expressions must be true to cause the dependent statements to execute, if the expression on the left of the __||__ is true, no need to evaluate the right 

- __ex.__
  - suppose we've two methods that return booleans, & we use calls to those methods in an if statement: 
```
if (method1() && method2())
    System.out.println("OK");
```
- depending on actions performed within the methods, if __method1()__ is __false__, then __method2()__ won't execute 
  - if __method2()__ contains statements that we wish to execute no matter what the value of __method1()__ is: 
    - don't use method2() as part of a compound condition -> execute it on its own: 
```
boolean isMethod2True = method2();

if ( method1() && isMethod2True )
    System.out.println("OK");
``` 
- __side effect:__ anything a method does besides altering local variables or returning a value 
- demo program showing short-circuiting with the && operator 
    - __ShortCircuitTestAnd__ 

## 5.6 making accurate & efficient decisions 
- __range check:__ series of statements that determine to which of several consecutive series of values another values falls

- __ex.__ consider situation in which salespeople can receive 1/3 possible commission rates based on their sales: 
  - 8% commission on a sale >= 1000
  - 6% commission on a 500 <= sale <= 999
  - 5% commission on a sale < 500
```
final double HIGH_LIM = 1000.00;
final double HIGH_RATE = 0.08;
final double MED_LIM = 500.00;
final double MED_RATE = 0.06;
final double LOW_LIM = 499.99;
final double LOW_RATE = 0.05;

// the issue here is when saleAmount >= 1000, its true for HIGH_LIM & MED_LIM
// both cases become true resulting in incorrect commission rate (MED_RATE) being applied 
if ( saleAmount >= HIGH_LIM ) 
    commissionRate = HIGH_RATE;
if ( saleAmount >= MED_LIM )
    commissionRate = MED_RATE;
if ( saleAmount <= LOW_LIM)
    commissionRate = LOW_RATE;
```
- partial solution -> use an __else__ statement following the first evaluation 
  - improved, but inefficient, commission-determining code & its logic 
```
final double HIGH_LIM = 1000.00;
final double HIGH_RATE = 0.08;
final double MED_LIM = 500.00;
final double MED_RATE = 0.06;
final double LOW_LIM = 499.99;
final double LOW_RATE = 0.05;

if ( saleAmount >= HIGH_LIM )
    commissionRate = HIGH_RATE;
else 
    if ( saleAmount >= MED_LIM )
        commissionRate = MED_RATE; 
// this Q is redundant - already answered         
if ( saleAMount <= LOW_LIM) 
    commissionRate = LOW_RATE;
 
```
- if the __saleAmount__ is not at least __HIGH_LIM__ and is also not at least __MED_LIM__, it must by default be less than or equal to __LOW_LIM__ 
```
// improved & efficient commission-determining code & its logic  
// LOW_LIM constant no longer declared since its no longer needed - if saleAmount is not >= MED_LIM, commission rate must receive LOW_RATE 
final double HIGH_LIM = 1000.00;
final double HIGH_RATE = 0.08;
final double MED_LIM = 500.00;
final double MED_RATE = 0.06;
final double LOW_RATE = 0.05

if ( saleAmount >= HIGH_LIM )
    commissionRate = HIGH_RATE;
else 
    if ( saleAmount >= MED_LIM )
        commissionRate = MED_RATE;
    else 
        commissionRate = LOW_RATE;
```

### making efficient range checks 
- within a nested __if..else__, its most efficient to first ask the question that is most likely to be true 
  - i.o.t.w, if its known that most __saleAmount__ values are high, compare __saleAmount__ to __HIGH_LIM__ first 
  - in this way, frequently avoid asking multiple questions 
  - if it is known that most __saleAmount__s are small, should first ask __if(saleAmount < LOW_LIM)__ 

```
// commission determining code & logic that evaluates smallest saleAmount first 
// this sequence of decisions is more efficient when most saleAmount values are small 

final double HIGH_RATE = 0.08;
final double HIGH_LIM = 1000.00;
final double MED_RATE = 0.06;
final double LOW_LIM = 500.00;
final double LOW_RATE = 0.05;

if ( saleAmount < LOW_LIM )
    commissionRate = LOW_RATE;
else 
    if ( saleAmount < MED_LIM)
        commissionRate = MED_RATE;
```

### using && and || appropriately 
- "Display an error message when an employee's hourly pay rate is less than $17.85 and greater than $60" 
```
if ( department == 1 && department == 2 ) 
    System.out.println("Name is: " + name);
// above is WRONG 
// variable department can never contain both 1 & 2 at same time - no employee name will ever be output 

// correct statement - chooses employees whose department is 1 OR 2: 
if ( department == 1 || department == 2) 
    System.out.println("Name is: " + name);
```
- __note:__ single __|__ or __&__ operate on individual bits 



## 5.7 using Switch 
- by nesting series of if and else statements, can choose from any number of alts. 
- __ex.__ suppose we wish to display student's class year based on a stored number 
```
if (year == 1)
    System.out.println("Freshman");
else
    if (year == 2)
        System.out.println("Sophomore");
    else 
        if (year == 3)
            System.out.println("Junior");
        else
            if (year == 4)
                System.out.println("Senior");
            else 
                System.out.println("invalid year");
```
- an alternative to using a series of nested if statements is to use the __switch__ statement 
- __switch__ statement useful when you need to test a single variable against a series of exact integer (int, byte, short), character or string values 
- uses 4 key words: 
  - __switch__ starts the statement and is followed immediately by a test expression enclosed in parentheses  
  - __case__ followed by one of the possible values for the test expression and a colon
  - __break__ optionally terminates a switch statement at the end of each case 
  - __default__ optionally is used prior to any action that should occur if the test variable does not match any case 

- __ex.__ determining class status using a switch statement  

```
// begins by evaluating the year var in first line 
// if year == 3 --> case 3 executes 
// break statement bypasses rest of switch statement 
// if year var contains none of cases, default executes 
switch(year)
{
    case 1:
        System.out.println("Freshman");
        break;
    case 2: 
        System.out.println("Sophomore");
        break;
    case 3: 
        System.out.println("Junior");
        break;
    case 4: 
        System.out.println("Senior");
        break
    default 
        System.out.println("Invalid year");
}
```
- not required to list case values in ascending order, as in ex. above 
  - helps with readability 
- can leave out __break__ statements in a switch, however if done, and program finds a match for the test variable, all the statements within the switch 
from that point on execute 
- should only intentionally omit __break__ statements if you wish for all subsequent cases to execute after the test variable is matched 

```
switch(day)
{
    case "Monday":
        System.out.println("Reserve room for friday meeting");
    case "Tuesday":
        System.out.println("Prepare powerpoint slides"); 
    case "Wednesday":
        System.out.println("Send out meeting reminders"); 
    case "Thursday":
        System.out.println("Order snacks for deliver"); 
    case "Friday":
        System.out.println("Meeting 10 am"); 
    default: 
        System.out.println("Invalid day"); 
    
}
```
- don't need to write code for __each__ case in a switch statement 
- __ex.__
  - suppose the supervisor for dep. 1, 2, 3 is _Jones_, but other deps. have different supervisors 
  - in this case: 
```
// using empty case statements so the same result occurs in multiple places  

int deparment;
String supervisor;

// statements to get department go here
switch(department)
{
    case 1:
    case 2: 
    case 3: 
        supervisor = "Jones";
        break;
    case 4:
        supervisor = "Staples";
        break;
    case 5: 
        supervisor = "Tejano";
        break;
    default: 
        System.out.println("Invalid department code");
}
```

- method that uses a __switch__ statement with string values 
```
public static boolean isValidSupervisor(String name) 
{
    boolean isValid;
    switch(name) 
    {
        case "Jones":
        case "Staples":
        case "Tejano":
            isValid = true;
            break;
        default:
            isValid = false;
    }
    return isValid;
}
```
- when several __char__ variables must be checked & we wish to ignore whether they're uppercase or lowercase, one frequently used technique employs case statements
```
// using a switch statement to ignore character case 

switch(deparmentCode)
{
    case 'a':
    case 'A':
        departmentName = "Accounting";
        break;
    case 'm':
    case 'M':
        departmentName = "Marketing";
        break;
}
```

### using the switch expression 

- __switch expression__ -> another option that can be used in >v14 when all cases result in an __assignment__ of the variable 
- the following ex. shows a __switch__ expression used to compare the __char__ variable _departmentCode_ to different values 

```
switch(departmentCode)
{
    case 'a', 'A' -> departmentName = "Accounting";
    case 'm', 'M' -> departmentName = "Marketing";
}
```
- differences with the above option: 
  - keyword _case_ isn't repeated for each ase in a category; instead, multiple case labels are separated by commas 
  - assignment operator isn't used to assign a value to __departmentName__, instead the _arrow operator_ __->__  is used  
  - in the switch expression, each case does not have to end with the keyword _break_ 
    - makes structure shorter 
    - no forgetting to include a break 

- switch expressions can also be used within an output statement, as shown: 
```
System.out.println(switch(departmentCode)
{
    case 'A', 'a' -> "Accounting";
    case 'M', 'm' -> "Marketing";
    default -> "Invalid department";
}); // closing brace ends the switch, closing parenthesis & semicolon end println() call 
```

- the result of a switch statement case can also be a block as shown:
  - suppose that when the code is 'm' or 'M', we wish to display some text as well as assigning "Marketing" to the departmentName string 
  - i.t.c., can use the keyword __yield__ to return a value 
```
departmentName = switch(departmentCode)
{
    case 'a', 'A' -> "Accounting"; 
    case 'm', 'M' -> 
    {
        System.out.println("Note that the marketing department"); 
        System.out.println("is closed on Fridays");
        yield "Marketing";
    }
    default       -> "Invalid";
};
```

- never required to use a __switch__ statement or a __switch__ expression; can always achieve same results with nested __if__ statements 
  - using switch is simply convenient when several alt. courses of action depend on a value 
  - most devs choose an __if__ statement if there were only 2–3 options and use a __switch__ statement for more
  - in addition, makes more sense to use __switch__ only when a reasonable number of specific matching values needs to be tested
    - ex. if every integer value from 1 - 100 results in same action, a single __if__ is far easier to write than a switch 


## 5.8 using the conditional and NOT operators 

- besides using if & switch statements, java also provides __conditional operator__ 
  - requires 3 expressions separated with a question mark & a colon 
  - used as an abbreviated version of if..else statement 
  - as with the switch statement, never _required_ to use conditional operator, simply a convenient shortcut 

- syntax: 

``` testExpression ? trueResult : falseResult;```

- the first expression, __testExpression__ is a boolean that is evaluated as true or false 
  - if true, entire conditional expression takes on the value of the expression following the question mark (trueResult) 
  - if false, entire expression takes on value of __falseResult__ 
- while __==__ and __&&__ are binary operators, the conditional operator is a __ternary operator__ -- one that needs three operands 
- __ex.__ 
  - wish to assign smaller of two values, a & b, to a variable named __smallerNum__ 
  - the expression that can be used is: 
```
smallerNum = (a < b) ? a : b;
```
- when evaluating the expression (a < b), if a is less than b, the entire conditional expression takes the value to the left of the colon, a, which is then assigned to __smallerNum__ 
- if a is _not_ less than b, then the expression assumes the value to the right of the colon, and b is assigned to __smallerNum__ 
- the same result could be achieved with the following if..else statement: 

```
if(a < b)
    smallerNum = a;
else 
    smallerNum = b;
```

### using the NOT operator 
- used to negate the result of any boolean expression 
- any expression that revalues to true → false when preceded by NOT operator 
- any expression that evaluates to false → true when preceded by NOT operator  
- using the NOT operator is clearer hwen the value of a boolean variable is tested 
- __ex.__ 
  - suppose monthly car insurance premium = $200 if age <= 25 
    - $125 when age >= 26
  - four if..else statments that all do the same thing 
```
if(age <= 25) 
    premium = 200;
else 
    premium = 125;
    
if(!(age <=25))
    premium = 125;
else 
    premium = 200;
    
if(age >= 26)
    premium = 125;
else 
    premium = 200;
    
if(!(age >= 26))
    premium = 200;
else 
    premium = 125; 
```


## 5.9 understanding operator precedence 
- can combine as many __&&__ or __||__ operators in an expression as needed to make a decision
  - __ex.__ 
    - if we wish to award bonus points to any student who receives a perfect score on nay of four quizzes, might wright a statement such as the following: 
```
if(score1 == PERFECT || score2 == PERFECT || 
   score3 == PERFECT || score4 == PERFECT) 
   bonus = BONUS;
else 
    bonus = 0;
```
- in this case, if at least __one__ of the score variables is equal to the PERFECT constance, the student receives the bonus points 
- although you can combine any number of && or || operators in an expression, special care must be taken when mixed 
- arithmetic ops have higher and lower precedences, and an operator's precedence makes a difference in how an expression is evaluated 
  - ex. 
    - with an arithmetic expression, multiplication and division are always performed prior to addition or subtraction 
    - in same way, __&&__ has higher precedence than __||__ 

| precedence | operators                         | symbols(s) |
|------------|-----------------------------------|------------|
| Highest(9) | Logical NOT                       | !          |
| 8          | Multiplication, division, modulus | * / %      |
| 7          | Addition, subtraction             | + -        |
| 6          | relation                          | > < >= <=  |
| 5          | equality                          | == !=      |
| 4          | logical AND                       | &&         |
| 3          | logical OR                        | \|\|       |
| 2          | Conditional                       | ?:         |
| 1          | Assignment                        | =          |


```
// assigns extra premiums correctly 
if((trafficTrickets > 2 || age < 25) && carCode == 'S')
    extraPremium = 200;
    
// assigns extra premiums incorrectly 
if(trafficTrickets > 2 || age < 25) && carCode == 'S')
    extraPremium = 200;
```
- one way to remember the precedence of the AND and OR operators is to remember that they are evaluated in alphabetical order 
- the following two conventions are important to keep in mind: 
  - order in which operators are used makes a difference
  - can always use parentheses to change precedence or make intentions clearer 

## 5.10 making constructors more efficient by using decisions in other methods 
- will frequently want to use what has been learned about decision-making to control the allowed values in objects' fields 
- whether values are assigned to objects by constructors or by mutator methods, will often need to use decisions to restrict the values assigned to fields 
- __ex.__ 
  - suppose __Employee__ class has been created (below)
``` 
// Employee class that contains a constructor that makes decisions 

public class Employee 
{
    private int empNum;
    private double payRate;
    public final int MAX_EMP_NUM = 9999;
    public final double MAX_RATE = 60.00;
    public Employee(int num, double rate)
    {
        if(num <= MAX_EMP_NUM)
            empNum = num;
        else 
            empNum = MAX_EMP_NUM;
        if(payRate <= MAX_RATE)
           payRate = rate;
        else 
            payRate = 0;
    }
}
```
- the class contains two fields that hold an employee number and pay rate 
- the constructor accepts values for these default fields as parameters, but instead of simply assigning the parameters to the fields, the code determines whether each value is within the allowed limits for the field 
- if the Employee class also contained set methods for __empNum__ and __payRate__ and the rules governing appropriate values were the same as the rules used in the constructor,
then it'd make sense for the decisions to be made in the set methods and to code the constructor to call the set methods  
  - in this manner, the decisions would appear only once in the class, saving time and space 
  - if the rules needed to be changed later on, code would be changed just in once place
  
- the following example shows a class that uses the aforementioned technique of a constructor that calls set methods to make decisions: 
```
public class Employee
{
    privatre int empNum;
    private double payRate;
    public final int MAX_EMP_NUM = 9999;
    public final double MAX_RATE = 60.00;
    public Employee(int num, double rate)
    {
        setEmpNum(num); // the constructor calls the set methods instead of repeating 
        setPayRate(rate); // the if statements to enforce the rules for the field values 
    }
    public boid setEmpNum(int num)
    {
        if(num <= MAX_EMP_NUM)
            empNum = num;
        else 
            empNum = MAX_EMP_NUM;
    }
    public void setPayRate(double rate)
    {
        if(payRate <= MAX_RATE)
           payRate = rate;
        else 
            payRate = 0;
    }
    }
}
```






