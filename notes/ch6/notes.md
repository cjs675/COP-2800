# ch. 6 Looping 

## 6.1 learning about the loop structure 
- a loop is a structure that allows repeated execution of block statements 
- within a looping structure: 
  - a boolean expression is evaluated 
  - if it is __true__, a block of statements called the __loop body__ executes and the boolean expression is evaluated again.
    - The loop body can be a single statement or a block of statements between { }
    - as long as the loop controlling boolean expression is true, the statements in the loop body continue to execute, 
    - and the boolean expression is evaluated again 
  - when the boolean evaluation is false, the loop ends 
- one execution of any loop is called an __iteration__   
![img_1.png](img_1.png)
- several mechanisms to create loops in java 
  - 3 main types: 
    1. while loop
        - loop controlling boolean expression is the first statement in the loop, evaluated before the loop body executes 
    2. for loop
        - usually used as a concise format in which to execute loops 
    3. do..while loop
        - loop controlling boolean expression is the last statement in the loop, evaluated after the loop body executes one time

## 6.2 creating while loops 
- can use a __while__ loop to execute a body of statements continually as long as the boolean expression that controls entry into the loop continues to be true 
- a while loop consists of the keyword __while__ followed by a boolean expression in parentheses, followed by the body of the loop 
- can use a while loop when we need to perform a task either a __predetermined__ or __unpredictable__ number of times 
  - sometimes a programmer knows precisely how many times a loop should execute 
    - a loop that executes a specific number of times is a __definite loop__ or a __counted loop__ 
  - sometimes a programmer does not know how many times a loop will execute because the number of iterations is determined while the program is running 
    - such a loop is an __indefinite loop__ 

### writing a Definite while loop 
- to write a definite while loop, you initialize a __loop control variable__ 
  - variable whose value determines whether loop execution continues 
- while the boolean value that results from comparing the loop control variable & another is __true__, the body of the while loop continues to execute 
- in the body of the loop, must include a statement that alters the loop control variable; otherwise, the loop will never end 
- a loop that never ends is called an __infinite loop__  
- __ex.__ (definiteWhileLooping)

### preventing while loop from executing infinitely 
- a loop control variable is initialized to a starting value 
- the loop control variable is tested in the while statement 
- the loop control variable is altered within the body of the loop 
  - the variable must be altered so that the test expression eventually can evaluate to __false__ and the loop can end 
- see __ex.__ (preventingInfiniteWhileLoops)

### pitfall: unintentionally creating a loop with an empty body 
- placement of the statement-ending semicolon is important when you work with the __while__ statement 
- if a semicolon is mistakenly placed at the end of the partial statement, the loop is also infinite 
- an __empty body__, or a body with no statements in it, can lead to no action being taken by the loop 
  - note -> indentation has no effect 
  - the {} delineate what is/what is not within the scope of the loop 
  - adding a semicolon to the loop causes it to have an __empty body__ 
    - __ex.__ ``` while (loopCount < 3);```
  

### Altering a definite loop's control variable 
- a definite loop is a __counter-controlled loop__ because the loop control variable is changed by counting 
- very common to alter the value of a loop control by adding 1 to it, or __incrementing__ the variable 
- however, not all loops are controlled by adding 1
- __ex.__ (decrementingWhileLoop) 
  - loop is controlled by subtracting 1 from a loop control variable, or __decrementing__ it 
- many ways to execute a loop two times 
  - in general, shouldn't use unusual ways to count repetitions because they make the program confusing 
- to execute a loop a __specific number of times__, the clearest & best method is to start the loop control variable at 0 or 1, increment by 1 each time through the loop and stop when the loop control variable reaches the appropriate limit 

### writing an indefinite while loop 
- often, the value of a loop control variable is not altered by adding to it or subtracting from it, but instead it is altered by some other event 
- such a loop is an __event controlled loop__ 
  - type of indefinite loop since we don't know how many times it'll eventually repeat during each execution of the program 
    - __ex.__ perhaps we wish to continue asking a user questions as long as the response is correct, but want to stop when a response is incorrect 
      - in this case, aren't sure if loop will execute two or two-hundred times 
- __ex.__ (BankBalance) 
- many indefinite loops are written to continue as long as an ending value is not entered 
  - a value that stops a loop is called a __sentinel__ 

### validating data 
- programmers commonly use indefinite loops when validating input data 
- __validating data__ is the process of ensuring that a value falls within a specified range 
- for example, suppose we require the user to enter a value that is no greater than 3 
- __ex.__ (EnterSmallValue) shows an application that does not progress past the data entry loop until the user enters a correct value 
  - excellent method for validating input 
  - before the loop is entered, the first input value is retrieved 
  - this input might be a value that prevents any executions of the loop 
- the first input statement prior to the loop is called a __priming input__ 

### novice mistake validating data 
- checking for invalid data by using a decision instead of a loop 
- i.e, asking whether the data is invalid by using an __if__ statement; if the data is invalid, they reprompt the user 
- since a user might enter incorrect data multiple times, a __loop__ is the best structure to use when validating input data  

- __ex.__ (CustomerSurvey)
  - writing a loop to validate data entries 


## 6.3 using shortcut arithmetic operators 
- __counting__ 
  - term used to refer to act of incrementing a variable in a loop to keep track of number of occurences of some event 
- __accumulating__
  - process of repeatedly increasing a value by some amount 
- because increasing/decreasing variables is so common, many modern langs provide several shortcuts for incrementing & accumulating 
```
count += 1  is same as  count = count + 1
balance += balance * INT_RATE;  is same as balance = balance * INT_RATE + balance  
```
- __add and assign operator__ (+=)
- __subtract and assign operator__ (-=)
- __multiply and assign operator__ (*=)
- __divide and assign operator__ (/=)
  - each of these operators is used to perform the operation and assign the result in one step 
  - __ex.__ ``balanceDue -= payment`` subtracts payment from balanceDue and assigns the result to balanceDue  

- when we wish to increase a variable's value by __exactly 1__, can use two other shortcut operators: 
  - __prefix increment operator__  
    - ``++someValue;``
    - increments the variable by 1
    - returns the new value after incrementing 
    - used when the updated value is needed immediately 
  - __postfix increment operator__ 
    - ``somevalue++;``
    - increments variable by 1
    - returns the original value before incrementing 
    - used when og value isn't needed before incrementing 
- never _required_ to use shortcut operators -> merely a convenience 
- cannot use prefix ++ and postfix ++ operators on constants 
  - however, can create a variable, assign it to a constant, and increment the variable using a prefix operator  
- 