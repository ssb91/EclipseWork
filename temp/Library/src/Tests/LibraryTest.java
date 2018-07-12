package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import Models.Library;
import Models.Book;
import Models.Member;

public class LibraryTest {

@Test

public void checkoutTests() {
	
	Book b1 = new Book("A", "B.C", "9781212312");

	//	Member m1 = new Member("N", "92XH");
//	m1.booklist.add(b1);
//	m1.checkOut(b1);

	ArrayList booklist = new ArrayList();
	booklist.add(b1);
	
	assertEquals(1, booklist.size());

}
}