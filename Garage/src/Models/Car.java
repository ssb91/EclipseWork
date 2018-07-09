package Models;
import java.util.*;


public class Car extends Vehicle {
		
	public String transmission;
	public int gears;
	
	public Car(String category, int age, String reg_no, int engine_size, String transmission, int gears) {

//refer to superclass (vehicle)		
		
		super(category, age, reg_no, engine_size);
		this.transmission = transmission;
		this.gears = gears;		

//		if (transmission.equalsIgnoreCase("manual")) {transmission = "manual";}
//		else if (transmission.equalsIgnoreCase("automatic")) {transmission = "automatic";}
//		else {transmission = "none";}

	}	

	public String toString( ) {
		
		return "Category: " + category + ", Age: " + age + ", Reg no: " + reg_no + ", Engine size: " + engine_size 
				+ ", Transmission: " + transmission
				+ ", Number of gears: " + gears;
	}
		    		    	
}
	
