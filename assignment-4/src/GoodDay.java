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
    boolean isHomeworkDone;
    String dinnerMeal;

    /**
     * Gets the current temperature.
     *
     * @return the current temperature
     */
    public int getTemperature() { return temperature; }

    /**
     * Sets the current temperature.
     *
     * @param temp the temperature to set
     */
    public void setTemperature(int temp) { this.temperature = temp; }

    /**
     * Gets the current humidity.
     *
     * @return the current humidity
     */
    public Double getHumidity() { return humidity; }

    /**
     * Sets the current humidity.
     *
     * @param humidity the current humidity to set
     */
    public void setHumidity(Double humidity) { this.humidity = humidity; }

    /**
     * Determines whether all homework has been completed.
     *
     * @return true if homework completed - false otherwise
     */
    public boolean isHomeworkDone() { return isHomeworkDone; }

    /**
     * Sets a boolean to determine homework completion status.
     *
     * @param isHomeworkDone true if homework is done, else, false
     */
    public void setHomeworkDone(boolean isHomeworkDone) { this.isHomeworkDone = isHomeworkDone; }

    /**
     * Gets a dinner meal as a String.
     *
     * @return the dinner meal as a String
     */
    public String getDinnerMeal() {return dinnerMeal; }

    /**
     * Sets the dinner meal
     *
     * @param dinnerMeal the dinner meal to set
     */
    public void setDinnerMeal(String dinnerMeal) { this.dinnerMeal = dinnerMeal; }

    /**
     * Explicit default constructor that sets all values within GoodDay to zero
     * Initializes dinnerMeal as an empty string and all numeric fields to zero
     */
    public GoodDay()
    {
        dinnerMeal = "";
    }

    /**
     * Parameterized constructor which accepts values for all fields
     * Initializes values for all parameters
     *
     * @param temperature the current temperature
     * @param humidity the current humidity
     * @param isHomeworkDone whether all homework is completed
     * @param dinnerMeal a dinner meal to be had
     */
    public GoodDay(int temperature, double humidity, boolean isHomeworkDone, String dinnerMeal)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.isHomeworkDone = isHomeworkDone;
        this.dinnerMeal = dinnerMeal;
    }
}
