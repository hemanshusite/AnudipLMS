import java.util.Scanner;

public class Assign_2 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner (System.in);

        // Create an Array
		int arr[] = new int [10];

		int large = 0, small = Integer.MAX_VALUE;

        // Storing Data in an array
		for (int i = 0; i < arr.length; i++) 
		{

			System.out.print("Enter number " + (i+1) + "  : ");

			arr[i] = sc.nextInt();

		}


		System.out.println("The entered numbers are below: ");

		for (int i = 0; i < arr.length; i++) 
		{

			System.out.print(arr[i] + " ");

		}

		System.out.println();
        
        // Find Largest number from an array
		for (int i = 0; i < arr.length; i++) 
		{

			if(large < arr[i]) {

				large = arr[i];

			}

		}
		// Find Smallest number from an array

		for (int i = 0; i < arr.length; i++) 
		{

			if(small > arr[i]) {

				small = arr[i];

			}

		}



		System.out.println("The Largest number of array is: "+ large);

		System.out.println("The Smallest number of array is: "+ small);



	}

}