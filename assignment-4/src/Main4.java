package src;


public class Main4
{
    public static void main(String[] args)
    {
        // object construction
        GoodDay user_1 = new GoodDay();

        // object field initialization
        user_1.setTemperature(73);
        user_1.setHumidity(42.1);
        user_1.setWorkoutStatus(true);
        user_1.setWorkoutDone("Cardio");
        user_1.setHomeworkDone(true);
        user_1.setDinnerMeal("Pork chops and potato wedges");

        System.out.println("\n[  User 1  ]\n" + user_1.toString());
        System.out.println("\n\n\t\t<-------------------- Evaluation ---------------------->");

        System.out.println("\n[  User 1  ]\n" + user_1.isTodayGood());
        System.out.println(user_1.getDayScore());

        user_1.resetDay();

        // Summary of stats and the day after reset
        System.out.println("\n\n\t\t<------------- Evaluation (after reset) --------------->");
        System.out.println("\n[  User 1  ]\n" + user_1.toString());
        System.out.println("\n[  User 1  ]\n" + user_1.isTodayGood());
        System.out.println(user_1.getDayScore());

    }
}
