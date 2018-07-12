//package Models.Vehicle;
import java.util.*;

public abstract class Vehicle {
		
//introduce variables
	
		public String category;
		public int age;
		public String reg_no;
		public int engine_size;
		
		public Vehicle(String startcategory, int startage, String startreg_no, int startengine_size) {

//pass intial variables to new method Vehicle
			
			category = startcategory;
			age = startage;
			reg_no = startreg_no;
			engine_size = startengine_size;
			
		}	
		
}
		    		 
	