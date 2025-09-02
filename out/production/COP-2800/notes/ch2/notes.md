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
























