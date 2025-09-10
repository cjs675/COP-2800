import java.util.Scanner;
import javax.swing.JOptionPane;

public class UnitConversion
{
    public static void main(String[] args)
    {
        String inputUnit, outputUnit, amount;
        final double INCHES_IN_FEET = 12;
        final double FEET_IN_YARDS = 3;
        final double FEET_IN_MILES = 5280;
        final double YARDS_IN_MILES = 1760;
        final double INCHES_IN_CUBITS = 18;
        final double FEET_IN_CUBITS = 1.5;
        final double STEPS_IN_YARDS = 0.83;
        final double INCHES_IN_STEPS = 0.03;
        final double CUBITS_IN_MILES = 0.0003;

        takeInput();
    }
    public static void takeInput()
    {
        Object[] unitOptions = { "Inches", "Feet", "Yards", "Cubits", "Steps", "Miles" };
        Object selectedInput = JOptionPane.showInputDialog(null,
                "Select a base unit", "You Convert",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                unitOptions, unitOptions[0]);
    }

}




