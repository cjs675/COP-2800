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
    int temperature;
    Double humidity;
    boolean isWorkoutDone;
    boolean isHomeworkDone;
    String dinnerMeal;

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
     * Determines whether a workout has been done
     *
     * @return true if homework done - false otherwise
     */
    public boolean getWorkoutDone()
    {
        return isWorkoutDone;
    }

    /**
     * Sets the current workout status
     *
     * @param isWorkoutDone is true if workout has been done, else, false
     */
    public void setWorkoutDone(boolean isWorkoutDone)
    {
        this.isWorkoutDone = isHomeworkDone;
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
     * Sets the dinner meal
     *
     * @param dinnerMeal the dinner meal to set
     */
    public void setDinnerMeal(String dinnerMeal)
    {
        this.dinnerMeal = dinnerMeal;
    }

    /**
     * Explicit default constructor that sets all values within GoodDay to zero
     * Initializes dinnerMeal as an empty string, leaving all numeric fields null
     */
    public GoodDay()
    {
        dinnerMeal = "";
    }

    /**
     * Parameterized constructor which accepts values for all fields
     * Initializes values for all parameters
     *
     * @param temperature    the current temperature
     * @param humidity the current humidity
     * @param isWorkoutDone whether a workout has been completed
     * @param isHomeworkDone whether all homework is complete
     * @param dinnerMeal     a dinner meal to be had
     */
    public GoodDay(int temperature, double humidity,boolean isWorkoutDone, boolean isHomeworkDone, String dinnerMeal)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.isWorkoutDone = isWorkoutDone;
        this.isHomeworkDone = isHomeworkDone;
        this.dinnerMeal = dinnerMeal;
    }

    // methods
    public boolean isWeatherGood()
    {
        boolean goodTemp;

        if (temperature == 70 && humidity == 50.0)
        {
            goodTemp = true;
            System.out.println("Amazing weather we're having today!");
        } else if (temperature <= 80 && humidity < 60)
        {
            goodTemp = true;
            System.out.println("Nice weather today!");
        } else
{
            goodTemp = false;
            System.out.println("Lets hope mother nature is more forgiving tomorrow.");
        }
        return goodTemp;
    }

    public String toString()
    {
        return "\nThe current temperature is: " + temperature +
                "\nThe current humidity is: " + humidity +
                "\nHas a workout been completed? " + isWorkoutDone +
                "\nIs homework done? " + isHomeworkDone +
                "\nFor dinner tonight we have: " + dinnerMeal;
    }

    // public boolean isTodayGood()
    // check if temp is good
    // check if dinner meal
    // null -> bad
    // check homework done
    public String isTodayGood()
    {
        if (!isWeatherGood() && !isHomeworkDone && dinnerMeal == null)
        {
            System.out.println("Brighter days ahead, my friend");
        }
        return  "\nWith a humidity of: " +
                humidity + " and temperature at: " +
                temperature + ", plus " + dinnerMeal + " for dinner" +
                " and your homework done: \nits safe to say today is a good day";

    }

}
