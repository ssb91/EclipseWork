package Models;
import java.util.ArrayList;

public class HelloWorld {

	public static void m1() {
		String H = "Hello World!";		
		System.out.println(H);}	

//method to store integer parameters and return the product of their sum and difference	
	
	public static int m2(int p, int q) {
	return (p+q)*(q-p);}

//method to store two boolean values and return their AND result
	
	public static boolean and(boolean a, boolean b) {			
	return a & b;}

//method to store two boolean values and return their OR result
	
		public static boolean or(boolean a, boolean b) {			
		return a | b;}
		
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
	
//Matthew's algorithm
		
		public static int play(int player1, int player2) {
			if (player1 > 21 && player2 > 21) {
			return 0;
			}
			else if (player1 > 21) {
			return player2;
			}
			else if (player2 > 21) {
			return player1;
			}
			else {
			return Math.max(player1, player2);
			}
			}

	public static int uniquesum(int a, int b, int c) {	
//  rewrite using switch statements
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

/*

simple print out tests in main:

			System.out.println("Hello World!");
			String S = "Hello World!";			
			System.out.println(S);
			
			int a = 1; int b = 4;			
			System.out.println(a + b);
*/
		
//applications of methods in main (constructed before main)
		
			m1();
			System.out.println(m2(3,2));
			System.out.println(and(true, true));
			System.out.println(or(false, true));
			
			System.out.println("blackjack: " + play(27,18));
			System.out.println("unique sum: " + uniquesum(10,10,7));
			System.out.println("toohot: " + toohot(true, 123));
			
			System.out.println();
			
//1d arrays
			
			int[] A = {2,0,6,38,3,5,21,36,80,21};

			System.out.println("Third entry in vector A = " + A[2]);
			
//			System.out.print("vector A = ( ");
			for (int i : A) {
				System.out.print(i + " ");
			}			
//			System.out.print(")");

			
			System.out.println("The length of A is " + A.length);
			
			System.out.print("Some elements of A are: (");
			for (int i = 2 ; i < A.length - 1 ; i ++) {
				System.out.print(i + " ");
			}
			System.out.print(")");

			
//2d array			
			
			int twoDArray[][] = {{3, 2, 8}, {2, 8, 3}, {8, 3, 2}};

			for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
			System.out.print(twoDArray[i][j]);
			}
			System.out.println();
			}
				
			System.out.println("The 3rd row and 2nd column entry is: " + twoDArray[2][1]);
			
			for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length ; j++) {
			System.out.print(3*twoDArray[i][j] + 2*twoDArray[j][i] + " ");
			}
			System.out.println();
			}						

//arraylist (put import java.util.*; at very beginning, before public class)			
			
			ArrayList al = new ArrayList();
			
			al.add(2);
		    al.add("A");
			al.add(6);
		    al.add(3);
			al.add(8);
		    al.add("B");
			al.add("C");
		    al.add("N");
			al.add(3);
		    al.add("Z");
		    
		    System.out.println("Size of al after additions: " + al.size());

		    System.out.println("Contents of al: " + al);

		    System.out.println(al.get(6));
					
	}		
		
}