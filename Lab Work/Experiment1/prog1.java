import java.util.Scanner;

//1.WAP to find greatest of three numbers. 
public class prog1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int great = a;
        if(b>great){
            great = b;            
        }
        if (c > great){
            great = c;
        }
        System.out.print("Greatest number is: "+great);
    }
}