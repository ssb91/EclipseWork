package Models;
import java.util.*;

public class BasicArrays {

//method to print arrays	
		
	public static void printArray(int[] array) {
		   for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		   }
		}

//method to reverse entries of an array
	
	public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];

		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		   return result;
		}
	
//method to interchange array entries at positions p and q
	
	public static int[] switchElements(int[] list, int p, int q) {
		   
		if ( p >= 0 && p <= list.length  && q >= 0 && q <= list.length ) {
			
			int[] result = new int[list.length];
		   
		   for (int i = 0; i < list.length; i++) {
			      result[i] = list[i];
			   }

		   result[p] = list[q];
		   result[q] = list[p];
		   
		   return result;
		}
		else {return list;}
		}

//method to cycle array entries right
	
	public static int[] cycleRight(int[] list) {
		   int[] result = new int[list.length];
		   
		   for (int i = 0; i < list.length - 1; i++) {
			   result[i + 1] = list[i];
			   }

		   result[0] = list[list.length - 1];
		   
		   return result;
		}

//method to cycle array entries left	
	
	public static int[] cycleLeft(int[] list) {
		   int[] result = new int[list.length];
		   
		   for (int i = 1; i < list.length; i++) {
			   result[i - 1] = list[i];
			   }

		   result[list.length-1] = list[0];
		   
		   return result;
		}
	
	
	public static void main(String[] args) {

		
		
//1d arrays
		
//		printArray(cycleLeft(new int[]{3, 1, 2, 6, 4, 9, 8}));
		
		printArray(switchElements(new int[]{3, 1, 2, 6, 4, 9}, 2, 4));
		
//		printArray(new int[]{3, 1, 2, 6, 4, 9});

		
//		printArray(reverse(new int[]{3, 1, 2, 6, 4, 2}));

		
		
		int[] A = {2,0,6,38,3,5,21,36,80,21};

		System.out.println("Third entry in vector A = " + A[2]);
		
		System.out.print("vector A = ( ");
		for (int i : A) {
			System.out.print(i + " ");
		}			
		System.out.print(")");

		
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

//convert string array to arraylist	
	    
	    String[] array = {"2NS", "PX2", "AN9"};
	    ArrayList<String> newarraylist = new ArrayList<String>(Arrays.asList(array));
	    System.out.println(newarraylist);
	    
// Create a hash map

	     HashMap hm = new HashMap();
	      
// Put elements to the map
	      hm.put("Z", new Double(3434.34));
	      hm.put("M", new Double(123.22));
	      hm.put("A", new Double(1378.00));

// Get a set of the entries
	      Set set = hm.entrySet();
	      
// Get an iterator
	      Iterator i = set.iterator();
	      
// Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
	      
	}

}
