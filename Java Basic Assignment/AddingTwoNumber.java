import java.util.Scanner;

public class A2
{
	public static void main(String[] args) 
	{
	    //Taking a User input using Sacnner
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int n2 = sc.nextInt();
		
		System.out.println("Sum of number is "+(n1+n2));
	}
}