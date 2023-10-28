package Diya_Web_assignments;

import java.util.ArrayList;

class Person 
{
    private String name;
    private int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class CollectionQ3 
{
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        // Add 10 Person objects to the ArrayList
        people.add(new Person("Ajay", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Vijay", 22));
        people.add(new Person("David", 28));
        people.add(new Person("Zac", 35));
        people.add(new Person("Akshay", 40));
        people.add(new Person("Grace", 27));
        people.add(new Person("Shahid", 32));
        people.add(new Person("Aditiya", 29));
        people.add(new Person("Jack", 24));

        // Print the Person objects using a for-each loop
        for (Person person : people) 
        {
            System.out.println(person);
        }
    }
}

