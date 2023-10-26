public class A1 {

public static void main(String[] args) 
{
    
    String str = "Welcome to Java World";
    
    // Find the 5th position of character
    System.out.println("The character at 5th position is: " + str.charAt(5));

    boolean a = str.equalsIgnoreCase("Welcome");
    
    // Use Ignoring case
    System.out.println("The above String with “Welcome” lexicographically ignoring case is: " + a);
    
    // Join two string using concat method
    System.out.println("Concatenating the above string is: " + str.concat("-Let us learn"));
    
    // Find the position of first occurence
    System.out.println("The position of the first occurrence of character ‘a’ is: " + str.indexOf("a"));
    
    // Replace the character
    System.out.println("The Replace occurrences of ‘a’ character with the new ‘e’ is: " + str.replace("a","e"));
    
    // Find the character between 4th to 10th position
    System.out.println("The string between 4th position and 10th position is: " + str.substring(4, 10));
    
    // Convert the string into lowecase
    System.out.println("Lowercase of the string is : " + str.toLowerCase());

    }

}