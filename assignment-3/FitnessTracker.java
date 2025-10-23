public class FitnessTracker
{
<<<<<<< HEAD
    // field declarations
    private String name;
    private double dailySteps;
    private int distanceWalked;
    private int calsBurned;
    private short heartRate;

    final float KILOMETERS_PER_STEP = 0.000762F;
    final float CALORIES_PER_STEP =  0.04F;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    // explicit default constructor which sets all values null
    public FitnessTracker()
    {
       name = "";
       dailySteps = 0;
       distanceWalked = 0;
       calsBurned = 0;
       heartRate = 0;
    }
    // parameterized constructor that accepts values for all fields
    public FitnessTracker(String name, double dailySteps, int distanceWalked, int calsBurned, short heartRate)
    {

    }

=======
    
>>>>>>> e0f1c770584c976950c46575aa9d232448ceaa09

}
