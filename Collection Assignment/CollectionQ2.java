package Diya_Web_assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionQ2
{
	public static void main(String[] args)
	{
		//Initialize a HashMap
		HashMap<String, String> hm = new HashMap<String, String>();
		
		// Adding data in key & value pair
		hm.put("Red", "Apple");
		hm.put("Yellow", "Banana");
		hm.put("Green", "Pair");
		hm.put("Blue", "Berry");
		
		Set<Map.Entry<String, String>> s = hm.entrySet();
		
		for (Map.Entry<String, String> entry :s) 
		{
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Key: "+key+", Value: "+val);
			
		}
	}
}
