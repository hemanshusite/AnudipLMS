package Diya_Web_assignments;

// Create a class vehicle
class Vehicle 
{
	private String brand, model;
	private int year;
    
    // create a constructor
	public Vehicle(String brand, String model, int year) 
	{
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	void drive() 
	{
		System.out.println("Brand is :" + brand);
		System.out.println("Model is :" + model);
		System.out.println("Year is :" + year);
	}
}

// create class Car and extend to class vehicle
class Car extends Vehicle 
{
	private String color;
    
    // create constructor
	public Car(String brand, String model, int year, String color) 
	{
		super(brand, model, year);
		this.color = color;
	}

	void honk() 
	{
		System.out.println("Color is: " + color);
	}

}

public class A1 
{

	public static void main(String[] args) 
	{
	    // Add values
		Car cobj1 = new Car("Buggati", "Beyron", 2023, "Silver");
		cobj1.drive();
		cobj1.honk();
	}

}
