package Diya_Web_assignments;

class CalculateAverageThread implements Runnable 
{
	private int[] arr;

	public CalculateAverageThread(int[] arr) 
	{
		this.arr = arr;
	}
	
	@Override
	public void run() 
	{
		int sum = 0;
		for (int i =0;i<arr.length;i++) 
		{
			sum = sum + arr[i];
		}
		double average = (double) sum / arr.length;
		System.out.println("Average of the first 10 numbers: " + average);
	}
}

class PrintSquaresThread implements Runnable 
{
	private int[] arr;

	public PrintSquaresThread(int[] arr) 
	{
		this.arr = arr;
	}

	@Override
	public void run() 
	{
		for (int i=0;i<arr.length;i++) 
		{
			System.out.println("Square of " + arr[i] + ": " + (arr[i] * arr[i]));
		}
	}
}

public class A1 
{
	public static void main(String[] args) 
	{
		int[] arr = { 1, 20, 50, 15, 30 };
		CalculateAverageThread averageThread = new CalculateAverageThread(arr);
		PrintSquaresThread squaresThread = new PrintSquaresThread(arr);

		Thread thread1 = new Thread(averageThread);
		Thread thread2 = new Thread(squaresThread);

		// Start the first thread to calculate the average
		thread1.start();

		try 
		{
			thread1.join(); // Wait for the first thread to finish
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}

		// Start the second thread to print squares
		thread2.start();
	}
}
