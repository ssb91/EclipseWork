package Models;
import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;



public class GarageMain {

	public static void main(String[] args) {
		
		//introduce objects as cars and bikes 
					
					Car c1 = new Car("Car", 3, "NDM012", 4, "Auto", 5);
					Car c2 = new Car("Car", 5, "LNM421", 6, "Manual", 6);
					MotorBike b1 = new MotorBike("Motorbike", 4, "PDL302", 4, "off road", "no");
					MotorBike b2 = new MotorBike("Motorbike", 1, "LDM231", 6, "on road", "yes");
					
					ArrayList carlist = new ArrayList();
					
					carlist.add(c1);
					carlist.add(c2);				    		    	    

					ArrayList bikelist = new ArrayList();
					
					bikelist.add(b1);
					bikelist.add(b2);
				    
		//introduce scanner1
				    
				    Scanner sc1 = new Scanner(System.in);

		//print out statement (to enter a reg_no)
				    
				    System.out.println("Enter a vehicle type (car, bike, etc).");

		//create an intermediate string variable S1, which is the input
				    
				    String S1;
				    S1 = sc1.next();
				    
				    if(S1.equalsIgnoreCase("car")) {System.out.println("Contents of carlist: " + carlist);}
				    else if (S1.equalsIgnoreCase("bike")) {System.out.println("Contents of bikelist: " + bikelist);}
				    else {System.out.println("Contents of carlist: " + carlist);
				    	System.out.println("Contents of bikelist: " + bikelist);}				    
				    				    
		//introduce scanner2
				    
				    Scanner sc2 = new Scanner(System.in);

		//print out statement (to enter a reg_no)
				    
				    System.out.println("Enter a registration number:");

		//create an intermediate string variable S2, which is the input
				    
				    String S2;
				    S2 = sc2.next();		    				    

		//search for object (vehicles) according to reg_no and print them out, using the compare strings operation string1.equals("string2"), note quotation marks on second string
				    
				    if(S2.equalsIgnoreCase("NDM012")) {System.out.println(c1);}
				    else if(S2.equalsIgnoreCase("LNM421")) {System.out.println(c2);}
				    else if(S2.equalsIgnoreCase("PDL302")) {System.out.println(b1);}
				    else if(S2.equalsIgnoreCase("LDM231")) {System.out.println(b2);}				    
				    else { System.out.println("none");}

		//calculate bill based on vehicle type
				    
				    int bill1;
				    int bill2;
				    
				    Scanner sc3 = new Scanner(System.in);
				    
				    System.out.println("Enter a vehicle category (car, bike, etc.):");
				    
				    String S3;
				    S3 = sc3.next();

				    if(S3.equalsIgnoreCase("car")) {bill1 = 20;}
				    else if(S3.equalsIgnoreCase("bike")) {bill1 = 15;}
				    else {bill1 = 0;}
				    
				    Scanner sc4 = new Scanner(System.in);
				    
				    System.out.println("Enter a vehicle property (cars: manual or automatic gears, bikes: off-road or on-road):");

				    String S4;
				    S4 = sc4.next();
				    
				    if(S4.equalsIgnoreCase("manual")) {bill2 = 20;}
				    else if(S4.equalsIgnoreCase("automatic")) {bill2 = 25;}
				    else if(S4.equalsIgnoreCase("off road")) {bill2 = 15;}
				    else if(S4.equalsIgnoreCase("on road")) {bill2 = 18;}
				    else {bill2 = bill1;}
				   
				    System.out.println(bill1 + bill2);
				    
				}

}
