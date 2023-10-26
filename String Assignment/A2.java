public class A2 {

	public static void main(String[] args) {
	    
	    // Create a onject of StringBuffer
		StringBuffer st = new StringBuffer("This is StringBuffer");
        
        // Append new sentence
		System.out.println(st.append(" - This is a sample program"));
        
        //Insert text in 21 index number
		System.out.println(st.insert(21, "Object"));
        
        // Reverse the string
		System.out.println(st.reverse());
        
        // Reaplce the character
		System.out.println(st.replace(14, 20, "Builder"));

	}

}