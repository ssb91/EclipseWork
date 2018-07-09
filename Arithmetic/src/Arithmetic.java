import java.util.Scanner;

import java.lang.Math;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
	    System.out.println("Enter number a:");	    
	    
	    float a;
	    a = s1.nextInt();
	    System.out.println("You entered a = : " + a);

	    System.out.println("Enter number b:");

	    float b;
	    b = s1.nextInt();
	    System.out.println("You entered b = : " + b);	    

	    float sum = a + b;
	    System.out.println("The sum of the integers, a + b, is: " + sum);	    
	    
	    float difference = a - b;
	    System.out.println("The difference of the integers, a - b, is : " + difference);
	    
	    float ndifference = b - a;
	    System.out.println("The negative difference of the integers, b - a, is : " + ndifference);
	    
	    float product = a*b;
	    System.out.println("The product of the integers, a*b, is: " + product);

	    if (b == 0) { 
		    System.out.println("The quotient of the integers, a/b, is undefined.");
		    }

	    else { 
	    	float quotient = (a/b); 
		    System.out.println("The quotient of the integers, a/b, is: " + quotient);	    	
	    	}
	    
	    if (a == 0) { 
		    System.out.println("The quotient of the integers, b/a, is undefined.");
		    }
	    
	    else { 
	    	float reciprocal = (b/a); 
		    System.out.println("and the reciprocal, b/a, is: " + reciprocal);
	    	}

	    double power = Math.pow(a, b);
	    double revpower = Math.pow(b, a);
	    System.out.println("Number a raised to the power of b is: " + power);	    
	    System.out.println("Number b raised to the power of a is: " + revpower);

	}    

}
