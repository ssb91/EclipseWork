//package Models;
import java.util.*;
//import Vehicle.java;

public class MotorBike extends Vehicle {
		
	public String track;
	public String sidecar;
	
	public MotorBike(String category, int age, String reg_no,  int engine_size, String starttrack, String startsidecar) {

//refer to superclass (vehicle)		

		super(category, age,reg_no, engine_size);		
		track = starttrack;
		sidecar = startsidecar;
	}	

	public String toString( ) {
		
		return "Category: " + category + ", Age: " + age + ", Reg no: " + reg_no + ", Engine size: " + engine_size 
				+ ", Track: " + track
				+ ", Sidecar: " + sidecar;
	
//		if (track.equals("yes")) {System.out.println("Yes");} 
//		else {System.out.println("No");}

	}
		    		    	
}
	
