 # ch2 Using data 

## 2.1 declaring & using constants and variables 

- __constant:__ data item whose value can't be changed while program is running 
  - ex. ```System.out.println(459);```
    - number 459 is a constant 
  - such values also referred to as: 
    - __literal constant__ b/c value taken literally at each use 
    - __numeric constant__ as opposed to character or string constant 
    - __unnamed constant__ as opposed to named one, b/c no identifier associated with it 
- instead of using constant data, can set upt a data item to be variable 
- __variable:__ named memory location that can store a value 
  - can hold only one value at a time 
  - value held can change 
- whether data item = __constant__ or __fixed__ → in java always has a __data type__ 
- __data type__ describes following:  
  - type of data that can be stored 
  - quantity of memory occupied 
  - types of ops that can be performed on data 

- java provides __8 primitive data types:__ 
  - __primitive type:__ simple data type 
    - ie. simple & uncomplicated 
    - serve as building blocks for more complex types (__reference types__)
      - hold memory addresses 
    - classes created from which objects are instantiated → __reference types__  
      - ex. __System__ class 
        - __Scanner__ class 


| Keyword |           Description           |
|:-------:|:-------------------------------:|
|  byte   |       Byte-length integer       |
|  short  |          Short integer          |
|   int   |             Integer             |
|  long   |          Long integer           |
|  float  | Single-precision floating point |
| double  | Double-precision floating point |
|  char   |        Single character         |
| boolean |  Boolean value (true or false)  | 


### declaring variables 
- __variable declaration:__ statement that reserves named memory location & includes following: 
  - data type that id's type of data variable will store 
  - id that is var's name 
  - optional assignment operator & assigned value, if initialized value is desired 
  - ending semicolon 
- names must be legal java identifiers 
    - must start with letter 
    - cannot contain spaces 
    - cannot be reserved keyword 
- must declare var before using it 
- can be dlecared at any point before being used 
  - __common practice__ 
    - declare var first in a method & place executable statements after declarations 
- java is a __strongly typed language__ 
  - each var has well defined data type that limits ops that can be performed with it 
- conventionally begin with __lowercaseLetters__ to distinguish them from class names 
  - just like class names, unconventional use doesn't deter successful compile
- __camelCasing__ followed for variables 

```java 
int establishDate = 1924;

boolean hasAccount = false;
```

- equal sign __=__ is the __assignment operator__ 
  - any value to the right of the assignment operator is assigned to the memory location named on the left  
- __initialization:__ assignment made when variable is declared 
- __assignment:__ assignment of a variable made after initialization 

```java
boolean hasAccount = false;

hasAccount = true;
```

- vars declared once in a method 
  - might assign new values to them any number of times 
- expressions with a literal __to the left of the assignment operator are illegal__ 
  - ex. ```25 = myAge;``` 

- assignment operator has __right-to-left__ associativity 
- __associativity:__ refers to order in which values used with oeprators 
  - associativity of eveyr operator is either __right-to-left__ or __left-to-right__ 
  - __lvalue:__ identifier that can appear on __left side__ of an assignment operator 
  - __rvalue:__ identifier that can appear on __right side__ of an assignment operator 
- a variable can be used as an __lvalue__ or __rvalue__ but a literal constant can __only__ be an __rvalue__ 

- __uninitialization:__ occurs when variable without any assigned value is declared within a method 
```ìnt myAge; ```
    - uninitialized variables contain an unknown value caled a __garbage value__ 
      - java protets one from inadvertently using garbage vals that are stored in an uninitialized variable 

- variables declared in a class, outside of any method are automatically initialized  
- multiple variables of the __same type__ can be declared in seperate statements 
- can also declare +2 variables of same type in __single__ statement, by seperating declarations with comma:
```java
int height = 70, weight = 190; 
```
- __recall:__ even if statement occupies multiple lines, isn't complete until semicolon reached 
- can declare as many vars in statement, __as long as__ vars are of same data type 
- declaration of variables of different types requires doing so using separate statements for each type

### declaring named constants 

- var: named memory location for which contents can change 
- if named location's value shouldn't change during execution of a program, it can be created to be a __named constant__ 
- __named constant:__ 
  - aka __Symbolic Constant__ 
  - similar to var, has data type, name & value 
  - differs in several ways: 
    - in declaration statement, data type of named constant preceded by keyword __final__ 
    - can be assigned a value only once, cannot be changed later on in program 
    - usually, initialize a named constant when you declare it; leaving it uninitialized creates a __blank final__ 
      - can assign value to it later 
    - __must__ assign value to a constant __before__ it can be used 

```java
//        conventionally named constants  
final int NUMBER_OF_DEPTS = 20;
final double PI = 3.14159;
final double TAX_RATE = 0.015;
final String COMPANY = "Verizon Wireless";
``` 

- each of such named constants can be used anywhere a variable of the same type is used, except on left side of an assignment statement after first value has been assigned 
  - iotw, when it receives a value, a named constant is an __lvalue__, but after the assignment, a named constant is an __rvalue__ 
- constants always have the same value within a program 
- reasons to use constants over literal values: 
  - number 20 more easily recognized as # of dep's if its associated with an identifier  
    - ie. __NUMBER_OF_DEPTS = 20;__
  - makes programs easier to read & understand 
  - avoiding __magic numbers__ (value that doesn't have immediate, intuitive meaning, can't be explained without add. knowledge) helps provide internal docs for programs 
  - if # of dep's in org changes, would then change value of __NUMBER_OF_DEPTS__ at one location within program (where its defined)
  - reduces typographical errors 
    - ex. if 20 must be included at several places within program, might inadvertently type 10 or 200 for one of the instances, compiler will not recognize mistake 
      - using named constant like identifier __NUMBER_OF_DEPTS__,  compiler will ensure you spell it correctly 
  - when a named constant is used in an expression, it stands out as different from a variable 
  - ex. in following arithmetic statement, easy to see which elements are variables & which are __constant__ b/c constants have been named 
    ```double payAmount = hoursWorked * STD_PAY_RATE - numDependents * DEDUCTION;```

### scope of variables & constants 

- data item's __scope__ is area in which it's visible to a program & in which you can refer to it using its simple identifier 
- variable or constant is in __scope__ from the point it's declared until the end of the block of code in which the declaration lies 
- __block of code:__ code contained between set of curly braces 
- ex. if a variable or constant is declared within a method, it can be used from its declaration until the end of the method unless the method contains multiple sets of curly braces 
  - then, a data item is usable __only__ until the end of the block that holds the declaration 

### concatenating strings to variables & constants 

- can use a __print(), println()__ statement to create console output 
  - __println()__ starts on new line after output 
- can display varibale or constant in a __print()_ or __println()__ statement alone or in combo with a string 
- ex. __NumebrsPrintln__ class declares an integer __billingDate__, which is initialized to 5: 

```java 
public class NumbersPrintln{ 
    public static void main(String[] args){
        int billingDate = 5;
        System.out.print("Bills are sent on day ");
        System.out.print(billingDate);
        System.out.println(" of the month");
        System.out.println("Next bill: October " +
            billingDate);
    }
}
``` 


- while placing __+__ sign between two numeric values indicates an __addition__ operation, doing so between two strings results in __string concatenation__ 
- __recall:__ 
  - polymorphism describes feature of languages that allows same word/symbol to be interpreted correctly in different situations based on context 
  - __+__ is polymorphic in that it indicates concatenation when used with strings but addition when used with numbers 
- when concatenating __Strings__ with numbers, the entire expression is a __String__ 
  - ie. the expression ```"A" + 3 + 4``` results in the __String__ ```"A34``` 
  - if intention is to say, create string ```"A34"```, could add parentheses to write ```"A" + (3 + 4)```  so numeric expression evaluated first 

- the following shows the __NumbersDialog class__ which uses the __showMessageDialog()__ method twice to display an integer declared as __creditDays__ and initialized to 30
  - in each method call, the numeric variable is concatenated to a __String,__ making the entire second argument a __String__ 
  - in the first call to __showMessageDialog()__, the concatenated __String__ is an empty __String__ that is created by typing a set of quotes with nothing in them
  - the first dialog box shows just the value 30, after it is closed out by clicking OK, the second dialog box appears 

```java

import javax.swing.JOptionPane;

public class NumbersDialog{
    public static void main(String[] args){
        int creditDays = 30;
        JOptionPane.showMessageDialog(null, "" + creditDays);
        JOptionPane.showMessageDialog
                (null, "Every bill is due in " + creditDays + " days");
    }
}
```


### pitfall: forgetting that a variable holds one value at a time 

- each variable can hold just one value at a time 
- suppose we have two vars: __x & y__ 
  - x = 2
  - y = 10
  - suppose we wish to switch their values → x = y & y = x 
  - can't simply reassign x = y, then both variables will hold 10, 2 will be lost 
    - if you make assignment y = x, then both variables will hold 2, 10 will be lost 
  - __solution:__ declare 3rd variable: 

```java 
int x = 2, y = 10, z;
z = x;
x = y;
y = z;
```
- in this example, the third variable __z__ is used as a temporary holding spot for one of og values
  - variable __z__ is assigned value of __x,__ so __z__ becomes 2
  - then, value of __y__, 10, is assigned to __x__
  - finally, the 2 held in __z__ is assigned to __y__
  - the extra variable __(z)__ is used because as soon as you assign a value to a variable, any value that was previously
in the memory location is now gone


## 2.2 learning about integer data types 

- in java, can use variables of data types:
  - byte 
  - short
  - int
  - long
to store or hold integers 
- __integer:__ whole number w/o decimal places 
  - __int__ most commonly used integer type 
  - can use underscores in numbers - typically used to make long numbers easier to read 
```corporateBudget = 8_435_000;```

- data types __byte, short, long__ all variations of __int__ type 
- __byte__ and __short__ types occupy less memory & can hold smaller values 
- __long__ type occupies more memory & can hold larger values 
- important to choose __appropriate__ types for variables used in an application: 
  - if you attempt to assign a value that's too large for the data type of the variable, compielr issues an error message, app doesn't execute 
  - choose data-type larger than required, waste memory

| type  | min val                    | max val                    | size (in bytes) |
|-------|----------------------------|----------------------------|-----------------|
| byte  | -128                       | 127                        | 1               |
| short | -32,768                    | 32,767                     | 2               |
| int   | -2,147,483,648             | 2,147,483,647              | 4               |
| long  | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,808  | 8               |



- Ex. a personnel application might use a __byte__ varibale for number of dependents (limit = 127)
  - __short__ for hours worked in a month (because max 127 isnt enough)
  - __int__ for annunal salary (max 32,767 too small for upper roles)

- if an application uses a literal constant integer, such as __932__ the number is an __int__ by default 
  - if constant > __int__ needed, __must__ follow number with letter __L__ to indicate __long__ 
  - ex. ```long mosquitosInTheNorthWoods = 2444555888L```
- no need for special notation to store numeric constant in __int, byte or short__ 


## 2.3 using the __boolean__ data type 

- boolean logic based on true-false comparisons 
- can only hold 1 of 2 values

```java
boolean isItPayday = true;
boolean areYouBroke = false;
```

- are allowed to use any legal identifier for boolean variables, however are more easily identifiable when used in _to be_ form 
  - such as _is_ or _are_ 
  - __isItPayDay__ 
  - __userIsActive__
  - __accountExists__ 
- besides assigning __true__ and __false__, can also assign value to a boolean variable based on comparison 
- java supports __six__ relational operators that are used to make comparisons 
- __relational operator:__ compares two items (aka comparison operator)
  - value of an expression that contains a relational operator is always __true or false__ 

| operator | description              | ex         |
|----------|--------------------------|------------|
| <        | less than                | 2 < 5      |
| >        | greater than             | 5 > 1      |
| ==       | equal to                 | 7 == 7     |
| <=       | less than or equal to    | 5 <=       |
| >=       | greater than or equal to | 10 >= 9    |
| !=       | not equal to             | 100 != 101 |


- cannot place any whitespace between two symbols 
- cannot reverse order of symbols 

```java
// examples of legal declarations 

boolean isSixBigger = (6 > 5);
// value stored would be true 
boolean isSevenSmallerOrEqual = ( 7 <= 4);
/* bool expressions more meaningful when var is used for one or both of operands in a comparison
        in the following examples, a variable is compared to a literal constant (40),
        a variable is compared to a named constant (HIGH_CUTOFF), 
        and two variables are compared
*/
boolean isOvertimePay = (hours > 40);
boolean isTaxBracketHigh = (income > HIGH_CUTOFF);
boolean isFirstScoreHigher = (score1 > score2);
```


## 2.4 floating point data types 

- floating-point number contains decimal positions 
  - can be imprecise 
- java supports two float types: 
  - __float__ 
    - can hold floating point values of up to six or seven sigfigs 
  - __double__
    - requires more memory
    - can hold 14-15 sigfigs of accuracy 
- __significant digits__ 
  - refers to mathematical accuracy of a value 

- a value stored in a __double__ is a __double-precision floating point number__ 
- a value stored in a __float__ is a __single-precision floating point number__ 

- limits on floating-point values

| type   | min           | max          | size in bytes |
|--------|---------------|--------------|---------------|
| float  | -3.4 * 10^38  | 3.4 * 10^38  | 4             |
| double | -1.7 * 10^308 | 1.7 * 10^208 | 8             |

- just as an integer constant, such as 18, is a value of type __int__ by default, a floating-point constant, such as 18.23 is a __double__ by default 
- to indicate that a floating-point numeric constant is a __float__ -> can type letter __F__ after the number: 
```float pocketChange = 4.87F```
- can type __D__ (or d) after a floating-point constant to indicate it is a double, even without the __D__ value will be stored as __double__ by default 


## 2.5 using the __char__ data type

- used to hold any single character 
- place constant character values within a single quotation __' '__ because computer stores characters & integers differently 
- following are typical character declarations: 
```java 
char middleInitial = 'J';
char gradeInCOP2800 = 'A';
char aStar = '*';
```

- __char__ can be any letter - upper or lowercase
  - can also be punctuation mark or digit 
- __char__ that is a digit is represented in computer memory differently from a numeric value represented by the same digit 
- the following two statements are legal

```java
char aCharValue = '9';
int aNumValue = 9;
```
- displaying both statements using a __println()__ statement is possible, and you will see 9 as output
  - however, only the __int__ value can be used to represent value 9 in arithmetic statements
- a numeric constant can be stored in a character variable
  - a character that represents a number can be stored in a numeric variable

- ex. following two statements are legal, but unless their meanings are understood, they might produce undesirable outputs; 
```java 
char aCharValue = 9; // returns blank (must be in '')
int aNumValue = '9'; // returns 57 (single quotes taken as unicode
```

- a variable of type __char__ can hold only one character 
- to store a string of characters, such as a name, must use data structure called __String__ 
  - __String__
    - built-in class that provides means of storing & manipulating character strings 
    - written between double quotations ( " a string ")
```java
String firstName = "Joseph";
```

- any character - including nonprinting characters such as backspace or a tab can be stored in a __char__ variable 
  - to store, use __escape sequence__ 
    - always begins with backslash followed by a character 
    - pair represents a single character 
```java
char aNewLine = '\n'; // newline character stored in aNewLine char variable 
char aTabChar = '\t'; // tab character stored in aTabChar char variable 
                      // moves cursor to next tab stop 
```

- common escape sequences: 

| escape sequence | description                                                |
|-----------------|------------------------------------------------------------|
| \b              | backspace, moves cursor one space to left                  |
| \t              | tab, moves cursor to next tab stop                         |
| \n              | newline or linefeed; moves cursor to beginning of newline  |
| \r              | carriage return; moves cursor to beginning of current line |
| \"              | double quotation mark; displays a double quotation mark    |
| \'              | single quotation mark, displays single quotation mark      |
| \\              | backslash; displays backslash character                    |

- __Note:__ 
  - when displaying values within __JOptionsPane__ dialog boxes rather than in terminal, escape sequences 
    - '\t'
    - '\b'
    - '\r'
    - don't work in GUI environment 

- multiple methods of producing console output on multiple lines in terminal: 
  - use newline escape sequences with single __println()__ call 
  - call __println()__ method multiple times 
  - use text blocks 

- text blocks have been added to to java lang starting in __Java 13__ 
- __text block:__ multiline string literal that voids the need for an escape sequence to display output on multiple lines 
  - start & end with three double quotes """ """


## 2.6 using __Scanner__ class to accept keyboard input

- to create interactive programs that accept input from a user, can use __System.in__ 
  - __standard input__ device (normally keyboard)
- __System.in__ not as flexible
  - designed to only read in bytes 
  - __Scanner__ class makes System.in more flexible

- to create a __Scanner__ object & connect it to __System.in__ object, write a statement similar to following: 
```java 
Scanner inputDevice = new Scanner(System.in);
```
- portion of statement to left of assignment operator, __Scanner inputDevice__ declares an object of type __Scanner__ with name __inputDevice__ 
- portion of statement to right of assignment operator, __new Scanner(System.in)__ creates a Scanner object that is connected to the __System.in__ property
- in other words, the created Scanner object is connected to the default input device 
- keyword __new__ required by Java; used whenever objects more complex than primitive data types are created 
- assignment operator in __Scanner__ declaration statement assigns value of new object(its memory address) to variable __inputDevice__ in the program 
- __Scanner__ class is a built-in class
  - contains methods that retrieve values from an input device
- each retrieved value is a __token__ 
  - __token__ 
    - set of characters that is separated from the next set by whitespace 
    - in this case, most often means data is accepted when user presses Enter, can also mean a token is accepted after a space or a tab 
- doesn't contain a __nextChar__ method 
  - to retrieve single character, can use __nextLine()__ & __charAt()__ methods
  
| method       | description                                          |
|--------------|------------------------------------------------------|
| nextDouble() | retrieves input as double                            |
| nextInt()    | retrieves input as an int                            |
| nextLine()   | retrieves next line of data & returns it as a String |
| next()       | retrieves next complete token as String              |
| nextShort()  | retrieves input as a short                           |
| nextByte()   | retrieves input as a byte                            |
| nextFloat()  | retrieves input as a float                           |
| nextLong()   | retrieves input as a long                            |


- __echoing output:__ repeating output as values user has entered 
- if any of the __Scanner__ methods used cannot convert the next token to the right data type, an error will be thrown 
- __prompt:__ message displayed for the user that describes & requests input 

### pitfall: using __nextLine()__ following one of the other __Scanner__ input methods 
- can encounter problem when using one of the numeric __Scanner__ class retrieval methods or the __next()__ method before 
__nextLine()__ method is used 
- if you accept __numeric__ input prior to the __string__ input, the string input is ignored unless you take special action 
- when a user types data followed by the __Enter__ key, the Enter key character is left in the keyboard buffer after __Scanner__
class methods retrieve the other keystrokes 
- __solution:__ 
  - after any __next(), nextInt(), or nextDouble()__ call, you can add an extra __nextLine()__ method call that will retrieve the abandones 
  Enter key character 
  - this way, the program will execute smoothly regardless of the input that follows 

    
## 2.7 using the __JOptionsPane__ class to accept GUI input 

- we can accept input in a GUI dialog box using the __JOptionsPane__ class 
- two dialog boxes that can be used to accept user input: 
  - __InputDialog__ - prompts user for text input 
  - __ConfirmDialog__ - asks the user a question, providing buttons the user can click for __Yes, No, Cancel__ responses 

### using input dialog boxes 
- __input dialog box:__ asks a question & proivdes text field where the user can enter a response 
  - created using __showInputDialog()__ method 
    - 6 versions available 
  - returns a __String__ that represents a user's response 
    - in this way, we can assign the __showInputDialog()__ method to a __String__ variable and the variable will hold the value the user enters 
- a different versio nof the __showInputDialog()__ method required __four__ arguments that allow the programmer flexibility in controlling the appearance of the input dialog box 
- four args to __showInputDialog()__ include: 
  - the parent component (screen component), such as the frame, in front of which the dialog box will appear 
    - __null__ → dialog box is centered on the screen 
    - message user will see before entering a value (usually a String - can be any type of object)
    - title to be displayed in the title bar of the input dialog box 
    - class field describing the type of dialog box; can be one of the following:
      - ERROR_MESSAGE
      - INFORMATION_MESSAGE
      - PLAIN_MESSAGE
      - QUESTION_MESSAGE
      - WARNING_MESSAGE

__Recall:__ 
    - reserved keyword __static__ means a method is accessible & usable even though no objects of the class exist 
    - ex. We can tell the method __Double.parseDouble()__ is a __static__ method since the method name is used with the class name __Double_— no object is needed 

### using confirm dialog boxes
- sometimes, input you want from a user doesn't have to be typed from keyboard 
- when presenting simple options to a user, can offer buttons user can click through to confirm a choice 
- __confirm dialog box:__ displays options _Yes, No, Cancel_ can be created using __showConfirmDialog()__ method in __JOptionsPane__ class 
  - four versions available, simplest requiring parent component (can be null) & __String__ promp that is displayed in the box of the button 
- __showConfirmDialog()__ returns an integer containing one of the three possible values: 
  - JOptionPane.YES_OPTION
  - JOptionPane.NO_OPTION
   JOptionPane.CANCEL_OPTION

- see /examples/AirlineDialog class for an example using a dialog box to ask a user a question, then showing the output when the user selects yes 
  - the user's response is stored in the integer variable __selection__, & the boolean variable __isYes__ is set to the result when __selection__ and __JOptionPane.YES_OPTION__ are compared 
    - if the user has selected the Yes button in the dialog box, this variable is set to __true__
    - otherwise, the variable is set to __false__ 
    - finally, __true__ or __false__ is displayed 
- can also create a confirm dialog box with __five__ arguments: 
  - parent component (can be null)
  - prompt message
  - title to be displayed in the title bar
  - integer that indicates which option button will be shown - should be one of three permissible constants: 
    - YES_OPTION
    - NO_OPTION
    - CANCEL_OPTION
  - integer that describes the kind of dialog box - should be one of the constants 
    - ERROR_MESSAGE
    - INFORMATION_MESSAGE
    - PLAIN_MESSAGE
    - QUESTION_MESSAGE
    - WARNING_MESSAGE 

## 2.8 performing arithmetic using variables & constants 

- 5 standard __arithmetic operators:__ 
  - __+__ addition
  - __-__ subtraction
  - __*__ multiplication
  - __/__ division
  - __%__ remainder (modulus)
- values on either side of the operators known as __operands__ 
- are binary operators, in that they require two operands 
- the operators __/__ and __%__ deserve special consideration - java supports __two__ types of division: 
  - __floating point division__
  - __integer division__ 
- __remainder operator__ 
  - most often used with two integers 
  - result: an integer with the value of the remainder __after__ division has taken place 
  - i.e., spits out the remainder of a division operation 

### associativity & precedence 

- when you combine math ops in a single statement, must understand associativity & precedence 
- the associativity of arithmetic operators with the same precedence is left-to-right
  - ex. ``` answer = x + y + z```; the x & y are added __first__, producing a temporary result, then __z__ is added to the temporary sum 
    - after the sum is computed, the result is assigned to __asnwer__
- __operator precedence__ refers to the rules for the order in which parts of a mathematical expression are evaluated 
  - the multiplication, division, and remainder ops have the same precedence & is higher than the precedence of addition & subtraction 
  - in other words, an arithmetic operation gets evaluated left to right 
    - any multiplication, division, or remainder ops take place 
    - the expression is evaluated left to right again 
    - any addition or subtraction ops execute 

### writing arithmetic statements efficiently 
- you can make programs operate more effectively if you avoid unnecessary repetition of arithmetic statements 
- ex. suppose you know the values for an employee's hourly pay & pay rate, & you wish to compute state + federal withholding tax based on known rates 
  - you could write two statements as follows: 
    ```java
    stateWithholding = hours * rate * STATE_RATE;
    federalWithholding = hours * rate * FED_RATE;
    ```
    

    

    
    