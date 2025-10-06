/**
 * this class is instantiated & used by the CreateSpaRequest class
 */


public class SpaService
{
    // field declarations
    private String serviceDescription;
    private double price;

    // methods that set field values (setters)

    // setServiceDescription method accepts a String parameter & assigns it to
    // serviceDescription field for each object that eventually will be instantiated
    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    }
    // setPrice method accepts a double parameter & assigns it to the price field
    public void setPrice(double servicePrice)
    {
        price = servicePrice;
    }

    // methods to retrieve values (getters)
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getPrice()
    {
        return price;
    }
}
