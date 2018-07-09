package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.Factorial;
import Models.Factorial.*;

public class FactorialTest {

@Test

public void testPrintMessage() {

	assertEquals(5, Factorial.invfac(120) );
	assertEquals(3, Factorial.invfac(6) );
	assertEquals(0, Factorial.invfac(-2) );
//	assertEquals(1, Factorial.invfac(6780) );
	
}

}
