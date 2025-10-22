## fitness tracker 

- objective: write a program to help track fitness data 
    - write a java class that contains several methods,
    property getters/setters, logic to simulate a fitness tracker 
    - class should store & track user' s: 
        - daily steps
        - distance walked
        - calories burned 
        - heart rate 
    - provide various methods to update, reset, retrieve data 

### requirements 
- min. 2 files 
    - 1: main method 
        - acts as a test driver 
        - main job: 
            - create an instance (perhaps several) of the FitnessTracker object
            - call its methods & test the FitnessTracker class 
            - print strings to console reporting on operations 
    - 2(+): implement FitnessTracker class 
        - public class name: FitnessTracker 
        - public constants: 
            - final KILOMETERS_PER_STEP = 0.000762F
            - final CALORIES_PER_STEP = 0.04F
            - where needed elsewhere, refer to these symbols rather than the decimal values  
- public properties (with getters & setters):
    - private/protected variable (data member) & public getter/setter methods for each property
        - name: user's name (String)
        - dailySteps: number of steps taken (int)
        - distanceWalked: distance in kilometers (double) 
        - caloriesBurned: number of calories burned (double) 
        - heartRate: current heart rate (int) 
        - constructors:  
        - default constructor that initializes all values to zero (except for name, which is any empty string) 
        il 
        - parameterized constructor that accepts values for all fields 
- methods: 
    - each will be called at least once, likely several times in main() 
    1. __addSteps(int steps)__ adds the given number of steps to current total
    2. __calculateDistance()__ calculates distance walked in km
        - KILOMETERS_PER_STEP constant used here 
        - update __distanceWalked__ property accordingly
    3. __calculateCalories()__ calculates number of calories burned 
        - CALORIES_PER_STEP constant used here 
        - update __caloriesBurned__ property accordingly
    4. __updateHeartRate(int newHeartRate)__ updates current heart rate 
    5. __resetDailyStats()__ resets __dailySteps__, __distanceWalked__, __caloriesBurned__ to zero 
    6. __toString()__ gets a summary of the user's daily stats as a string, including name, steps taken, distance walked, calories burned, current heart rate 
    7. add a method __setGoalSteps(int goalSteps)__ that sets a goal for num of steps + a method __checkGoal()__ that checks if the user has met their daily step goal and prints a congratulatory message if they have 

- document code appropriately using Javadoc

## to turn in
- .java source files for main class & FitnessTracker class 
- screenshot of FitnessTracker class javadoc info (index.html) 
    - view must include info about classes created
    - name, class, project info 


