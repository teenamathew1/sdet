package JavaActivity4;

import java.util.HashSet;
import java.util.Set;

// Class demonstrating hashset Usage
public class Activity3_2 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		//Adding elements to the hashset
		hs.add("T");
		hs.add("B");
		hs.add("C");
		hs.add("T");
		hs.add("A");
		hs.add("B");
		
		//Size of Hashset
		System.out.println("The total count of objects in the HashSet is: "+hs.size());
		
		System.out.println("The original list of objects in the HashSet is: ");
		for(String s:hs)
			System.out.println(s);
		
		//Removing elements
		hs.remove("A");
		hs.remove("N");
        //Remove element that is not present		
        if(hs.remove("Z")) {
	
        	System.out.println("Z removed from the Set");
	
        } else {
	
        	System.out.println("Z is not present in the Set");
	
        }
		
		//Checking  whether an element is there
		if(hs.contains("K"))
			System.out.println("The element K is there in the set");
		else
			System.out.println("The element K is not there in the set");
		
	   //Print updated HashSet
	   System.out.println("Updated HashSet: " + hs);
	}

}
