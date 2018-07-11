package Models;

//import java.util.Math;

import java.util.Scanner;

public class Strings {

//taken from tutorialpoint and tweaked
	
   public static void main(String args[]) {

	   
//examples of string definitions (used in operations below)
	   
	  String hw = "Hello world";
      String Str = new String("Strings, chords, lines, as long as needed.");
      String str1 = "Strings are immutable";
      String str2 = new String("Strings are immutable");
      String str3 = new String("Integers are not immutable");
      	   
//printing strings	with concatenation   

      System.out.println( "String " + hw + " with concatenation");

//length of string

      int len = hw.length();
      System.out.println( "String " + hw + " has length: " + len );           

//comparing strings      
           
      int result1 = str1.compareTo( str2 );
      System.out.println("str1 compared to str2 integer value: " + result1);
      
      result1 = str2.compareTo( str3 );
      System.out.println("str1 compared to str3 integer value: " + result1);

      boolean  result2 = str1.contentEquals( str3 );
      System.out.println("str1 compared to str3 boolean value: " + result2);
	  
      result2 = str2.contentEquals( str3 );
      System.out.println("str2 compared to str3 boolean value: " + result2);

//split a string at a character occurance     
      
      for (String i : Str.split(", ")) {
         System.out.println(i);
      }

//substrings      
      
      int a =3;
      String SubStr1 = new String("Tutorials");
      System.out.println("Found Index :" + Str.indexOf( SubStr1 ));


      
//      System.out.println("Substring at position " + a + ": " + Str.substring(a) );            
      
      
//character array to string method
      
      char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
      String Str2 = "";
      Str2 = Str2.copyValueOf( Str1 );
      System.out.println("Returned String: " + Str2);
      
//string to character array method, separate printouts because array is a different object
      
      System.out.print("Return Value: " );
      System.out.println(Str.toCharArray() );

//convert string to lowercase and upper case
      
      System.out.print("Lower case of " + Str + " is :");
      System.out.println(Str.toLowerCase());
            
      System.out.print("Upper case of " + Str + " is :");
      System.out.println(Str.toUpperCase());
      
//String to string method
      
      System.out.print("String to string: ");
      System.out.println(Str.toString());
      
      String A = "dgys fruhi fjfdsf";
      
      A.substring(3);
      A.split("");
      A.split("a");
      A.substring(3, 9);
      A.toCharArray();
      System.out.println("String A: " + A);
      System.out.println("Substring of A from index 3 to 9: " + A.substring(3,9));
      
      
      String B = A.substring(3);
      String C = B.toUpperCase();
      
      for (String i : C.split(" ")) {
    	  
    	  System.out.println(i);
      }
      
      
      System.out.println(Math.max(A.length(), Math.max(B.length(), C.length())));
            
      

      
   }
}