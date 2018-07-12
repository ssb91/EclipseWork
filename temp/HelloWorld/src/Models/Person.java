package Models;
import java.util.*;

public class Person {
	
	public int age;
	public String name;
	public String job_title;
	
	public Person(int age, String name, String job_title) {
		super();
		this.age = age;
		this.name = name;
		this.job_title = job_title;
		}
	
	
	public String toString() {
	
		return "Age: " + age + ", Name: " + name + ", Job title: " + job_title;

			}

		public static void main(String[] args) {

//people
			
			Person p1 = new Person(21, "A", "Tester");
			Person p2 = new Person(24, "C", "Developer");
			Person p3 = new Person(25, "H", "Developer");
			Person p4 = new Person(23, "M", "Tester");
/*
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println(p4);
*/
			
			ArrayList personlist = new ArrayList();
			
			personlist.add(p1);
			personlist.add(p2);
			personlist.add(p3);
			personlist.add(p4);
		    		    	    
		    System.out.println("Contents of personlist: " + personlist);
//		    System.out.println("person 2" + personlist.get(2));
//		    System.out.println("Size of personlist: " + personlist.size());		    

		    int i;

		    for(i = 0; i < personlist.size();i++) {
		    	System.out.println(personlist.get(i) + " ");
		    	} 
		    
//introduce scanner
		    
		    Scanner sc = new Scanner(System.in);

//print out statement (to enter a name)
		    
		    System.out.println("Enter a name:");

//create an intermediate string variable N, which is the input
		    
		    String N;
		    N = sc.next();		    

//search for object (people) and print them out, using the compare strings operation string1.equals("string2"), note quotation marks on second string
		    
		    if(N.equals("A")) {System.out.println(p1);}
		    else if(N.equals("C")) {System.out.println(p2);}
		    else if(N.equals("H")) {System.out.println(p3);}
		    else if(N.equals("M")) {System.out.println(p4);}
		    else { System.out.println("none");}
		    
		}
		    
		    	
		}
	
