package examples;
import javax.swing.JOptionPane;

public class SalaryDialog {
    public static void main(String[] args) {
        String wageString, dependentString, hoursWorkedString;
        double wage, weeklyPay;
        int dependents;
        // final double HOURS_IN_WEEK = 40;

        /*
        per the example we've used a base 40hr workweek
        & set it as a constant
        what if we gave the user the ability to input their hours worked/wk?
        */


        wageString = JOptionPane.showInputDialog(null,
                "Enter employee's hourly wage", "Salary dialog 1",
                JOptionPane.INFORMATION_MESSAGE);
        dependentString = JOptionPane.showInputDialog(null,
                "How many dependents do you have?", "Salary dialog 2",
                JOptionPane.QUESTION_MESSAGE);
//      weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
        hoursWorkedString = JOptionPane.showInputDialog(null,
                "How many hours did you work the previous week?", "Salary dialog 3",
                JOptionPane.QUESTION_MESSAGE);
        weeklyPay = Double.parseDouble(wageString) * Double.parseDouble(hoursWorkedString);
        dependents = Integer.parseInt(dependentString);
        JOptionPane.showMessageDialog(null, "Weekly salary is $" +
                weeklyPay + "\nDeductions will be made for " +
                dependents + " dependents");

    }
}
