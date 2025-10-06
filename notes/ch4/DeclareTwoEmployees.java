/**
 * this program assumes the Employee.java file is stored in the same folder as the application
 * if the Employee.java were in a different folder, would need an import statement at top of file
 */

public class DeclareTwoEmployees
{
    public static void main(String[] args)
    {
        Employee clerk = new Employee();
        Employee driver = new Employee();
        clerk.setEmpNum(345);
        driver.setEmpNum(567);
        System.out.println("The clerk's number is " +
                clerk.getEmpNum() + " and the driver's number is " +
                driver.getEmpNum());
    }
}
