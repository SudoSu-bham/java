package Experiment2;
import java.util.Scanner;
public class prog1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        int sum = 0;
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter no. of elements to read: ");
        n= scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        System.out.println("Total Sum is: " + sum + "\nAverage is: " + sum/n);
    }
}
