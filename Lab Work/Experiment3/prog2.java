package Experiment3;
import java.util.Scanner;

public class prog2 {
    public static void main(String[] args)
    {
        System.out.print("Enter Numbers of names: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	
        System.out.println("Enter all names separated by spaces: ");
        sc.nextLine();
        String names[] = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        } 
        sc.close();
        
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j]) > 0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("The names in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}