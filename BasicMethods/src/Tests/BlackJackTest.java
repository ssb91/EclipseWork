package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.BasicMethods;
import Models.BasicMethods.*;

public class BlackJackTest {

@Test

public void testPrintMessage() {

	assertEquals(3, BasicMethods.play(3,2) );
	assertEquals(21, BasicMethods.play(21,312) );
	assertEquals(2, BasicMethods.play(0,2) );
}
}
