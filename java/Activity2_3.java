package JavaActivity4;

interface BicycleParts {
	public int gears = 0;
    public int currentSpeed = 0;
}

interface BicycleOperations {
	public void applyBrake(int decrement) ;
	public void speedUp(int increment);
	
}

//Base Class
class Bicycle implements BicycleParts, BicycleOperations {
	public int gears;
    public int currentSpeed;
    
  //the Bicycle class has one constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    
    public void applyBrake(int decrement) {
    	currentSpeed -= decrement;
    	System.out.println("Current speed: " + currentSpeed);
    }
    
    public void speedUp(int increment) {
    	currentSpeed += increment;
    	System.out.println("Current speed: " + currentSpeed);
    }
    
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
    
}

//derived Class
class MountainBike extends Bicycle {
	public int seatHeight;
	
	//constructor
	public MountainBike(int gears, int currentSpeed, int startHeight) {
		//Invoking base-class(Bicycle) constructor
		super(gears,currentSpeed);
		seatHeight = startHeight;
	}
	
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	//overriding bicycleDesc method of Super class
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  
}

//Driver class
public class Activity2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MountainBike mb = new MountainBike(3,0,25);
		System.out.println(mb.bicycleDesc());
	    mb.speedUp(20);
	    mb.applyBrake(5);
		
	}

}
