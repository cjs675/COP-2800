/**
 * FitnessTracker.java
 * Author: Chris Silva
 * Class: COP-2800
 * Assignment: Module 4 - Fitness Tracker
 * Description: This program represents a Fitness tracker which monitors daily activity
 * Tracks:
 * Steps, distance walked, calories burned, heart rate
 * Provides:
 * Methods to track progress, reset daily statistics and check if goals have been met
 */

public class FitnessTracker
{
    // field declarations
    private String name;
    private int dailySteps;
    private double distanceWalked;
    private double calsBurned;
    private int heartRate;
    private int stepsGoal;

    /** Conversion factor: km's per step */
    public static final float KILOMETERS_PER_STEP = 0.000762F;
    /** Conversion factor: cals per step */
    public static final float CALORIES_PER_STEP =  0.04F;

    /**
     * Gets the user's name
     * @return the user's name
     */
    public String getName() {return name;}

    /**
     * Sets the user's name
     * @param name the name set for this user
     */
    public void setName(String name) { this.name = name; }

    /**
     * Gets the daily step count
     * @return the number of steps taken today
     */
    public int getDailySteps() { return dailySteps; }

    /**
     * Sets the daily step count
     * @param dailySteps the number of steps set
     */
    public void setDailySteps(int dailySteps) { this.dailySteps = dailySteps; }

    /**
     * Gets the distance walked
     * @return the distance walked
     */
    public double getDistanceWalked() { return distanceWalked; }

    /**
     * Sets the distance walked
     * @param distanceWalked sets the distance walked for this user
     */
    public void setDistanceWalked(double distanceWalked)
    {
        this.distanceWalked = distanceWalked;
    }

    /**
     * Gets the calories burned
     * @return the calories burned
     */
    public double getCalsBurned() { return calsBurned; }

    /**
     * Sets the calories burned
     * @param calsBurned the number of calories burned
     */
    public void setCalsBurned(double calsBurned)
    {
        this.calsBurned = calsBurned;
    }

    /**
     * Gets the current heart rate
     * @return the current heart rate
     */
    public int getHeartRate() { return heartRate; }

    /**
     * Sets the current heart rate
     * @param heartRate the user's heart rate in beats per min. (BPM)
     */
    public void setHeartRate(int heartRate) { this.heartRate = heartRate; }

    /**
     * Explicit default constructor that sets all values within FitnessTracker to zero
     * Initializes name as an empty string and all numeric fields to zero
     */
    public FitnessTracker()
    {
       name = "";
    }

    /**
     * Parameterized constructor that accepts values for all fields
     * Initializes values for all parameters
     * @param name the user's name
     * @param dailySteps the initial step count
     * @param distanceWalked the initial distance walked in kilometers
     * @param calsBurned the initial calories burned
     * @param heartRate the initial heart rate
     */
    public FitnessTracker(String name, int dailySteps, double distanceWalked, double calsBurned, int heartRate)
    {
        this.name = name;
        this.dailySteps = dailySteps;
        this.distanceWalked = distanceWalked;
        this.calsBurned = calsBurned;
        this.heartRate = heartRate;
    }

    /**
     * Adds the given number of steps to the current total
     * @param steps the number of steps to add to the daily total
     */
    public void addSteps(int steps)
    {
        this.dailySteps += steps;
    }

    /**
     * Calculates distance walked in kilometers
     * Updates distanceWalked property
     * @return the calculated distance in kilometers
     */
    public double calculateDistance()
    {
       distanceWalked = dailySteps * KILOMETERS_PER_STEP;
       return distanceWalked;
    }

    /**
     * Calculates calories burned based off the cal/step constant
     * @return the calculated calories burned
     */
    public double calculateCalories()
    {
     calsBurned = dailySteps * CALORIES_PER_STEP;
     return calsBurned;
    }

    /**
     * Updates current heart rate
     * @param newHeartRate the new heart rate value in bpm (beats per minute)
     */
    public void updateHeartRate(int newHeartRate)
    {
        this.heartRate = newHeartRate;
    }

    /**
     *  Resets dailySteps, distanceWalked, caloriesBurned to zero
     */
    public void resetDailyStats()
    {
        this.dailySteps = 0;
        this.distanceWalked = 0;
        this.calsBurned = 0;
    }

    /**
     * Returns a summary of a user's daily fitness-related stats
     * @return a formatting String with name, steps taken, distance walked, calories burned & current heart rate
     */
    public String toString()
    {
        return "\nUser: " + name + "\n" +
                "Steps: " + dailySteps + "\n" +
                "Distance walked: " + distanceWalked + "km\n" +
                "Calories burned: " + calsBurned + "\n" +
                "Heart rate: " + heartRate + "bpm";
    }

    /**
     * Sets a goal for a number of steps
     * @param goalSteps the target number of steps set for each user
     */
    public void setGoalSteps(int goalSteps)
    {
        this.stepsGoal = goalSteps;
    }

    /**
     * Checks if a user's daily step goal has been met
     * Prints a congratulatory message if the current steps walked are greater than the goal.
     * Prints the number of remaining steps if goal is not yet met
     */
    public void checkGoal()
    {
      double stepDifference = stepsGoal - dailySteps;

        if (dailySteps >= stepsGoal)
            System.out.println(
                            "\n|----------------Congratulations " + name + "!--------------->" +
                            "\n|------------Daily step goal has been met------------->"
            );
        else
            System.out.println(
                            "\nKeep it moving " + name + " !" +
                            "\nYou are: " + stepDifference +
                            " steps away from achieving your daily step goal"
            );
    }
}
