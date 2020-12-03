package JavaActivity4;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

//learning dq
public class Activity3_3B {

	public static void main(String[] args) {
		Deque<String> dq= new LinkedList<String>();
		
		//Adding 6 animals
		dq.add("Dog");
		dq.add("cat");
		dq.add("Wolf");
		
        //Alternate way to add elements to queues		
        dq.offer("Hyena");	
        dq.offerFirst("Puma");	
        dq.offerLast("Panther");

        //Iterate through queue elements
        Iterator<String> iterator = dq.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
		
        //Peek at head element    	
        System.out.println("Peek: " + dq.peekFirst());	
        System.out.println("Peek: " + dq.peekLast());
		
        //To show that the element have not been deleted
    	System.out.println("After peek: " + dq);	
        
        //check if Wolf is present
        System.out.println("Contains Wolf?: " + dq.contains("Wolf"));
    	
        
    	
        //Remove the first and last element	
        dq.removeFirst();	
        dq.removeLast();	
        System.out.println("dq after removing first and last elements: " + dq);	
        System.out.println("Size of deque after removal: " + dq.size());

	}

}
