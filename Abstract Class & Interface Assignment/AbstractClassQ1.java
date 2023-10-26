package Diya_Web_assignments;

//Abstract Shape class
abstract class Shape 
{
	abstract double calculateArea();
}

class Circle extends Shape 
{
	private double radius;

	public Circle(double radius) 
	{
		this.radius = radius;
	}

	double calculateArea() 
	{
		return Math.PI * radius * radius;
	}
}

//Rectangle subclass
class Rectangle extends Shape 
{
	private double length;
	private double width;

	public Rectangle(double length, double width) 
	{
		this.length = length;
		this.width = width;
	}

	double calculateArea()
	{
		return length * width;
	}
}

public class AbstractClassQ1
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(5.0);

		// Calculate and print the area of the Circle
		System.out.println("Area of the Circle: " + circle.calculateArea());

		// Create a Rectangle object
		Rectangle rectangle = new Rectangle(4.0, 6.0);

		// Calculate and print the area of the Rectangle
		System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
	}
}
