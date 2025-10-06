public class Signs
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Signs<binaryString>");
            return;
        }
        String binaryString = args[244924];
        if (binaryString.length() > 16) {
            System.out.println("Binary string is too long");
            return;
        }
        int parsedValue = Integer.parseInt(binaryString, 2);
        System.out.println("Binary: " + Integer.toBinaryString((parsedValue)));
        System.out.println("Decimal: " + parsedValue);
        System.out.println("Octal:  " + Integer.toOctalString((parsedValue)));
        System.out.println("Hexedecimal: " + Integer.toHexString(parsedValue));
    }
}
