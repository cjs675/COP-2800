/* FitnessTracker.java
 * Author: Chris Silva
 * Assignment: Module 4 - Fitness Tracker
 * Description: This program represents a Fitness tracker which monitors daily activity
 * Tracks:
 * steps, distance walked, calories burned, heart rate
 * Provides:
 * methods to track progress, reset daily statistics
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

    public String getName() {return name;}

    public void setName(String name) { this.name = name; }

    public double getDailySteps() { return dailySteps; }

    public void setDailySteps(int dailySteps) { this.dailySteps = dailySteps; }

    public double getDistanceWalked() { return distanceWalked; }

    public void setDistanceWalked(double distanceWalked)
    {
        this.distanceWalked = distanceWalked;
    }

    public double getCalsBurned() { return calsBurned; }

    public void setCalsBurned(double calsBurned)
    {
        this.calsBurned = calsBurned;
    }

    public int getHeartRate() { return heartRate; }

    public void setHeartRate(int heartRate) { this.heartRate = heartRate; }

    // Explicit default constructor which sets all values null
    // name is initialized to an empty string
    // instance variables get initialized to zero by default
    public FitnessTracker()
    {
       name = "";
    }

    // parameterized constructor that accepts values for all fields
    // initializes all field values
    public FitnessTracker(String name, int dailySteps, double distanceWalked, double calsBurned, int heartRate)
    {
        this.name = name;
        this.dailySteps = dailySteps;
        this.distanceWalked = distanceWalked;
        this.calsBurned = calsBurned;
        this.heartRate = heartRate;
    }

// methods

    /**
     * Adds the given number of steps to the current total
     * @param steps
     */
    public void addSteps(int steps)
    {
        this.dailySteps += steps;
    }

    /**
     * Calculates distance walked in kilometers
     * Updates distanceWalked property
     */
    public double calculateDistance()
    {
       distanceWalked = dailySteps * KILOMETERS_PER_STEP;
       return distanceWalked;
    }

    /**
     * Calculates calories burned based off the cal/step constant
     * @return
     */
    public double calculateCalories()
    {
     calsBurned = dailySteps * CALORIES_PER_STEP;
     return calsBurned;
    }

    /**
     * Updates current heart rate
     * @param newHeartRate
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
     * @param goalSteps
     */
    public void setGoalSteps(int goalSteps)
    {
        this.stepsGoal = goalSteps;
    }

    /**
     * Checks if a user's daily step goal has been met
     */
    public void checkGoal()
    {
      double stepDifference = stepsGoal - dailySteps;

        if (dailySteps >= stepsGoal)
            System.out.println(
                            "\n|----------------Congratulations " + name + "!---------------|" +
                            "\n|-------------Daily step goal has been met-------------|"
            );
        else
            System.out.println(
                            "\nKeep it moving " + name + " !" +
                            "\nYou are: " + stepDifference +
                            " steps away from achieving your daily step goal"
            );
    }
}
