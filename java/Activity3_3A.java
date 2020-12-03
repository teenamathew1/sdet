package JavaActivity4;

import java.util.LinkedList;
import java.util.Queue;

//Learning the concept of queue
public class Activity3_3A {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		for (int i=0;i<5;i++) 		{
			q.add(i);
		}
		System.out.println("Elements in the queue : "+q);
		
		q.remove(2);
		System.out.println("The first number in the queue is: "+q.peek());
		
		System.out.println("The size of the queue is: "+q.size());
		System.out.println("Elements in the updated queue : "+q);

	}

}
