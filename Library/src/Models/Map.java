package Models;

public class Map extends Item {

	String region;
	
	public Map(String itemid, String title, String author, String region) {

		this.itemid = itemid;		
		this.title = title;
		this.author = author;
		this.region = region;		

}
	
	public String toString( ) {
		
		return "Title: " + title + ", Author: " + author + ", Region: " + region;
			
	}
	
}
