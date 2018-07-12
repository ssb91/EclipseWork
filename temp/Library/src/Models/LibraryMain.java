package Models;
import java.util.*;

public class LibraryMain {

	public static void main(String[] args) {

		Book b1 = new Book("A", "B.C", "9781212312");	
		Member m1 = new Member("N", "92XH");	

		System.out.println(b1);		
		System.out.println(m1);

		ArrayList booklist = new ArrayList();
		booklist.add(b1);
		
		ArrayList memberlist = new ArrayList();
		memberlist.add(m1);
		
		System.out.println(booklist);		
		System.out.println(memberlist);
		
		
	}

}