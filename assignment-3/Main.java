/**
 * src.Main4.java
 * Author: Chris Silva
 * Class: COP-2800
 * Assignment: Module 4 - Fitness Tracker
 * Description: Test driver for FitnessTracker class
 *
 */

public class Main
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

        user_3.setName("Steve");
        user_3.setDailySteps(19800);
        user_3.setDistanceWalked(14);
        user_3.setCalsBurned(3932);
        user_3.setHeartRate(138);

        // Summary of initial user stats
        System.out.println("\n|-------------------INITIAL STATISTICS ------------------>");
        System.out.println(user_1);
        System.out.println(user_2.toString());
        System.out.println(user_3.toString());

        // Updates
        user_1.addSteps(3200);
        user_1.updateHeartRate(140);
        user_1.setGoalSteps(25000);

        user_2.addSteps(6000);
        user_2.updateHeartRate(162);
        user_2.setGoalSteps(10000);

        user_3.addSteps(1250);
        user_3.updateHeartRate(151);
        user_3.setGoalSteps(18000);

        // Summary of stats after updates
        System.out.println("\n|-------------------UPDATED STATISTICS------------------>");
        System.out.println(user_1.toString());
        System.out.println(user_2.toString());
        System.out.println(user_3.toString());

        // Goal checks
        System.out.println("\n|---------------------GOAL CHECKS----------------------->");
        user_1.checkGoal();
        user_2.checkGoal();
        user_3.checkGoal();

        // User statistic reset
        user_1.resetDailyStats();
        user_2.resetDailyStats();
        user_3.resetDailyStats();

        // Summary of stats after reset
        System.out.println("\n|-------------------STATISTICS RESET------------------>");
        System.out.println(user_1.toString());
        System.out.println(user_2.toString());
        System.out.println(user_3.toString());
    }
}
