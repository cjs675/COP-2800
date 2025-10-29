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
- 

















