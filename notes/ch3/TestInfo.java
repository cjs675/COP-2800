public class TestInfo
{
    public static void main(String[] args)
    {
        System.out.println(
                "class: TestInfo\n" +
                "calling method from another class: \n" +
                "class: ParadiseInfo \n");
        ParadiseInfo.displayInfo();
    }
}
