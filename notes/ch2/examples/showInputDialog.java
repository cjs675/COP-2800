package examples;
import javax.swing.JOptionPane;

public class showInputDialog
{
    public static void main(String[] args)
    {
        String result;
        result = JOptionPane.showInputDialog(null,
                "What is your area code?",
                "Area code Information",
                JOptionPane.QUESTION_MESSAGE);
        System.out.println("Your area code is: " + result);
    }
}

