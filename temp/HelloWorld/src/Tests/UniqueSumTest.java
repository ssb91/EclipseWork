package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.HelloWorld;
import Models.HelloWorld.*;

public class UniqueSumTest {

@Test

public void testPrintMessage() {

	assertEquals(6, HelloWorld.uniquesum(1,2,3) );
	assertEquals(2, HelloWorld.uniquesum(2,3,3) );
	assertEquals(0, HelloWorld.uniquesum(3,3,3) );
	
}
}
