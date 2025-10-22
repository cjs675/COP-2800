# ch.4 Using Classes and Objects 


## 4.1 learning about classes and objects  
- one way to classify java classes -> differentiate between following two types: 
  1. classes from which objects are _not_ instantiated, such as the application programs with __main()__ methods 
  2. classes from which objects _are_ created 
- i.o.t.w, in OOP, sometimes we create classes to run as applications, and other times we create classes so that we can instantiate objects from them 
  - sometimes we write classes to do both 
- __"is-a relationship"_ 
  - a relationship in which the object _"is a"_ concrete example of the class
  - expressing an __is-a__ relationship is correct only when you refer to the object & the class in the proper order 
  - "my oak desk with the scratch on top _is a_ Desk"
  - "my pet goldfish named Moby _is a_ Fish"
- an object is an __instantiation__ of a class, or a tangible example of a class 
  - pet goldfish       
  - guppy at the fair    > each constitute on instantiation of the __Fish__ class 
  - atlanta zoo shark 
- objects can be members of more than one class 
- classes are useful in that they provide __reusability__ 
- objects gain their attributes from their classes 
  - all objects have predictable attributes because they're members of certain classes 
  - __ex.__ 
    - if you're invited to a graduation party 
    - automatically know many things about it: 
      - assume there will be a start time 
      - certain number of guests 
      - some quantity of food 
      - understand what a party object entails because of prior knowledge of the __Party__ class 
    - don't know # of guests or what food will be served at this particular party, but you understand that because 
      all parties have guests and refreshments, this one must too 
    - because you understand the general characteristics of a __Party__, you anticipate different attributes than
      if you plan to attend to a __TheaterPerformance__ object or a __DentalAppointment__ object 
- in addition to their attributes, objects have methods associated with them, & every objects that is an instance of a class is 
assumed to possess the same methods 
- in the graduation party example, we might have the identifier __myGraduationParty__ 
  - as a member of the __Party__ class, __myGraduationParty__, like all __Party__ objects might have data methods __setDate()__ and __setTime()__ 
  - when using them, the __setDate()__ and __setTime()__ methods require arguments, or info passed to them 
    - __ex.__ following statements invoke methods that are available for the __myGraduationParty__ object: 
    ``myGraduationParty.setDate("May 12");``
    ``myGraduationParty.setTime("6 P.M.");``
- when using an object & its methods, think of being able to send a message to the object to direct it to accomplish some task 
  - can tell __Party__ object named __myGraduationParty__ to set date & time you request 
- even though __yourAnniversaryParty__ is also a member of the __Party__ class, & even though it also has access to __setDate()__ and __setTime()__ methods,
the args sent to __yourAnniversaryParty__ will be different from those sent to __myGraduationParty__ methods 
- within any object-oriented program, we're continuously making requests to objects' methods & often including args to send info as part of those requests 
  - in addition, some methods used in an application must return a message or a value 
  - if one of our party guests uses the __getDate()__ method, the guest hopes that the method will respond with the desired info 
  - similarly, within O-O programs, methods are often called upon to return a piece of info to the source of the request 
    - __ex.__ 
      - a method within a __Payroll__ class that calculates federal withholding tax might return a tax amount in dollars & cents, 
      and a method within an __Inventory__ class might return __true__ or __false_, depending on the method's determination of whether an item is at the reorder point 
- no need to create every class that is used 
  - __ex.__ __System.in__ method 
    - input __method__ from the __System__ class 
  - __ex.__ __System.out.println__ method  
    - print __method__ from the __System__ class 
  - both provided by java creators 
- similarly, we might create a class that others will use to instantiate objects within their own applications 
  - __ex.__ 
    - we write a __Dog__ class that eventually will be used by breeders, animal shelters, vet offices 
- we can call an application or class that instantiates objects of another class a __class client__ or a __class user__ 

## 4.2 creating a class 
- when creating a class, must assign a __name__ & determine what __data__ and __methods__ will be part of the class 
- when instantiating objects, each object has its own copy of each nonstatic data field in the class 
- to create a class: write class __header__ with 3 parts: 
  1. optional access specifier 
     2. can be __public__ - doesn't have to be 
  2. keyword __class__ 
  3. any legal identifier chosen for name of the class - starting with uppercase is convention 
- __ex.__ 
  - header for class that represents an employee: 
    ```public class employee```
- the most liberal form of access is __public__ 
  - keyword __public__ = class modifier 
  - classes that are public are accessed by all objects 
- public classes can also be __extended__ or used as a basis for any other class 
- making access __public__ means that if we develop a good __Employee__ class, & someday we want to develop two classes that are more specific,
__SalariedEmployee__ and __HourlyEmployee__, then we don't have to start from scratch 
  - each new class can become an extension of the original __Employee__ class, inheriting its data & methods  

- after writing the class header, we write the body of the class between curly braces {} 
  - body contains data & methods for the class 
  - data components of a class often referred to as __data fields__ to help distinguish from other var's being used 
  - __data fields:__ variables declared within a class but outside any method 

```java
public class Employee
{
    private int empNum;
}
```
- in the ex. above, the data field __empNum__ is not preceded by the keyword __static__ 
  - if the keyword __static__ had been inserted there, a single __empNum__ value would be shared by __ALL__ __Employee__ objects that are eventually instantiated 
  - because the __empNum__ field is not preceded by __static__, it is __nonstatic__ by default, and when we eventually do create, or instantiate objects from this class, 
  each __Employee__ can have its own unique __empNum__ 
  - each object gets its own copy of each nonstatic data field in its class 
- a nonstatic field like __empNum__ is an __instance variable__ for the class because one copy exists for each object instantiation 
- __recall:__ 
  - access specifier for most java methods is __public__ 
  - however, most fields - such as __empNum__ in the __Employee__ class above are __private__ which provide highest level of security 
- assigning __private__ access to a field means that no other classes can access the field's values, & only methods of the same class are allowed to set, get or otherwise use private variables 
- __information hiding:__ 
  - principle used in creating private access 
  - important component of OOP 
- a class's private data can be changed or manipulated only by a class's own methods & not by methods that belong to other classes 

- in contrast to fields, which are usually __private__, most class methods are __public__ 
- the resulting private data/public method arrangement provides a means for you to control outside access to your data 
  - only a class's nonprivate methods can be used to access a class's private data 
  - __ex.__ 
    - hiring a receptionist who controls stream of incoming messages (filtering out spam, hostile ones) and outgoing messages (spelling, grammar, legal implications) 
    - a __BankAccount__ class might contain a __getBalance()__ method that sends an account's balance to a client, but only if a password or access code is sent to the method 
- the way in which nonprivate methods are written controls how we use private data
- in summary - when creating classes from which objects will be instantiated: 
  - the class's data fields are most often __private__
  - the class's methods are most often not __static__ 





## 4.3 creating instance methods in a class 
- classes from which we intend to instantiate objects typically contain fields & methods 
- __ex.__ 
  - one method we'd need for an __Employee__ class that contains an __empNum__ is the method to retrieve (or return) any 
  __Employee__'s __empNum__ for use by another class 
  - a reasonable name for this method -> __getEmpNum()__ 
    - declared as __public int getEmpNum()__ 
      - public access 
      - returns an __int__ 
      - possesses identifier __getEmpNum()__ 
      - not __static__ if the intention is that each __Employee__ object has its own __empNum__ value 
- similarly, we'd need a method with which to set the __empNum__ field 
  - reasonable name -> __setEmpNum()__ 
  - declared as __public void setEmpNum(int emp)__ 
    - public access 
    - returns nothing 
    - possesses identifier __setEmpNum()__ type __int__ 
- __mutator methods:__ 
  - methods that set or change field values  
  - "setters"  
  - begin with prefix "set" 
- __accessor methods:__ 
  - methods that retrieve values 
  -  "getters"
  - begin with prefix "get"
- using 3 letter prefixes not _required_ but _conventional_
  
```java
/* get & set methods for the 
empNum field for the Employee
class
*/
public void setEmpNum(int num)
{
    empNum = emp;
}
public int getEmpNum()
{
    return empNum;
}
```
- because these methods actually return an __object__, they do __not__ use the __static__ modifier
- __static__ is used for classwide methods, but not for methods that "belong" to objects 
  - when creating a program with a __main()__ method that will be executed to perform some task, many of the methods 
  will be __static__, so we can call them from within __main()__ without creating objects
- however, when creating a class of which objects will be instantiated from, most methods will be nonstatic because they 
will be associated with individual objects 
- __ex.__ 
  - __getEmpNum()__ method must be nonstatic because it returns a different __empNum__ value for every __Employee__ object ever created 
- __Nonstatic methods__ 
  - methods used with object instantiations
  - aka __Instance Methods__ 
  - can use either __static__ or nonstatic method with an object, but only nonstatic methods behave uniquely for each object 
  - cannot use a nonstatic method without an object 

- to determine whether a data field or method should be static,
  ask: How many times does it occur? 
    - if it occurs once per class --> __static__ 
      - once per object --> nonstatic

| static                                                                                                                                                                            |                                                                                                           nonstatic                                                                                                            |
|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| in java, static is a keyword, can also be used as an adjective                                                                                                                    |                                                                                  no keyword for nonstatic items - fields nonstatic by default                                                                                  | 
| static fields in a class are called class fields                                                                                                                                  |                                                                                   nonstatic fields in a class are called instance variables                                                                                    | 
| static methods in a class are called __class methods__                                                                                                                            |                                                                                  nonstatic methods in a class are called __instance methods__                                                                                  |
| when using a static field or method, don't need to use an object; ex. JOptionsPane.showDialog();                                                                                  |                                                                       when using a nonstatic field or method, must use an object - System.out.println();                                                                       |
| when creating a class with a static field or method & instantiate 100 objects, only one copy of that field exists in memory                                                       |                                                               when creating a class with a nonstatic field & instantiate 100 objects, 100 copies exist in memory                                                               |
| when creating a static method in a class & instantiate 100 objects, only one copy exists in memory & the method doesn't receive a __this__ reference                              | when creating a nonstatic method in a class & instantiating 100 objects, only one copy of the method exists in memory, but the method receives a __this__ reference that contains the address of the object currently using it |
| static class variables are not instance variables. system allocates memory to hold class variables once per class, regardless of how many instances of the class are instantiated |                                                 instance fields & methods are nonstatic. system allocated a separate memory location for each nonstatic field in an instance                                                   |

- following provides ex. of how __public, private, static__ and nonstatic class members can be used (legally and illegally) by another class 
  - class: __MyClass__
  - 4 methods contain following properties: 
    - public static 
    - private static 
    - public nonstatic 
    - private nonstatic 
  - class: __TestClass__
  - 8 method calls 
    - 3 are to public methods 
      - call to the nonstatic method uses an object
      - two calls to static method can use an object or not 
    - 5 method calls after the comment are all invalid 
      - private methods cannot be called from outside the class
      - nonstatic methods require an object 

```
public class MyClass
{
    public static pubStatMethod();
    private static privStatMethod();
    public pubNonstatMethod();
    private privNonstatMethod();
}
public class TestClass
{
    MyClass object = new MyClass();
    object.pubNonstatMethod();
    object.pubstatMethod();
    MyClass.pubstatMethod();
    
    // none of the following work
    MyClass.privStatMethod();
    MyClass.pubNonstatMethod();
    object.privStatMethod();
    object.privNonstatMethod();
    Myclass.privNonstatMethod();
}
```

```java
// Employee class with one field and two methods 

public class Employee
{
    private int empNum;
    public int getEmpNum()
    {
        return empNum;
    }
    public void setEmpNum(int emp)
    {
        empNum = emp;
    }
} 
```
- when we create a class such as __Employee__, we can compile it but cannot execute the class 
since it __contains no main() method__  
    - a class such as __Employee__ is intended to be used as a data type for objects within other applications 
- most classes that we've created have multiple fields & methods
  - __ex.__ 
  - In addition to requiring an employee number, an __Employee__ (object) requires 
    - last name 
    - first name 
    - salary 
    - methods to get those fields 
  - following __ex.__ shows one way to arrange the data fields for an __Employee__ class 

```java
public class Employee
{
    private int empNum; // unique identifier for each employee (PK) 
    private String empLastName;
    private String empFirstName;
    private double empSalary;
    
    // method below (get/set)
}
```

- convention to organize data fields in some logical order at beginning of a class 
  - ie 
    - begin with __empNum__ (most likely also PK in DB)
    - last + first name "go together"
- __Unique Identifier:__ 
  - should have no duplicates within an application 
- can place a class's data fields & methods in any order within a class 
  - __ex.__ 
    - could place all methods first, followed by data fields
    - or could organize class so that several data fields are followed by methods that used them 
      - & then several more data fields are followed by methods that use them 
- in the __Employee__ class above, 4 fields are present 
  - even if only one __set__ and one __get__ method are needed for each field, eight methods are required 
  - considering an employee record for most orgs --> many more fields are required 
    - address 
    - phone # 
    - hire data
    - # of dependents 
    - many other methods 
  - finding one's way through list can become cumbersome 
    - for ease in locating class methods, many programmers store them in __alphabetical order__ 

```java
public class Employee
{
    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;
    public int getEmpNum;

    {
        return empNum;
    }

    public void setEmpNum(int emp)
    {
        empNum = emp;
    }  
    public String getEmpLastName()
    {
        return empLastName;
    }
    public void setEmpLastName(String name)
    {
        empLastName = name;
    }    
    public String setEmpFirstName()
    {
        empFirstName = name;
    }    
    public double getEmpSalary()
    {
        return empSalary;
    }    
    public void setEmpSalary(double sal)
    {
        empSalary = sal;
    }    
}
```  

## 4.4 declaring objects & using their methods
- 'custom' made classes are called __reference types__ 
  - different from primitive
- declaring a class doesn't create any actual objects  
- objects conventionally __start with lowercase__ letter 
- class --> abstract description of what an object will be like if any objects are ever instantiated 
- similarly to how all characteristics of an item intended to be manufactured is understood before 1st item hits the assembly line 
  - can create a class with fields & methods long before any objects that are members of this class are instantiated 
- 2 step process creates an object that is an instance of a class: 
  1. supply type and identifier 
  ``Employee someEmployee``
  2.  use __new__ operator to allocate memory needed for an object 
  
```java
    Employee someEmployee;
    someEmployee = new Employee();
``` 
- instead of using two statements, can declare & reserve memory for __someEmployee__ in one statement: 
```java 
Employee someEmployee = new Employee(); 
```
- in this statement: 
  - __Employee__ is the object's type (as well as its class)
  - __someEmployee__ is the name of the object 
    - becomes a __reference__ to an object  
  - equal sign --> assignment operator 
  - __new__ operator allocates a new, unused portion of computer memory for __someEmployee__ 
  - __Employee()__ method is a __constructor__ 
- __Constructor:__
  - special type of method that creates and initializes objects 
- name of the constructor is __always__ the same as the name of the class whose objects it constructs 
- after an object has been instantiated, its methods can be accessed using the object's identifier, a dot, and a method call 

### understanding data hiding 
- within the __DeclareTwoEmployees__ class, must use public methods __setEmpNum__ and __getEmpNum()__ to be able to set & retrieve the value of the __empNum__ field for each __Employee
because we can't access the private __empNum__ field directly 
- __ex.__ 
  - following statement __not__ allowed: 
  ``clerk.empNum = 789``
  -  __empNum__ could be accessed if it were made public, however doing so goes __against principle of data hiding__ 
    - __encapsulation__ 
    - __make data fields private by default__  
    - client app should only be able to access them only through public interfaces 
      - class's public methods 
- values set can be validated prior to be 'accepted' as valid fields of a class 
  - decision making within the methods of the class 
- even when a field has no data value requirements or restrictions, making data private & providing public __set__ & __get__ methods establishes a framework 
that makes such mods easier in the future 

## 4.5 understanding classes are data types 
- the classes we create become data types 
- aka __ADT__ (abstract data type )
  - type whose implementation is hidden & accessed through its public methods 
  - aka __programmer-defined type__ 
  - type not built into the lang
- a class is a __composite type__ - composed from smaller parts 
  - eight primitive types aren't composite 
    - aka _Scalar types_
- when creating an __ADT__ - should ask following: 
  - what should it be called?
    - Employee
  - what are its attributes?  
    - integer ID number, String last name, double salary 
  - what methods are needed by the class? 
    - method to assign values to data fields of an instance of this class 
  - any other methods? 
    - method to display data in an instance of this class 
  - any other methods? 
    - probably, but good enough to start 
- in same way a __type__ and an __identifier__ are specified when declaring a primitive type object, this process is also done when declaring an object from one of one's classes 
  - after each exists, can use them in similar ways 
__ex.__ [MethodsThatUseAnEmployee]

- Recall: 
    - when declaring a primitive variable or instantiating an object from a class, you provide both a type & an identifier 
    - an instantiated object can be passed into or returned from a method 
    - the address of an instantiated object can be assigned to a declared reference of the __same__ type 

## 4.6 creating & using constructors 
- when creating a class, such as __Employee__ & instantiating an object with such a statement like the following, we're calling the __Employee__ class constructor that is provided by 
default by Java compiler: 
  ``Employee chauffeur = new Employee();``
- a constructor establishes an object 
- a __default constructor__ requires no args 
  - created auto. by compiler for any class whenever one isn't written  
- when the prewritten, default constructor for the __Employee__ class is called, it establishes one __Employee__ object with the identifier provided 
  - the auto. supplied default constructor provides following specific initial values to an object's data fields: 
    - numeric fields set to 0
    - character fields set to Unicode '\u0000'
    - boolean fields set to false 
    - fields that are object refs (String fields) set to null 
- if we don't want each field in an object to hold these default values, can write own constructor 
- any constructor we write: 
  - must have same name as class it constructs 
  - cannot have a return type (not even void)
- normally, constructors declared __public__ so other classes can instantiate objects that belong to the class 
  - when you write a constructor for a class - no longer have access to the auto. created version 
  - __ex.__ 
    - if we wished for every __Employee__ object to have default starting salary of $800.00/wk, could write constructor for __Employee__ class as such:
      ```
      public Employee()  
      {
        empSalary = 800;
      }
      ```
- any java statement can be written in a constructor 
- constructor can be placed anywhere within inside the class, outside any other method 
- constructors typically placed with other methods 
  - often listed first since its first method used when an object is created 
- __never__ required to write a constructor for a class to make a class that compiles without errors 


### creating constructors with parameters 
- in addition to writing default contstructor for a class, can also write versions that receive parameters 
  - often used to initialize data fields for an object 

```java
/** the following shows the Employee class with a default constructor that initializes the empNum field  
 * constructor assigns 999 to the empNum of each potentially instantiated Employee object 
 * anytime an Employee object is created using a statement such as: 
 * Employee partTimeWorker = new Employee();
 * even if no other data assigning methods are used, this ensures that the partTimeWorker Employee, like all 
 * Employee objects, will have an initial empNum of 999
*/
public class Employee
{
    private int empNum;
    Employee()
    {
        empNum = 999;
    }
}
```
- we can also create __Employee__ objects in a way so that their initial __empNum__ values differ for each __Employee__ 
  - to accomplish this when the object is instantiated, can pass an employee # to the constructor: 
```java
/** the following shows the Employee class which contains a constructor that receives a parameter 
 * args to the constructor can be passed as: 
 * Employee = partTimeWorker = new Employee(991);
 * when the constructor executes, the integer within the constructor call is passed to Employee() as the parameter (num), 
 * which is assigned to the (empNum) field 
 */
public class Employee
{
    private int empNum;
    Employee(int num)
    {
        empNum = num;
    }
}
```
- when creating an __Employee__ class with a constructor in the manner shown above, every __Employee__ object created must have an __integer arg__ in its constructor call 
  - iotw, with this new version of the class, the following statement no longer works: 
  ``Employee partTimeWorker = new Employee()``
- after writing a constructor for a class, no logner receive the auto. provided default constructor 
  - if a class's only constructor requires an arg, must provide an arg for every object of the class that is created 
- in order to create a constructor with params & provide a default constructor as well, can __overload__ the constructors 
  - provides way to create objects with different initializing args, or none, as needed 
- __ex.__ 
  - in addition to using the provided constructor (above) 
  - can create 2nd constructor for the __Employee__ class
  - when using this class to create an __Employee__ object, have option of creating the object either with or without an initial __empNum__ value 

```java
public class Employee
{
    private int empNum;
    Employee(int num)
    {
        empNum = num;
    }
    Employee()
    {
        empNum = 999;
    }
}
```
- when an __Employee__ object is created with the statement: 
  - ``aWorker = new Employee()``
  - constructor with no params is called, & __Employee__ object receives an initial __empNum__value of 999
- when an __Employee__ object with is created with the statement: 
  - ``Employee anotherWorker = new Employee(7677);`` 
  - constructor version that requires an integer is used, & the __anotherWorker Employee__ receives an initial __empNum__ of 7677
- can use constructor args to initialize field values
  - can also be used for any other purpose 
    - ex. could use presence/absence of an arg simply to determine which of two possible constructors to all
      - yet not make use of the arg within the constructor 
    - as long as param lists differ, the constructors are not ambiguous 

__Note:__ 
    - a default constructor is one that takes no args 
    - the constructor that is created auto. when one is not written is a default constructor, but so is one that is written to take no args 


## 4.7 the "this" reference  
- when creating classes, they can become large very quickly 
  - besides data fields, can have many methods 
    - including several overloaded versions 
- when instantiating an object from a class, memory is reserved for each instance field in the class 
- __ex.__ 
  - if class contains 20 data fields, when creating one object from such class, enough memory is reserved to hold the 20 field values for that object 
  - when creating 200 objects of the same class, the computer reserves enough memory for 4000 data fields 
    - 20 fields for each of the 200 objects 
    - in many apps, computer memory reqs. can become substantial 
      - fortunately, objects can __share__ some variables & methods 
- __recall:__ 
  - if a field or method name is preceded by keyword __static__ when its declared, only one field or method exists, no mater how many objects are instantiated 
  - iotw - if a field is __static__, only one copy of the field exists 
    - all objects created have the same value for that field
- frequently want each instantiation of a class to have its own copy of each data field so that each object can hold unique values 
  - __ex.__
    - if an __Employee__ class contains fields for: 
      - employee number 
      - name 
      - salary 
    - every individual __Employee__ object needs a unique number, name and salary value 
- fields that hold unique values for each object are not defined as __static__ 


