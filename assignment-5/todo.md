# Card shuffler 

- write simple program that creates & shuffles a deck of cards 
- contains several methods, property getter/setters & logic to simulate a deck of cards 
- will use composition by having an additional card class 

### card class
- should store & track __rank__ and __suit__ of a playing card  
- once set --> should be __readonly__ 
    (allow a getter but __no__ setter) 
- will provide various methods to update, reset, & retrieve the data 


### requirements 
- 3 files (Main.java, Deck.java, Cards.java)
- main acts as test driver 
    - create instances, perhaps several of the Deck object 
    - call its (Deck object's) methods, test the class 
    - test instances of the Card class to test that class and __fill the deck object with Card objects__ 
    - will also serve to accept any user input and print strings to the console reporting on the operations 
- deck file implements deck class 
- Cards file implements the cards class

- card & deck objects should not allow user input or print statements in them 



### class requirements 
- public class name
    - __Deck__ 
- constructors
    - default constructor that produces an empty Deck (no cards in it) 
- public properties (with getters &/or setters) 
    - will have private/protected variable (data member) 
    - public getter/setter methods for potentially each property  
      - __Cards__ - the array of cards (Card[])
- Methods
  - will call each of these at least once, likely several times in main
    1. __fill()__ 
        - empty the array of cards & refill wih new set of cards
    2. __shuffle()__ 
       - using RNG, think of clever way to rearrange the cards in the array so they are in random order 
       - but still only have one of each card 
    3. __toString()__ 
       - create a string that has two characters for each card: 
         - one for each rank 
         - one for each suit 
         - order they currently appear in the array
- public class name 
  - __Card__
- constructors
  - default constructor that produces an empty Card (no rank or value)
  - parameterized constructor that takes a rank and value and initializes the object with those values 
- public properties (with getters and/or setters)
  - will have private variable and public getter/setter methods for potentially each property
- __Rank:__ the card's rank from ace to king 
- __Suit:__ the card's suit (clubs, hearts, diamonds, spades) 

- Methods 
    - will be called at least once, likely several times in main 
    1. __toString()__  
        - empty the array of cards and refill it with a new set of cards 
    2. __compare()__ 
        - accept two card params, and using the rank + suit, determine which card is greater or lesser 
    3. __toString()__ 
        - create a string that returns two characters
            - 1 for the rank 
            - 1 for the suit 
- requires using an array 
- code should be appropriately commented using Javadoc 
  - proper naming conventions & other programming standards to be followed 
- 5 deliverables: 
  - .java source files for each class 
  - generate javadoc & turn in screenshot of Deck & Card classes javadoc 