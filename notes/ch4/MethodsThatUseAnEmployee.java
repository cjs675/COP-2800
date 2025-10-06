import java.util.Scanner;

class MethodsThatUseAnEmployee
{
    public static void main(String[] args)
    {
        // Employee object with identifier declared
        Employee  myEmployee;
        // value returned from getEmployeeData() method is assigned to myEmployee object
        myEmployee = getEmployeeData();
        // myEmployee object passed to displayEmployee() method
        displayEmployee(myEmployee);
    }

    // return type is Employee
    public static Employee getEmployeeData()
    {
        // Employee object created within this method & passed back to main
        // where its assigned to the myEmployee reference
        // the Employee constructor could have been called in main(),
        // but then the values assigned would be overwritten after call to getEmployeeData()
        Employee tempEmp = new Employee();
        int id;
        double sal;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        id = input.nextInt();
        tempEmp.setEmpNum(id);
        System.out.println("Enter an Employee salary: ");
        sal = input.nextDouble();
        tempEmp.setEmpSalary(sal);
        // Employee object is returned
        return tempEmp;
    }

    // parameter is an Employee type
    public static void displayEmployee(Employee anEmp)
    {
        System.out.println("\nEmployee #" + anEmp.getEmpNum() +
                " Salary is " + anEmp.getEmpSalary());
    }
}