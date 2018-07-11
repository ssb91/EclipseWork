package Models;
import java.util.*;

public class BasicMethods {

//store hello world as a string, no input parameters
	
	public static String HelloWorld() {		
		return "Hello World";}	

//method to store integer parameters and return the product of their sum and difference	
	
	public static int m2(int p, int q) {
	return (p+q)*(q-p);}

//method to store two boolean values and return their AND result
	
	public static boolean and(boolean a, boolean b) {			
	return a && b;}

//method to store two boolean values and return their OR result
	
	public static boolean or(boolean a, boolean b) {			
	return a || b;}
		
//method for blackjack

/*		
	public static int blackjack(int a, int b) {	
	Set up and solve inequalities, the "closeness" of a number a to 21 is 21-a, likewise for b.
  	if a is closer to 21 than b:
	21 - a < 21 - b -> 	b < a
	if b is closer to 21 than a:
	21 - b < 21 - a -> 	a < b

//  rewrite using switch statements		
	int c;
	if (a >=0 & b >=0 & a <= 21 & b <= 21) {
		
		if (b < a) {c=a;}
		if (a < b) {c=b;}
		else {c=a;}
		}
	else {c=0;}
	return c;
	}
*/
		
//method by Matthew Hunt
		
		public static int play(int player1, int player2) {
			 
			if (player1 > 21 && player2 > 21) {
			 
			return 0;
			 
			}else if (player1 > 21) {
			 
			return player2;
			 
			}else if (player2 > 21) {
			 
			return player1;
			 
			}else {
			 
			return Math.max(player1, player2);
			 
			}
			}

		
	public static int uniquesum(int a, int b, int c) {	

			if (a == b && b == c && c == a ) {return 0;}
			else if (a == b) {return c;}
			else if (b == c) {return a;}
			else if (c == a) {return b;}
			else {return a + b + c;}		
			}

	public static boolean toohot(boolean isSummer, int temperature) {	
			
			boolean T; 
			if (isSummer == true) {
				if (temperature >= 60 && temperature <= 100) {T = true;}
				else {T = false;} }
									
			else {if (temperature >= 60 && temperature <= 90) {T = true;}
			else {T = false;}}

			return T;
	}	
	
	public static void main(String[] args) {

//applications of methods in main (constructed before main)
		
		System.out.println(HelloWorld());
		System.out.println(m2(3,2));
		System.out.println(and(true, true));
		System.out.println(or(false, true));		
		System.out.println("blackjack: " + play(20,18));
		System.out.println("unique sum: " + uniquesum(10,10,7));
		System.out.println("toohot: " + toohot(true, 123));		
		
	}

}
