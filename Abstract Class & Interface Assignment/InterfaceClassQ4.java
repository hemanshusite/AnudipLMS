package Diya_Web_assignments;

//Person interface
interface Person 
{
	void speak();
}

class Student implements Person
{
	private String name;

	public Student(String name) 
	{
		this.name = name;
	}

	public void speak() 
	{
		System.out.println("My name is " + name);
	}
}

class Teacher implements Person 
{
	private String name;

	public Teacher(String name) 
	{
		this.name = name;
	}

	public void speak() 
	{
		System.out.println("Hello! My name is " + name + " I'm your teacher");
	}
}

public class InterfaceClassQ4 
{
	public static void main(String[] args) 
	{
		Student student = new Student("ABC");

		// Call the speak method of the Student
		student.speak();

		// Create a Teacher object
		Teacher teacher = new Teacher("XYZ");

		// Call the speak method of the Teacher
		teacher.speak();
	}
}
