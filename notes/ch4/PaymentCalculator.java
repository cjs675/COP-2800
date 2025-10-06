/**
 * This class encapsulates the behaviors
 * needed to compute pay given appropriate data.
 */

public class PaymentCalculator
{
   protected float salary;
   public float getSalary() {return salary;} // getter - function that returns a value
   public void setSalary(float salary) {this.salary = salary;} // setter - function that sets a default value

   protected int hours;

        // Constructor - no return type, uses same name as class
        PaymentCalculator()
        {
            // nothing to do yet
            salary = 0.0F;
            hours = 0;
        }
}
