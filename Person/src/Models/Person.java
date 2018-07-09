package Models;
//package Models;
import java.util.*;

public class Person {

	public static void person(int age, String name, String job_title) {
				
		System.out.println("Age: " + age + ", name: " + name + ", job title: " + job_title + ".");	
		
	}	
	
	public static void main(String[] args) {

		person(22, "L", "Tester");
		person(23, "A", "Developer");
		person(25, "F", "Developer");		
		person(21, "S", "Tester");
		
//		int[] arrayage = {22, 23, 25, 21};
//		String[] arrayname = {"L", "A", "F", "S"};
//		String[] arrayjob = {"Tester", "Developer", "Developer", "Tester"};
		
//		Object obj1 = new Object();
//		Object obj2 = new Object();		
//		System.out.println(obj1);
		
		ArrayList agelist = new ArrayList();
		
		agelist.add(22);
		agelist.add(23);
		agelist.add(25);
		agelist.add(21);
	    
//	    System.out.println("Size of al after additions: " + al.size());
	    	    
	    System.out.println("Contents of agelist: " + agelist);
	    
		ArrayList namelist = new ArrayList();
		
		namelist.add("L");
		namelist.add("A");
		namelist.add("F");
		namelist.add("S");
	    	    	    
	    System.out.println("Contents of namelist: " + namelist);
	    
		ArrayList joblist = new ArrayList();
		
		joblist.add("Tester");
		joblist.add("Developer");
		joblist.add("Developer");
		joblist.add("Tester");
	    	    	    
	    System.out.println("Contents of joblist: " + joblist);
	
    	System.out.println(" ");
	    
	    int i;
	    for(i = 0; i < agelist.size();i++) {
	    	System.out.print(agelist.get(i) + " ");
	    	} 

    	System.out.println(" ");	    
	    
	    for(i = 0; i < namelist.size();i++) {
	    	System.out.print(namelist.get(i) + " ");
	    	} 
	    
    	System.out.println(" ");
	    
	    for(i = 0; i < joblist.size();i++) {
	    	System.out.print(joblist.get(i) + " ");
	    	} 
	    	    
/*
	    int i; int j; int k;
	    		for(i = 0; i < agelist.size();i++) {			      
	    			for(j = 0; j < namelist.size();j++) {			      
	    				for(k = 0; i < joblist.size();k++) {			      
	    					System.out.print(agelist.get(i) + agelist.get(j) + agelist.get(k));
					         }
				         }
			         }		
*/
	    
	}

}
