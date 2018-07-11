package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.BasicMethods;
import Models.BasicMethods.*;

public class TooHotTest {

@Test

public void testPrintMessage() {

	assertEquals(false, BasicMethods.toohot(true,122) );
	assertEquals(false, BasicMethods.toohot(true,102) );
	assertEquals(false, BasicMethods.toohot(true,190) );
	assertEquals(true, BasicMethods.toohot(false,85) );
	assertEquals(true, BasicMethods.toohot(true,62) );
	assertEquals(false, BasicMethods.toohot(false,96) );
	
}
}
