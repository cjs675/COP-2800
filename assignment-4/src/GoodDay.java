package src;

/**
 * GoodDay.java
 * Author: Chris Silva
 * Assignment: Module 5 - Good Day Evaluator
 * Description: This program represents a conditional evaluator which determines the state of ones day, given a number of factors.
 */
public class GoodDay
{
    // field declarations
    private int temperature;
    private Double humidity;
    private boolean isWorkoutDone;
    private String workout;
    private boolean isHomeworkDone;
    private String dinnerMeal;

    /**
     * Gets the current temperature.
     *
     * @return the current temperature
     */
    public int getTemperature()
    {
        return temperature;
    }

    /**
     * Sets the current temperature.
     *
     * @param temp the temperature to set
     */
    public void setTemperature(int temp)
    {
        this.temperature = temp;
    }

    /**
     * Gets the current humidity.
     *
     * @return the current humidity
     */
    public Double getHumidity()
    {
        return humidity;
    }

    /**
     * Sets the current humidity.
     *
     * @param humidity the current humidity to set
     */
    public void setHumidity(Double humidity)
    {
        this.humidity = humidity;
    }

    /**
     * Determines whether a workout has been done.
     *
     * @return true if workout done - false otherwise
     */
    public boolean getWorkoutStatus()
    {
        return isWorkoutDone;
    }

    /**
     * Sets the current workout status.
     *
     * @param isWorkoutDone is true if workout has been done, else, false
     */
    public void setWorkoutStatus(boolean isWorkoutDone)
    {
        this.isWorkoutDone = isWorkoutDone;
    }

    /**
     * Gets the workout that was done.
     *
     * @return the workout that has been completed
     */
    public String getWorkoutDone()
    {
        return workout;
    }

    /**
     * Sets the workout that has been completed.
     *
     * @param workout the workout that has been done
     */
    public void setWorkoutDone(String workout)
    {
        this.workout = workout;
    }

    /**
     * Determines whether all homework has been completed.
     *
     * @return true if homework completed - false otherwise
     */
    public boolean isHomeworkDone()
    {
        return isHomeworkDone;
    }

    /**
     * Sets a boolean to determine homework completion status.
     *
     * @param isHomeworkDone true if homework is done, else, false
     */
    public void setHomeworkDone(boolean isHomeworkDone)
    {
        this.isHomeworkDone = isHomeworkDone;
    }

    /**
     * Gets a dinner meal as a String.
     *
     * @return the dinner meal as a String
     */
    public String getDinnerMeal()
    {
        return dinnerMeal;
    }

    /**
     * Sets the dinner meal.
     *
     * @param dinnerMeal the dinner meal to set
     */
    public void setDinnerMeal(String dinnerMeal)
    {
        this.dinnerMeal = dinnerMeal;
    }

    /**
     * Explicit default constructor that sets all numeric values within GoodDay to zero
     * and String values to null.
     */
    public GoodDay()
    {
        dinnerMeal = null;
        workout = null;
    }

    /**
     * Parameterized constructor which accepts values for all fields.
     * Initializes values for all parameters.
     *
     * @param temperature the current temperature
     * @param humidity the current humidity
     * @param isWorkoutDone whether a workout has been completed
     * @param workout the workout that is completed
     * @param isHomeworkDone whether all homework has been completed
     * @param dinnerMeal a dinner meal to be had
     */
    public GoodDay(int temperature, double humidity, boolean isWorkoutDone, String workout, boolean isHomeworkDone, String dinnerMeal)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.isWorkoutDone = isWorkoutDone;
        this.workout = workout;
        this.isHomeworkDone = isHomeworkDone;
        this.dinnerMeal = dinnerMeal;
    }

    /**
     * Determines whether the current weather conditions are considered good,
     * with humidity being less than 50% and temperatures from 60 and up
     * to 85 being used to define "good" weather.
     *
     * @return true if humidity < 50% and temperature is 60-85 degrees,
     *         false otherwise
     */
    public boolean isWeatherGood()
    {
        return (humidity < 50.0 && temperature <= 85 && temperature >= 60);
    }

    /**
     * Returns a formatted string representing the GoodDay object.
     * Includes all relevant factors: temperature, humidity, workout
     * and homework completion status, as well as dinner plans.
     *
     * @return a multi-line string displaying all fields of the GoodDay object
     * with descriptive labels
     */
    public String toString()
    {
        return "\nThe current temperature is: " + temperature +
                "\nThe current humidity is: " + humidity +
                "\nHas a workout been completed? " + isWorkoutDone +
                "\nWorkout completed: " + getWorkoutDone() +
                "\nIs homework done? " + isHomeworkDone +
                "\nFor dinner tonight we have: " + dinnerMeal;
    }

    /**
     * Determines if a valid workout has been completed.
     * A workout is considered valid if it is one of two permissible values:
     * "Strength training" or "Cardio".
     *
     * @return true if a valid workout (Strength training or Cardio)
     *         has been completed, false if workout is null or not
     *         one of the permissible workouts
     */
    public boolean workoutCompleted()
    {
        if (workout == null)
        {
            return false;
        }
        switch(workout)
        {
            case "Strength training", "Cardio":
                return true;
            default:
                return false;
        }
    }

    /**
     * Calculates a "score" for the day which is used in determining
     * if a day is good. The score is incremented with each subsequent
     * condition that is met.
     *
     * Base points are awarded for good weather, a valid workout,
     * completed homework, and a planned dinner.
     *
     * Bonus points are awarded for "perfect" weather (temperature 70-75
     * degrees and humidity less than 50.0%), and both a workout and homework
     * having been completed.
     *
     * @return an integer value used to keep the "score" of the day's
     *         completed tasks, ranging from 0 to 6
     */
    public int scoreCount()
    {
        int count = 0;

        if (isWeatherGood())
        {
            count++;
            if (temperature >= 70 && temperature <= 75 && humidity < 50.0)
            {
                // "Bonus" points for perfect weather
                // (70-75 degrees, humidity < 50.0%)
                count++;
            }
        }
        if (workoutCompleted())
        {
            count++;
            if ((workout.equals("Cardio") || workout.equals("Strength training")) && isHomeworkDone)
            {
                // Bonus points for a productive day including finishing homework and working out
                count++;
            }
        }
        if (isHomeworkDone) count++;
        if (dinnerMeal != null) count++;
        return count;
    }

    /**
     * Calculates and formats the score of the current day as a fraction.
     * The score is based off the number of relevant factors which have
     * been met.
     * (good weather, completed homework and workout, planned dinner)
     *
     * @return a String message displaying the current score out of the
     *         max possible score of 4, formatted as "score/maxScore"
     *
     */
    public String getDayScore()
    {
        int score = scoreCount();
        int maxScore = 4;
        return "\nToday's Day Score is: " + score + "/" + maxScore;
    }

    /**
     * Resets the day's values.
     *
     * A day is considered reset when all relevant conditions are false
     * or null, and numeric fields set to zero.
     */
    public void resetDay()
    {
        this.temperature = 0;
        this.humidity = 0.0;
        this.isWorkoutDone = false;
        this.workout = null;
        this.isHomeworkDone = false;
        this.dinnerMeal = null;
    }

    /**
     * Evaluates whether today is a good day based on multiple factors.
     * Requirements:
     * Good weather conditions, completed homework and workout, along with a selected dinner meal.
     *
     * @return a String message indicating whether today is a good day containing details
     *          on relevant factors, or a message of encouragement if the conditions
     *          are not met
     */
    public String isTodayGood()
    {
        if (!isWeatherGood())
        {
            return "\nBrighter days ahead, my friend";
        }
        if (!isWorkoutDone)
        {
            return "\nGet moving my friend!";
        }
        if (!isHomeworkDone)
        {
            return "\nGet to studying my friend!";
        }
        if (dinnerMeal == null)
        {
            return "\nMake sure to get some dinner!";
        }
            return  "\nWith a temperature of: " + temperature + "degrees" +
                    "\nA humidity of: " + humidity + "%" +
                    "\n" + dinnerMeal + " for dinner" +
                    "\n" + getWorkoutDone() + " done" +
                    "\nand homework complete:" +
                    "\n\nIt's safe to say today is a good day";
        }
    }

