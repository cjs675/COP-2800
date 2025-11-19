# Card shuffler 

- write simple program that creates & shuffles a deck of cards 
- contains severla methods, property getter/setters & logic to simulate a deck of cards 
- will use composition by having an additional card class 

### card class
- should store & track __rank__ and __suit__ of a playing card  
- once set --> should be __readonly__ 
    (allow a getter but __no__ setter) 
- will provide various methods to update, reset, & retrieve the data 


### requirements 
- 3 files (src.Main4.java, Deck.java, Cards.java)
- main acts as test driver 
    - create instances, perhaps several of the Deck object 
    - call its (Deck object's) methodss, test the class 
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
            - 
- requires using an array 
- code should be appropriately commented using Javadoc 
  - proper naming conventions & other programming standards to be followed 
- 5 deliverables: 
  - .java source files for each class 
  - generate javadoc & turn in screenshot of Deck & Card classes javadoc 