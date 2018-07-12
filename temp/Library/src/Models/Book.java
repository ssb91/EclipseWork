package Models;
import java.util.*;

public class Book extends Library {
	
	public Book(String title, String author, String isbn) {

		this.title = title;
		this.author = author;
		this.isbn = isbn;		

}
	
	public String toString( ) {
		
		return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
			
	}
	
}

	