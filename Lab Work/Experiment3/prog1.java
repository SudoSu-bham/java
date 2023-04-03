package Experiment3;
import java.util.Scanner;

public class prog1{
	static boolean isPalindrome(String str)
	{
		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
        sc.close();

		if (isPalindrome(str))
			System.out.println("This string is a palindrome.");
		else
			System.out.println("This string is not a palindrome.");
	}
}