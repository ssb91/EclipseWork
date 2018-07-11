package Models;

import java.util.*;

import org.junit.jupiter.api.Test;

public class LibraryMain {

	
	
//library methods, all have same AND format but they will be used in different places for different purposes
//some may be mutually exclusive (one member can't check out a book, and another check the same book back in)
//put in an interface
	
		public static boolean bookAdd(boolean operation, boolean bookExists) {
			
			return operation && bookExists;
			
		}
		
		public static boolean mapAdd(boolean operation, boolean mapExists) {
			
			return operation && mapExists;
			
		}
		
		public static boolean bookRemove(boolean operation, boolean bookExists) {
			
			return operation && bookExists;
			
		}
		
		public static boolean mapRemove(boolean operation, boolean mapExists) {
			
			return operation && mapExists;
			
		}
		
		public static boolean memberAdd(boolean operation, boolean memberExists) {
			
			return operation && memberExists;
			
		}
		
		public static boolean memberRemove(boolean operation, boolean memberExists) {
			
			return operation && memberExists;
			
		}
		
		public static boolean bookCheckIn(boolean operation, boolean bookExists) {
			
			return operation && bookExists;
			
		}
		
		public static boolean mapCheckIn(boolean operation, boolean mapExists) {
			
			return operation && mapExists;
			
		}
		
		public static boolean bookCheckOut(boolean operation, boolean bookExists) {
			
			return operation && bookExists;
			
		}
		
		public static boolean mapCheckOut(boolean operation, boolean mapExists) {
			
			return operation && mapExists;
			
		}

		
/*
	
	public static boolean libraryFunction(boolean operation, boolean itemExists) {
		
		return operation && itemExists;
		
	}	
*/
	
		public static void main(String[] args) {

//creation of a sample book, map, member			
			
			Book book1 = new Book("B210", "A", "N", "9781212312");	
			Map map1 = new Map("M190", "M", "C", "Manchester");	
			Member member1 = new Member("M", "C");	

//all items in one arraylist, members in another			
			
			ArrayList itemlist = new ArrayList();
			ArrayList memberlist = new ArrayList();

//number to select operation, switch selects case, if a customer wants to perform a library operation () 			
			
			int libraryOperation = 3;
			boolean bookOperation = false;
			boolean bookExistence = false;
			boolean mapOperation = true;
			boolean mapExistence = true;
			boolean memberOperation = false;
			boolean memberExistence = false;

			switch (libraryOperation) {	
			
			case 1:
			if (bookCheckIn(bookOperation, bookExistence)) { itemlist.add(book1); System.out.println(book1 + " checked in."); }		
			else if (mapCheckIn(mapOperation, mapExistence)) { itemlist.add(map1); System.out.println(map1 + " checked in."); }
			else System.out.println("No action to perform.");
			
			break;
			
			case 2:
			if (bookCheckOut(bookOperation, bookExistence)) { itemlist.remove(book1); System.out.println(book1 + " checked out."); }
			else if (mapCheckOut(mapOperation, mapExistence)) { itemlist.remove(map1); System.out.println(map1 + " checked out."); }
			else System.out.println("No action to perform.");

			break;
			
			case 3:
			if (bookAdd(bookOperation, bookExistence)) { itemlist.add(book1); System.out.println(book1 + " added to item list."); }
			else if (mapAdd(mapOperation, mapExistence)) { itemlist.add(map1); System.out.println(map1 + " added to item list."); }
			else if (memberAdd(memberOperation, memberExistence)) { memberlist.add(member1); System.out.println(member1 + " added to member list."); }
			else System.out.println("No action to perform.");

			break;
			
			case 4:
			if (bookRemove(bookOperation, bookExistence)) { itemlist.remove(book1); System.out.println(book1 + " removed from item list."); }
			else if (mapRemove(mapOperation, mapExistence)) { itemlist.remove(map1); System.out.println(map1 + " removed from item list."); }
			else if (memberRemove(memberOperation, memberExistence)) { memberlist.remove(member1); System.out.println(member1 + " removed from member list."); }		
			else System.out.println("No action to perform.");

			break;
			
			default:  System.out.println("No action to perform.");		
			
			
			}
			
			
		}

	}		