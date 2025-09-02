# 1.1 creating java programs 

## Software Categories

**Application Software**
- Programs that perform tasks for users
- Examples: word processors, games, web browsers

**System Software** 
- Programs that manage the computer itself
- Examples: operating systems, device drivers, utilities

- __Logic__ behind any computer program, whether its an app or system program, determines the exact order of instructions needed to produce desired results 

## Programming Languages

**High level Languages** 
- Java, VBasic, C++, C#, Rust allow use of english-like easy to remember terms 

**Low level langs** 
- correspond closely to computer's hardware & not easily read/understood 
- custom to every type of machine on which program runs 
    - x86, RISCV, arm64, aarch64

- All computer programs ultimately compiled down to machine language (binary) 
- most __basic__ set of ixn's computer can execute 
- each processor type has own set of machine lang ixns (ISA) 

## Programming Fundamentals

**Syntax**
- Each lang has its own __syntax__ (rules defining how language elements correctly combined to produce usable statements) 
- all langs have specific set of rules for using that vocabulary & syntax 

**Program Statements**
- using a prog. lang, programmers write series of __program statements__ similar to natural english, carrying out program's tasks 
- aka __commands__ (orders to the computer) 

## Compilation vs Interpretation

- after writing program statements, depending on the language being used, a compiler or interpreter is used  
- __compiler:__ translates an entire program before carrying out any statements, or _executing_ them
- __interpreter:__ translates one program statement at a time, executing a statement as soon as it is translated 

- compilers and interpreters issue +1 error messages each time they encounter an invalid program statement (syntax error: misuse of lang -- keyword misspelled, omitting required word of statement)
- reparing syntax errors --> __1st step of debug process__  

## Types of Errors

- __Logic Error:__ bug that allows program to run, but causes it to operate incorrectly 
- when developing a program of any significant size, should plan its logic before any program statements are written 
- program can be free of syntax errors, and execute while still retaining logic errors  
- when output is incorrect, the programmer must carefully examine all the statements within  the program, revise or move the offending statements, and translte & test the program again 
- aka __Semantic Errors__

# 1.2 comparing procedural vs OOP concepts 

## Procedural programming

**Procedural programming** 
- style in which operations are executed one after another in a sequence 
- defines & uses named computer memory locations; each of these named locations can hold data (variable) 
- ex. data might be read from input device, used as basis for a decision, sent to an output device, or have other operations performed with it 
- data stored in a variable can change, or vary during a program's execution 
- __procedures__: individual operations used in a computer program grouped together into logical units 
- ex. series of 4 or 5 comparisons & calculations that together define a person's federal withholding tax value might be grouped as a procedure called ```calculateFederalWithholding()```
- as a procedural program executes its statements, it can sometimes pause to __call a procedure__ 
- when a program calls a procedure, the current logic is temporarily suspended so that the procedure's commands can execute 
- procedures aka: __modules, methods, functions, subroutines__  
- (methods in java) 

## Object Oriented Programming

**Object Oriented Programming** 

- extension of procedural programming 
- involves following: 
    - creating classes (blueprints for objects) 
    - creating objects (specific instances of those classes) 
    - creating applications that manipulate or use those objects 
- originally was most used for 2 types of applications: 
    - computer sims
    - GUIs 

- creating a GUI environment for users is also a natural use for object orientation 
- easy to think of the components a user manipulates on a computer screen, such as buttons, scroll bars, similar to real-world objects 
- each GUI object contains data - for ex, a button on a screen has a specific size & color 
- each object also has behaviors - for ex, each button can be clicked & reacts  

### 3 basic concepts: 
1. encapsulation as it applies to classes as objects 
2. inheritance 
3. polymorphism 

## Classes, Objects & Encapsulation

**Classes, Objects & Encapsulation** 
- __Class__: group/collection of objects with common properties 
    - similar to existence of blueprint for homes, without any being built yet, recipes for cookies which exist before any cookies are baked from them 
    - class definition exists before any objects are created from it 
- __Class Definition:__ describes what attributes its objects will have & what those objects will be able to do
- __Attributes:__ characteristics that define an object; they are __properties__ of the object  

- __Object:__ a specific, concrete instance of a class 
- __Instantiation:__ the process of creating a class 

- Objects can be created from classes written by oneself, along with classes written by others, including Java's creators 
- values contained within an object's properties often differentiate instances of the same class from another 
- ex. --> class __Automobile__ describes what __Automobile__ objects are like 
    - some properties of the __Automobile__ class are: 
        - make
        - model
        - year 
        - color
    - each __Automobile__ object possesses the same attributes, but not necessarily the same values for those attributes
    - one __Automobile__ might be a ```2014 white Honda Civic``` and another might be a ```2021 red Chevrolet Camaro```

- the values of the properties of an object are referred to as the object's __state__  

- iotw, can think of objects as roughly = nouns (words used to describe person, place or thing) & their attributes as similar to adjectives that describe the nouns  

- when you understand and object's class, you understand the characteristics of the object 
    - if a friend purchases an __Automobile__, you know it has a model name, and if that friend gets a __Dog__, you know the dog has a breed 

- knowing what attributes exist for classes allows one to ask appropriate 'questions' about the states or values of those attributes 
    - ex --> mpg of vehicle? ✅
         --> taken vehicle for trips to vet? ❌

    - similarly, in a GUI environment, you expect each component to have specific, consistent attributes & methods, such as a window having title bar & a close button, because each component gains these properties as a __member of the general class of GUI components__ 

### Methods

- besides defining properties, classes define methods their objects can use

- __Method:__ self-contained block of program code that carries out some action, similar to a procedure in a procedural program 
    - ex --> __Automobile__ might have methods for moving forward, backward, & determining status of its gas tank 
    - ex --> __Dog__ might have methods for walking, eating & determining its name
    - ex --> program's GUI components might have methods for maximizing, minimizing & determining their size 

- __iotw:__ if objects are similar to __nouns__, then methods are similar to __verbs__ 

- in OO-classes, attributes & methods are encapsulated into __objects__ 

## Encapsulation

**Encapsulation** 
- refers to two notions in OOP: 

    1. encapsulation is the enclosure of data & methods within an object
       - allows you to treat all of an objects methods & data as a single entity 
       - just as an actual dog contains all of its attributes & abilities, so would a program's __Dog__ object 
    2. encapsulation also refers to the _concealment_ of an object's data & methods from outside sources 
        - concealing data aka __information hiding__ 
        - concealing how methods work --> __implementation hiding__ 
        - lets you hide specific object attributes & methods from outside sources & provides security that keeps data & methods safe from inadvertent changes 

- if an object's methods are well written, the user can be unaware of low-level details of how methods are executed, & user must simply understand the interface or interaction between the method & the object 
    - ex --> if you can fill up your __Automobile__ with gasoline, it is because you understand the interface between the gas pump nozzle and the vehicle's gas stank opening 
        - don't need to understand how pump works mechanically or where gas tank is physically located 

**Note** 
- Programs that use classes only need to work with interfaces 

## Understanding inheritance and Polymorphism

**Understanding inheritance and Polymorphism** 

- important feature differentiating OOP from procedural --> inheritance 
- __Inheritance:__ ability to create classes that share the attributes & methods of existing clases, but with more specific features 
- ex --> __Automobile__ is a class, and all __Automobile__ objects share many traits & abilities 
         __Convertible__ is a class that _inherits_ from the __Automobile__ class;
         - a __Convertible__ is a type of __Automobile__ that has and can do everything a "plain"         automobile does, but with the added ability to lower its top 
-  __Convertible__ is not an object --> it is a class 
- a specific __Convertible__ is an object --> __my1967BlueMustingConvertible__
- inheritance helps one understand real-world objects 
- ex --> first time you encounter a convertible, already understand how ignition, brakes, door locks, & other systems work because you realize a convertible is a type of automobile 
    - therefore, need to be concerned only with methods & attributes that are "new" with a convertible 
- you can build new classes based on existing classes & concentrate on the specialized features being added 

### Polymorphism

- __Polymorphism:__ exclusive to OOP 
    - meaning "many forms" 
    - describes features of languages that allows the same word or symbol to be interpreted correctly in different situations based on the context 
    - ex --> although classes __Automobile, Sailboat, Airplane__ all inherit from __Vehicle__, methods such as __turn()__ and __stop()__ work differently for instances of those classes 




# 1.3 Features of the Java lang 

- developed by sun microsystems as an OOP for biz apps & interactive, WWW-based internet apps 
- some advantages helping popularize it: 
    - security features (strict type system, JVM isolation) 
    - architecturally neutral (write once, run anywhere) 

- can be run on variety of computers & devices because it doesn't execute instructions on a computer directly 
    - runs on hypothetical computer --> JVM 
    - hypothetical in sense it isn't a physcial entity, but an abstraction of one created with software 

- __Source Code:__ programming statements written in higher level langs 

- __Development Environment:__ set of tools that help you write programs by providing such features as displaying a language's keywords in color 


## java build cycle (kinda) 

- java source code statements written saved in a file to disk 
- java compiler (javac) converts source code into binary program of __bytecode__ 
- program called __Java Interpreter__ then checks bytecode & communicates with host OS, executing bytecode ixn's line by line within the JVM

### advantages provided by JVM 

- b/c java program is isolated from the OS, also insulated from particular hw on which it is run
    - b/c of this insulation, JVM provides security against intruders accessing computer's hw through the OS 
- with java, one program can run on all platforms irrespective of ISA 
    - "Write once, run anywhere" (WORA) - slogan developed by Sun Microsystems 
- simpler to use than many other OOP langs 
- modeled after C++
- Java eliminates some of most hard to grasp features in C++ (pointers, multiple inheritance) 


## types of java apps 

1. console apps: support character or text output to computer screen
2. windowed apps: create GUI with elements such as menus, toolbars, & dialog boxes 


# 1.4 Analyzing a Java app that produces console output 

```java

public class First 
{
    public static void main(String args[]) {
    {
        System.out.println("First java application");
    }
} 
```

```java 
System.out.println("First Java application");
```  

- this statement does the actual _work_ of the program 
- like all Java statements, this one ends with a semicolon 
- most statements can be spread across as many lines as one chooses, as long as line breaks used appropriately  
- usually want to place a short statement on single line 

- the text _First Java application_ is a __literal string__ of characters - a series of characters that will appear in output exactly as entered 
- any literal string in Java is written between double quotation marks 
- __literal strings__ cannot be broken and placed on multiple lines  
 
```java 
System.out.println("First Java application");
```  

- __System__ is a class 
- __out__ is a property of the __System__ class 
- Dots separate classes, objects & methods 
- __println()__ is a method --> method names always followed by () 
- __"First Java application"__ is a literal string that is the __argument__ to the __println()__ method 
- every java statements ends with a __semicolon ;__ 

- the string within the quotation marks appears within the parentheses because the string is an __argument__ to a __method,__ and arguments to methods __always__ appear within parentheses following the method name 

- __Arguments:__ pieces of info sent into a method  
- __Passing Arguments:__ act of sending arguments to a method 

- __println()__ after output is displayed, insertion point moves to following line so that subsequent output is on new line 
- __print()__ insertion point does __not__ advance to new line, so subsequent output appears at end of current line 


### methods 

- when calling methods, always use __()__ followed by __method name__ 
- some can be left empty, while others require arguments to be passed in 
    - ex. __showMessageDialog()__ method requires __2__ arguments 

- within statement
```java
System.out.println("First Java application");
``` 
- __out__ is an object that is a property of the __System__ class; __out__ refers to the __standard output device__ for a system, normally the monitor 
- __out__ object itself is an __instance__ of the __PrintStream__ class, which contains several methods, including __println()__ 

- one could create the __out__ object and write the ixns within the __println__ method, but would be time consuming - included in std lib 
    - __System__ and __PrintStream__ classes, the __out__ object and __println()__ and __print()__ methods were created as conveniences 

```java 
System.out.println("First Java application");
```  
- within this statement, __System__ is a class 
    - defines attributes for __System__ objects, just as __Dog__ class defines attributes for __Dog__ objects 
    - input & output are one of attributes of __System__ 

- periods within the statement used to separate names of components in the statement

- java is __case sensitive__ 
- statement that displays the string __"First Java Application"__ contains the following: 
    - a class name
    - an object reference 
    - a method call
    - a method argument 
    - a statement-ending semicolon 

- the statement that displays the string cannot standalone; its embedded within a class 

## Understanding the __First__ Class

- everything used within a java program __must__ be a part of a class 
- __public class First__ defines a class for which the name __First__ has been chosen 
- can define a java class using any name or __identifier__, as long as it meets following requirements: 
     - must begin with letter of english alphabet, non-english letter (alpha or pi), an underscore, or dollar sign 
     - cannot begin with a digit 
     - can only contain letters, digits, underscores or dollar signs 
     - cannot be a reserved keyword, such as __public__ or __class__ 
     - cannot be one of following (primitive) values: 
        - true
        - false
        - null
- following aren't keywords, but their use is restricted in some contexts: __permits, record, sealed, var, yield__ 
    - better __not__ to use these as identifiers 

### Java is based on Unicode 

- unicode: intnl. system of character representation 


### Conventional standards 

- begin class identifiers with an __UppercaseLetter__ and employ other uppercase letters as needed to improve rfeadability 
- __method identifiers__ like __println()__ conventionally begin with __lowercaseletters__  
- __Pascal Casing:__ style that joins words in which beginning is uppercase 


### ex's of valid class names 

- __Employee__ 
    - begins with uppercase letter 
- __UnderGradStudent__
    - begins with uppercase letter, contains no spaces, emphasizes each new word with an initial uppercase letter 
- __InventoryItem__
    - begins with an uppercase letter, contains no spaces, emphasizes 2nd word with an initial uppercase letter 
- __Budget2024__ 
    - begins with an uppercase & contains no spaces 

### invalid class names 

- __Inventory Item__ 
    - space character = illegal identifier 
- __class__
    - reserved keyword 
- __phone#__ 
    - number symbol # = illegal identifier 


```java
public class First 
{

}
``` 
- in the example above: 
    - the line as whole is the __class header__ 
    - everything between { } is the __class body__ 
    - keyword __class__ identifies __First__ as a class 
    - __public__ is an access specifier 
    - __First__ is the name of the class 


### Understanding the __main()__ method 

```java
public class First
{
    public static void main(String[] args)
        {
            System.out.println("First java application");
        }
}

``` 
- in the example above:
    - the line as a whole is the __method header__
        - contains info about how other methods can interact with it 
    - everything between { } is the __method body__ 
    - __public__ is an access specifier 
    - __static__ means this method works without instantiating and object of the class 
    - __void__ is the method's return type 
        - doesn't mean __main()__ doesn't produce output 
        - means __main()__ method doesn't send any value back to any other method that might use it 
    - __main()__ 
        - name of the method  
        - not all classes have a main method (many don't) 
        - __ALL__ java applications must include a class containing a public method named __main()__     
        - when executing a java app, the JVM always executes the __main()__ method first 
    - __String__ is a class - any arguments to this method must be __String__ objects  
        - in this line, __String[] args__ represent the type of argument that can be passed to the __println__ method 
        - __String__ class is a java class that can be used to hold character strings 
            - begins with an Uppercase Letter 
        - brackets __[ ]__ following __String__ mean the argument is a list of __Strings__ 
    - __args__ is the identifier of the array of __Strings__ that is the argument to the method 
        - used to hold any __String__ objects that might be sent to the __main()__ method 
        - __main()__ could do something with those arguments -> display them
        - __must__ place an identifier within the __main()__ method's parentheses 
            - identifier doesn't need to be named __args__ -- can be any legal java identifier, name __args__ is traditional 


### indent style 

- __whitespace:__ any comvo of nonprinting characters 
    - optional in java 
    - used to organize program code for readability 
    - blank spaces ignored by compiler 
    - cannot use whitespace within an identifier or keyword, or surrounding dots in any class-object method combo 

- every { has a closing } 
    - placement of { } not important to compiler 
-java compiler doesn't care how one indents 
- most important rule is to develop consistent style of which ones organization approves of

```java 

// k & r style 

public class First{
    public static void main(String[] args){
        System.out.println("First java application");
    }
}

// allman style 

public class First 
{
    public static void main(String[] args) 
    {
        System.out.println("First java application");
    }
}
```


### saving a java class 
- when you writer a java class, must save it using writable storage medium (disk, usb) 
- if a class is __public__, must save the class in a file with __exactly__ the same name and a __.java__ extension 
- ex --> with class above, file must be saved as __First.java__ 
    - class & filename must match exactly, including cases  


# Compiling a java class & correcting syntax errors 


- after having written & saved an application, 2 steps must occur before viewing app's output: 
    1. must compile class written (source code) into __bytecode__ 
    2. must use java interpreter to translate bytecode into executable statements 


## compiling a java class 
- cli based compilation: 
    1. call compiler 
        - javac First.java
    2. call interpreter to run compiled bytecode 
- after successful compilation. a file named (in this case) __First.class__ is created & saved in same folder as text file that contains source code (First.java)

- __Compile-time errors:__ arise when compiler detects violation of language syntax rules & is unable to translate the source code to machine code 
- when one compiles a class: 
    - compiler reports as many errors as it can find so that you can fix as many as possible 
    - sometimes, one error causes multiple error messages that normally wouldn't be eerors if the first syntax error didn't exist, so fixing one error might eliminate multiple error messages  


# 1.6 Running a java application & correcting logic errors 

- just b/c a program compiles & executes, doesn't mean its free of errors 

### running a java app
- "run" or "build" in ide
- cli -> call java interpeter on compiled source code 
    - __java First__ (using ex. from above) 


### mod'ing compiled java class 
- to alter output, modify text within __.java__ file containing existing class 
- __recompile:__ changes made without re-compilation of the class do not change compiled bytecode, therefore do not affect output 
    - when you recompile a class, og version of compiled file with __.class__ is replaced, & og no longer exists 
- when modifying a class, must decide whether you want to retain og version
    - yes: 
        - give new version a new class name & filename 
        - or, save in different folder 

### correcting logic errors 
- __logic error:__  
    - case where program errors arise not in syntactical regards but in differences between desired & real output/behaviors of program 
    - ex's --> multiplying 2 values when addition was intended 
           --> printing 1 copy of a biz report, when intention was to print 5
           --> forgetting to produce total at end of biz report, when requested 
- responsibility of programmer to test programs & find any logic errors 
- a logic error is a __runtime error__ 
- __runtime error:__ 
    - error not detected until program asks computer to do something wrong, or even illegal while executing 
    - not all are fault of programmer
        - ex. hardware might fail while program is executing 
    - good programming practices can help minimize runtime errors 

- __Debugging:__ 
    - process of fixing computer errors 
    - originally coined when large moth found wedged in circuitry of mainframe at harvard in '47


# 1.7 adding comments to java class 

- documenting program code helps one rememebr why certain lines were written in the way the were 
- __Program Comments:__ 
    - non-executing statements added to a program for purpose of documentation 
    - designed to help readability of source code 

- often used to leave notes for oneself, or others who might read code in future 
- at very least, Java class files should include comments indicating: 
    - author
    - date
    - class name or function 

- best practices also dictate to include brief comment to describe purpose of each method created within a class 
- add comments as first lines of every file --> should contain: 
    - class name 
    - purpose 
    - your name
    - date 
- __commenting out__ statements can help during debugging 
    - turns statement into comments so compiler doesn't translate it, & JVM doesn't execute its command 
    - can help pinpoint location of errant statements in malfunctioning programs 

- 3 types of comments in java: 
    1. __line comments__ 
        - start with two forward slashes: __//__ 
        - require no ending symbol 
        - can appear on standalone line, or at end of existing one with a statement
    2. __block comments__ 
        - start with forward slash & an asterisk & end with asterisk & forward slash: __/* */__
        - can appear on line by itself, line before executable code, or on line after code 
        - can extend across lines 
    3. __Javadoc__ 
        - special case of block comments called __documentation comments__ b/c used to auto generate nicely formatted program docs with _Javadoc_ program 
        - begin with forward slash & two asterisks, followed by asterisk & one forward slash 
        ```java 
        /** example of a java doc 

        lorem ipsum 

        */
        ```
- might want to create comments simply for aesthetics 
     - row of dashes or asterisks to use as visual line dividing parts of a program 
- when mod'ing a program, important to change any relevant comments 

# 1.8 creating java app that produces GUI output 

- java provides built in classes to produce GUI output 
- ex. class __JOptionPane__ allows creation of dialog boxes 
- __dialog box:__ 
    - GUI object resembling window where messages can be displayed 

- example of code to produce dialog box: 

```java 
import javax.swing.JOptionsPane;

public class FirstDialog{
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "First java dialog");
    }
}
```
        
- __import statements:__ used to access built-in java classes contained in a group of classes called a __package__ 
- to use __JOptionPane__ class, must import package named __javax.swing.JOptionPane__ 
- any import statement used must be placed outside of any class written in a file 
- __Note:__ 
    - don't need to import any packages when using the __System__ class (System.out.println() method) b/c __System__ class is contained in package __java.lang__, which is auto imported in __every__ java program 
    - we could __import java.lang__ at top of any file in which __System__ class used, but not required 


- Ex. (above)
    - second statement within __main()__ method in __FirstDialog__ class uses __showMessageDialog__ method which is part of __JOptionPane__ class 
    - __showMessageDialog__ method requires __two__ arguments 
        - whenever a method requires >1 args, they're separated by commas 
        ex. __JOptionPane.showMessageDialog(null, "Success");__ 

    - when first arg to __showMessageDialog()__ is __null__, => output message box should be placed in center of screen 
    - second arg to __showMessageDialog()__ is literal string that is displayed 
