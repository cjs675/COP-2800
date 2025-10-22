
public class Calendar
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to my calendar app");

        // ask for few calendar appointments
        // create instances of objects from them
        // use those instances to do interesting things

       Appointment meeting = new Appointment(
                "2026-10-8 13:00:00",
                "2026-10-8 15:00:00");

       // interrogate data
       int duration = meeting.Duration();

        System.out.println("Start date: " + meeting.getStartDate());

    }
}
