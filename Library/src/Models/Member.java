package Models;
import java.util.*;

public class Member extends Library {

	String name;
	String id;
	
	public Member(String name, String id) {

		this.name = name;
		this.id = id;

}
	
	public String toString( ) {
		
		return "name: " + name + ", ID: " + id;
			
	}
	
}

	