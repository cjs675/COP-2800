public class main
{
    public static void main(String[] args)
    {
        // object construction
        FitnessTracker user_1 = new FitnessTracker();
        FitnessTracker user_2 = new FitnessTracker();
        FitnessTracker user_3 = new FitnessTracker();

        // object field initialization
        user_1.setName("Jeff");
        user_1.setDailySteps(15500);
        user_1.setDistanceWalked(12);
        user_1.setCalsBurned(3500);
        user_1.setHeartRate(120);

        user_2.setName("Jensen");
        user_2.setDailySteps(21285);
        user_2.setDistanceWalked(16);
        user_2.setCalsBurned(4177);
        user_2.setHeartRate(145);

        // Summary of initial user stats
        System.out.println(user_1.toString());
        System.out.println(user_2.toString());

        // Updates
        user_1.addSteps(3200);
        user_2.addSteps(6000);
        user_1.updateHeartRate(140);
        user_2.updateHeartRate(162);
        user_1.setGoalSteps(25000);
        user_2.setGoalSteps(10000);

        System.out.println(
                "\nUpdated steps for "
                        + user_1.getName()
                        + "\t" + user_1.getDailySteps()
                        + "\nUpdated steps for: "
                        + user_2.getName()
                        + "\t" + user_2.getDailySteps());
        System.out.println(
                "\nUpdated heart rate for "
                        + user_1.getName()
                        + "\t" + user_1.getHeartRate()
                        +  "\nUpdated heart rate for: "
                        + user_2.getName()
                        + "\t" + user_2.getHeartRate()
        );
        System.out.println(
                "\nDistance in KM walked by: " + user_1.getName()
                        + "\t" + user_1.calculateDistance());

        System.out.println(
                "\nDistance in KM walked by: " + user_2.getName() + "\t"
                        + user_2.calculateDistance());
        System.out.println(
                "\nCalories burned by: "
                        + user_1.getName()
                        + " after updated steps:\t" +  user_1.calculateCalories());
        System.out.println(
                "\nCalories burned by: "
                        + user_2.getName()
                        + " after updated steps:\t" + user_2.calculateCalories());
        // Goal checks
        user_1.checkGoal();
        user_2.checkGoal();

        // User statistic reset
        user_1.resetDailyStats();
        user_2.resetDailyStats();

        System.out.println(
                "\nStatistics for users after reset: \n"
                    + "\n\t" + user_1.getName()
                    + "\n" + "Daily Steps: " + user_1.getDailySteps()
                    + "\n" + "Distance walked: " + user_1.getDistanceWalked()
                    + "\n" + "Calories burned: " + user_1.getCalsBurned()
                    + "\n\t" + user_2.getName()
                    + "\n" + "Daily Steps: " + user_2.getDailySteps()
                    + "\n" + "Distance walked: " + user_2.getDistanceWalked()
                    + "\n" + "Calories burned: " + user_2.getCalsBurned()
        );

    }
}
