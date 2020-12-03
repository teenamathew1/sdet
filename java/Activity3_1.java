package JavaActivity4;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		//declaring arraylist		
		ArrayList<String> myList = new ArrayList<String>();
		//Adding names to the myList
		myList.add("Joe");
		myList.add("Matthew");
		myList.add("Tom");
		myList.add("Celine");
		myList.add(2, "Lucy");
		
		//Printing the names in list
		System.out.println("Print all the Names: ");
		for(String s:myList)
			System.out.println(s);
		
		//Getting 3rd item in list
		System.out.println("Third item in the list is: " +myList.get(2));
		
		//Checking whether a specified name is in the list
		if(myList.contains("Joe"))
			System.out.println("Name Joe is in the list");
		else
			System.out.println("Name Joe is not in the list");
		
		//Displaying number of names in myList
		System.out.println("The total count of objects in the list is: "+myList.size());
		
		myList.remove(3);
		System.out.println("The count of objects in the list after removal is: "+myList.size());
		
		
	}
	


}
