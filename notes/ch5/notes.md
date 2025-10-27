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
- equal sign (==) used to determine quality 
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


