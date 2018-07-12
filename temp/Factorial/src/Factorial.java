public class Factorial {

//creating method
	
	public static int invfac(int n) {

//set up for loop to divide a number by successive integers
		
		//counter
		int i;
		//n = input variable to find inverse factorial

		if(n > 0) {

		for (i = 1; i < n; i++) {	
		//Dividing the input by the loop counter, and iterating. e.g. 120 divided by 5 then 4 then 3 etc. and printing the answer			
				n = n / i;						
			}
		
			System.out.println(n);
		}	
		
		else if (n==0) {
			System.out.println(1);
		}

		else {
			System.out.println("Noninteger use Gamma function, or just be positive :)"); 
			}

		return n;
				
	}
	
	public static void main(String[] args) {

		
		invfac(0);
		
//		int a = 5; int b = 11;
//		System.out.println(b % a);
		
	}

}
