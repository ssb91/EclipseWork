
public class Switches {

	public static void main(String[] args) {

// char grade = args[0].charAt(0);

		char grade = 'S';

	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	         case 'B' :
	         case 'C' :
	            System.out.println("Well done");
	            break;
	         case 'D' :
	            System.out.println("You passed");
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	         default :
	            System.out.println("Invalid grade");
	      }

	
			int n = 2; int m;

		      switch(n) {
		         case 2: m = 2*n+1; break;
		         case -2: m = 1 - 2*n;
		         case 3: m = 3*n; break;
		         case -3: m = 1-3*n; break;
		         default : m = n;
		      
		         System.out.println(m);
		         
		      }
	      
	}

}
