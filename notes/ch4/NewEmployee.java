public class NewEmployee
{
    public static void main(String[] args)
    {
        // object instantiations
        Employee salesVP = new Employee();
        Employee CTO = new Employee();

        CTO.setEmpNum(99);
        CTO.setEmpLastName("Hannon");
        CTO.setEmpFirstName("Roy");
        CTO.setEmpSalary(250000.00);

        salesVP.setEmpNum(100);
        salesVP.setEmpSalary(100000.00);
        salesVP.setEmpLastName("Smith");
        salesVP.setEmpFirstName("Mark");


        System.out.println("\nthe VP of Sales' number is: " +
                salesVP.getEmpNum() +
                "\nVP of Sales - Last Name: " + salesVP.getEmpLastName() +
                "\nVP of Sales - First Name: " + salesVP.getEmpFirstName() +
                "\nVP of Sales - Salary: " + salesVP.getEmpSalary());


        System.out.println("\nthe VP of Sales' number is: " +
                CTO.getEmpNum() +
                "\nCTO - Last Name: " + CTO.getEmpLastName() +
                "\nCTO - First Name: " + CTO.getEmpFirstName() +
                "\nCTO - Salary: " + CTO.getEmpSalary() +
                "\nCTO's withholding: " + CTO.calculateWithholding(250000, 0.05));

        System.out.println("\n the VP of sales' employee number is : " + salesVP.getEmpNum() +
                "\n the CTO's employee number is: " + CTO.getEmpNum());
    }

}
