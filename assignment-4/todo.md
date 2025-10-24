## module 5: good day evaluator 

- write program to help decide if its a good day or not 
- build simple __"GoodDay"__ Class 
    - create java class that contains several methods, property getters/setters 
    - practice implementing diff forms of selection control structures 
- class should store variety of factors that might contribute to having a good/bad day 
    - will also provide various methods to update, reset, retrieve data s

## Requirements
- (2+) files 
    - __1st -> main method__ 
        - act as test driver 
        - create instance (several) of GoodDay object
        - call its methods 
        - test GoodDay class 
        - print strings to console reporting ops 
    - __2nd -> implements GoodDay class__ 
        - public properties (with getters & setters) 
            - will have private/protected variable (data member) & public getter/setter methods for __each__ property created 
        - __properties (for starters)__
            - temperature: current temperature (int) 
            - humidity: current humidty (double) 
            - isHomeworkDone: whether all homework is completed or not (Boolean) 
            - dinnerMeal: what you plan to have for dinner tonight (String) 
        - __constructors__
            - default constructor that initializes all values to zero 
            - parameterized constructor that accepts values for the fields declared within the GoodDay class 
        - __methods__
            - to be called at least once, likely severla times in _main_
            1. __isTodayGood()__ 
                - returns if today is good overall, or false otherwise
                - determined by all factors considered 
            2. __isWeatherGood()__
                - returns __true__ if weather is good, false otherwise
                - calculated based on values of properties of the object
            3. __toString()__ 
                - returns description of how good/bad/to what degree based on value of other properties 
        - can create own properties and implement logic to calculate goodness or badness 
        - __required__ forms of selection: 
            - nested if 
            - compound if 
            - switch (old or enhanced) 

        - code to be appropriately commented using Javadoc  
    
    ### turn in 
    - .java source files 
        - Main.java 
        - GoodDay.java 
    - Javadoc index.html screenshot 
