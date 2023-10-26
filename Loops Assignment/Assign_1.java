import java.util.Scanner;

public class Assign_1 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);

        // Create an Array
		int arr[] = new int [5];

		float sum = 0;

        // Storing value in Array using Scanner
		for (int i = 0; i < arr.length; i++) 
		{

			System.out.print("Enter number " + (i+1) + "  : ");

			arr[i] = sc.nextInt();

		}

        // Summation of Array
		for (int i = 0; i < arr.length; i++) 
		{

			sum = sum + arr[i];

		}


		float avg = sum/5;

		System.out.println("The Sum of array are: "+ sum);

		System.out.println("The Average of array are: "+ avg);


	}

}