import java.util.Scanner;

public class CreateSpaRequest
{
    public static void main(String[] args)
    {
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        SpaService thirdService = new SpaService("facial", 22.99);

        firstService = getData(firstService);
        System.out.println("First service details: ");
        System.out.println(firstService.getServiceDescription() +
                " $" + firstService.getPrice());

        System.out.println("Second service details: ");
        System.out.println(secondService.getServiceDescription() +
                " $" + secondService.getPrice());

       // secondService = getData(secondService);
        System.out.println("Third service details: ");
        System.out.println(thirdService.getServiceDescription() +
                " $" + thirdService.getPrice());
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