package Models;
import java.util.*;

public abstract class Vehicle {
		
		public String category;
		public int age;
		public String reg_no;
		public int engine_size;
		
		public Vehicle(String category, int age, String model_no, int engine_size) {
			
			this.category = category;
			this.age = age;
			this.reg_no = reg_no;
			this.engine_size = engine_size;
			
		}	
		
}
		    		 
	