package Diya_Web_assignments;

// create a clas person
class Person 
{
	private String name;
	private int age;
    // create constructor
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	void speak() 
	{
		System.out.println(name + " is speaking and is age is " + age);
	}
}


// create a class sudent & extend to a class person
class Students extends Person 
{
	private char grade;
    
    // create constructor
	public Students(String name, int age, char grade)
	{
	    // taking parameter from super class
		super(name, age);
		this.grade = grade;
	}

	void study() 
	{
		System.out.println("Grade is " + grade);
	}
}

public class A2 
{

	public static void main(String[] args) 
	{
		Students sobj1 = new Students("ABC", 21, 'A');
		sobj1.speak();
		sobj1.study();
	}

}
