import java.util.Random;

public class Exceptions {

	
	   public static void main(String args[]) {
		   
		   int x = 0;
		   x = (int)(0 + Math.random()*5);
		   
		   System.out.println(x);
		   
		   try{ 
			   double y= 10/x;
			   System.out.println(y);
			   
		   }

		   
		   catch(ArithmeticException e)
		   {
			   //System.out.println(e);
		   System.out.println("You cannot divide by zero");
		   }  
		   
	   }


}
