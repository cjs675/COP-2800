package src;

public class Main
{
    public static void main(String[] args)
    {
        // object construction
        GoodDay user_1 = new GoodDay();
        GoodDay user_2 = new GoodDay();
        GoodDay user_3 = new GoodDay();

        // object field initialization
        user_1.setTemperature(102);
        user_1.setHumidity(68.7);
        user_1.setWorkoutDone(true);
        user_1.setHomeworkDone(false);
        user_1.setDinnerMeal("pork chops");

        user_2.setTemperature(70);
        user_2.setHumidity(50.0);
        user_2.setWorkoutDone(true);
        user_2.setHomeworkDone(true);
        user_2.setDinnerMeal("Filet Mignon with mushroom sauce & a baked potato");

        user_3.setTemperature(77);
        user_3.setHumidity(82.0);
        user_3.setWorkoutDone(false);
        user_3.setHomeworkDone(false);
        user_3.setDinnerMeal(null);

        System.out.println("|----------------- Evaluation -------------->");
        System.out.println(user_1.toString());
        user_1.isWeatherGood();

        System.out.println(user_2.toString());
        user_2.isWeatherGood();

        System.out.println(user_3.toString());

        System.out.println("\n|--User 1--| " + user_1.isTodayGood());
        System.out.println("\n|--User 2--| " + user_2.isTodayGood());
        System.out.println("\n|--User 3--|" + user_3.isTodayGood());

    }
}
