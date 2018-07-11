package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void test() {
		
	      String Str = new String("hello world");	      
	      

	      char[] Str1 = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
	      String Str2 = "";
	      Str2 = Str2.copyValueOf( Str1 );
	      
	      assertEquals("Hello World", Str2);
	      assertEquals(11, Str2.length());
	      
	}

}
