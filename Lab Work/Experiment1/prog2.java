public class prog2{
    public static void main(String[] args)
    {
        int fact = 1;
        for (int i = Integer.parseInt(args[0]); i >1 ; i--)
        {
            fact *= i;
            System.out.print(i+"*");
        }
        System.out.println("1\nFactorial: " + fact);
    }
}