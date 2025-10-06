import java.util.Scanner;

public class CreateSpaRequest
{
    public static void main(String[] args)
    {
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();

        firstService = getData(firstService);
        secondService = getData(secondService);
    }

    public static SpaService getData(SpaService service)
    {
        String serviceDescription;
        double price;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter service: ");
        serviceDescription = keyboard.nextLine();
        System.out.println("Enter price: ");
        price = keyboard.nextDouble();
        keyboard.nextLine();

        service.setServiceDescription(serviceDescription);
        service.setPrice(price);
        return service;
    }
}