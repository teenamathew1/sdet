package JavaActivity4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers = new ArrayList<>();;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane (int maxPassengers) {
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
	}
	 //Add the passengers to the array    
	 public void onboard(String passenger){
	   	 this.passengers.add(passenger);
	    	 
	 }
	 //returns current date and time
	 public Date takeOff() {
		this.lastTimeTookOf= new Date();
		return lastTimeTookOf;
	 }
	 //sets the value of lastTimeLanded to the current date and time. Also clear() the array.
	 public void land() {
		 this.lastTimeLanded = new Date();
		 this.passengers.clear();
	 }
	 
	 // returns the value of lastTimeLanded.
	 public Date getLastTimeLanded() {		 
		 return lastTimeLanded;
	 }
	 
	 // returns the array of passengers.
	 public List<String> getPassesngers() {
		 return passengers;
	 }
	     
	
}
public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Plane plane = new Plane(10);
		plane.onboard("Teena");
		plane.onboard("Joe");
		plane.onboard("Saj");
		
		System.out.println("Plane tookoff at Time: "+ plane.takeOff());

		//list if passengers
		System.out.println("List of passengers: " + plane.getPassesngers());
		
		Thread.sleep(5000);
		//Landing
		plane.land();
		
		//Time of landing
		System.out.println("Plane landed at Time: "+ plane.getLastTimeLanded());
		System.out.println("People on the plane after landing: " + plane.getPassesngers());
		
		
	}

}
