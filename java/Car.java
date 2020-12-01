package JavaActivity1;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	public Car() {
		// Give initial values of tyres and doors as 4
		tyres = 4;
		doors=4;
		
	}
	
	public void displayCharacteristics()
	{
		System.out.println("Color: " + color);
		System.out.println("transmission: " + transmission);
		System.out.println("make: " + make);
		System.out.println("tyres: " + tyres);
		System.out.println("doors: " + doors);
	}
	
	public void accelarate()
	{
		System.out.println(" The Car is moving forward ");
	}
	
	public void brake()
	{
		System.out.println(" The Car has stopped ");
	}

}
