public class Employee
{
    private int empNum;
    private String empLastName;
    private String empFirstName;
    private double empSalary;

    public int getEmpNum()
    {
        return empNum;
    }

    public void setEmpNum(int emp)
    {
        empNum = emp;
    }

    public String getEmpLastName()
    {
        return empLastName;
    }
    public void setEmpLastName(String name)
    {
        empLastName = name;
    }

    public String getEmpFirstName()
    {
        return empFirstName;
    }

    public void setEmpFirstName(String name)
    {
        empFirstName = name;
    }

    public double getEmpSalary()
    {
        return empSalary;
    }

    public void setEmpSalary(double sal)
    {
        empSalary = sal;
    }
}


/**
 * the following application instantiates two Employee objects
 * clerk & driver - each use setEmpNum() & getEmpNum() methods one time
 * the DeclareTwoEmployees application can use these methods because they are public
 * it must use each of the methods with an Employee object because the methods are not static
 * file:  DeclareTwoEmployees
 */


