package Models;
import java.util.*;

public class Book extends Item {
	
	String isbn;
	
	public Book(String itemid, String title, String author, String isbn) {

		this.isbn = isbn;		
		this.title = title;
		this.author = author;
		this.itemid = itemid;

	}
	
	public String toString( ) {
		
		return "Item ID: " + itemid + ", Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
			
	}
	
}

	