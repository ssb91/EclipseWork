package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.HelloWorld;
import Models.HelloWorld.*;

public class TooHotTest {

@Test

public void testPrintMessage() {

	assertEquals(false, HelloWorld.toohot(true,122) );
	assertEquals(false, HelloWorld.toohot(true,102) );
	assertEquals(false, HelloWorld.toohot(true,190) );
	assertEquals(true, HelloWorld.toohot(false,85) );
	assertEquals(true, HelloWorld.toohot(true,62) );
	assertEquals(false, HelloWorld.toohot(false,96) );
	
}
}
