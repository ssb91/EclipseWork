package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.HelloWorld;
import Models.HelloWorld.*;

public class BlackJackTest {

@Test

public void testPrintMessage() {

	assertEquals(3, HelloWorld.play(3,2) );
	assertEquals(21, HelloWorld.play(21,312) );
	assertEquals(2, HelloWorld.play(0,2) );
}
}
