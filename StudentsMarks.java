import java.util.ArrayList;

import java.util.Scanner;
//Create a user defined Class Student
class Subject 
{

    private String name;

    private double marks;
    
    // Created class Constructor
    public Subject(String name) 
    {

        this.name = name;

        this.marks = 0.0;

    }
    // Creating a getter & Setter of data members
    public void setMarks(double marks) 
    {

        this.marks = marks;

    }

    public double getMarks() 
    {

        return marks;

    }

    public String getName() 
    {

        return name;

    }

}
// Creating a Class Student
class Student 
{

    private String name;

    private String rollNumber;

    private ArrayList<Subject> subjects;
    
    // Create a class Constructor
    public Student(String name, String rollNumber) 
    {

        this.name = name;

        this.rollNumber = rollNumber;

        this.subjects = new ArrayList<>();

        subjects.add(new Subject("Maths"));

        subjects.add(new Subject("English"));

    }

    public String getName() 
    {

        return name;

    }

    public String getRollNumber() 
    {

        return rollNumber;

    }

    public ArrayList<Subject> getSubjects() 
    {

        return subjects;

    }

}
// Create a teacher class
class Teacher 
{

    private Scanner scanner;
    //Create a class constructor
    public Teacher() 
    {

        scanner = new Scanner(System.in);

    }

    public void setStudentMarks(Student student) 
    {

        System.out.println("Enter marks for " + student.getName() + " (Roll Number: " + student.getRollNumber() + "):");

        for (Subject subject : student.getSubjects()) 
        {

            System.out.print("Enter marks for " + subject.getName() + ": ");

            double marks = scanner.nextDouble();

            subject.setMarks(marks);

        }

    }

    public double findAverageMarks(Student[] students) 
    {

        double totalMarks = 0.0;

        int totalSubjects = students.length * 2; 

        for (Student student : students) 
        {

            for (Subject subject : student.getSubjects()) 
            {

                totalMarks += subject.getMarks();

            }

        }

        return totalMarks / totalSubjects;

    }

    public void findMaxMinMarks(Student[] students) 
    {

        double maxMarks = Double.MIN_VALUE;

        double minMarks = Double.MAX_VALUE;

        for (Student student : students) 
        {

            for (Subject subject : student.getSubjects()) 
            {

                double marks = subject.getMarks();

                maxMarks = Math.max(maxMarks, marks);

                minMarks = Math.min(minMarks, marks);

            }

        

        System.out.println("Maximum Marks: " + maxMarks);

        System.out.println("Minimum Marks: " + minMarks);

    }

}

public class A3 
{

    public static void main(String[] args) 
    {

        Student[] students = new Student[10];    

        for (int i = 0; i < 10; i++) {

            students[i] = new Student("Student " + (i + 1), "Roll-" + (i + 1));

        }   

        Teacher teacher = new Teacher();

        for (Student student : students) 
        {

            teacher.setStudentMarks(student);

        }

        double averageMarks = teacher.findAverageMarks(students);

        System.out.println("Average Marks: " + averageMarks);

        teacher.findMaxMinMarks(students);

    }

}