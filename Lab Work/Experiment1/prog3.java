import java.util.Scanner;
public class prog3 {
    static int prev = 0, curr = 1, fibo = 0;

    static void fiRecrsn(int n)
   {
        if (n > 0) 
        {    
            System.out.print(curr + " ");  
 
            fibo = prev + curr;    
            prev = curr;    
            curr = fibo;    

            fiRecrsn(n - 1);    
        }    
    }

    static void fibnon(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            System.out.print(prev + " ");

            fibo = prev + curr;
            prev = curr;
            curr = fibo;
        }
    }

    public static void main(String[] args)
    {
        System.out.print("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        while (true){
            System.out.print("Enter 1. Recurssive 2. Non-Recurssive: ");
            int choice = scanner.nextInt();
            if (choice==1){
                fiRecrsn(n);
                break;
            }
            else if (choice == 2){
                fibnon(n);
                break;
            }
            else{
                System.out.println("Wrong choice. Try again!!");
                continue;
            }
        }
    }
}
