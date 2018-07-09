//import java.util.Math;

public class Recursion {

//nth term in Fibonacci sequence, add previous two terms, initial conditions first term 0 second 1
	
	public static int Fibonacci(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		else return Fibonacci(n - 2) + Fibonacci(n - 1);
		
	}

/*	
	public static double newFibonacci(double n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		else return newFibonacci(n - 2) + newFibonacci(n - 1);
		
	}
	
*/

//add c to y n, using repeated addition of 1 to previous term
//initial condition c + 0 = c
		
		public static int add(int n, int c) {
			
			if (n == 0) return c;
			else return add(n - 1,c) + 1;
			
		}
	
//multiply c by n, using repeated addition of c to previous term
//initial condition c*0 = 0
	
	public static int multiply(int n, int c) {
		
		if (n == 0) return 0;
		else return multiply(n - 1,c) + c;
		
	}
	
//raise c to the power of n, using repeated multiplication of c to previous term, 
//initial conditions n^0 = 1
	
	public static int power(int n, int c) {
		
		if (n == 0) return 1;
		else return power(n - 1,c)*c;
		
	}

//enter a string, and obtain a substring following the first n characters (from beginning), 
//n is between 0 and the string length inclusive
	
	public static String randomstart(String A) {
		
		int n;
		n = (int)(0 + Math.random()*A.length());
		
		if (A.length() > n) return A.substring(0,A.length()-n);
		else return A;
		
	}
	
	
	public static char charAt(String A, int n) {
		
		if (n <= A.length()) return A.charAt(n);
		else return A.charAt(A.length());
		
	}
	
	
/*	
	
	public static char charDouble(String A, int n) {

		return charDouble(A, n-1)charDouble(A, n-1)};
		
	}
*/	
	
	public static int morerandom(int a) {
		
		int n;
		n = (int)(-a + Math.random()*a);
		
		if (a > n) return a - n;
		else return a + n;
		
	}
	
	
	//logistic map x = cx(1-x), previous term is 
	

	/*	
		public static int Logistic(int n) {
				
			if (n == 0) return 0;
			else return (Logistic(n)-1)*(2-Logistic(n));
				
		}
	*/			
	
	   public static void main(String args[]) {
		   
		   System.out.println(charAt("Hydroelectric", 4));
		   System.out.println(Fibonacci(25));
//		   System.out.println(newFibonacci(3.6));
		   System.out.println(add(10,10));
		   System.out.println(multiply(8,3));
		   System.out.println(power(3,3));		   
		   System.out.println(randomstart("Hydromagnetic"));		   
		   System.out.println(morerandom(213));		   

		   
		   
		   
	   }
		
}
