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
System.out.println("First Java application");```  

- this statement does the actual _work_ of the program 
- like all Java statements, this one ends with a semicolon 
- most statements can be spread across as many lines as one chooses, as long as line breaks used appropriately  
- usually want to place a short statement on single line 


