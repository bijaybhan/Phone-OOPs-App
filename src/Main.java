public class Main
{
    public static void main(String[] args)
    {
        LandLine l1 = new LandLine("86558447821");
        LandLine l2 = new LandLine("86558447822");

        l1.callNumber("86558447822");
        l2.receiveedCall("86558447822");
        System.out.println(l2.answerCall());
    }
}