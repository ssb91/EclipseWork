package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.BasicMethods;
import Models.BasicMethods.*;

public class UniqueSumTest {

@Test

public void testPrintMessage() {

	assertEquals(6, BasicMethods.uniquesum(1,2,3) );
	assertEquals(2, BasicMethods.uniquesum(2,3,3) );
	assertEquals(0, BasicMethods.uniquesum(3,3,3) );
	
}
}
