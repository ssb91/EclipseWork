package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.Calculator;
import Models.Calculator.*;

public class CalculatorTest {

@Test

public void testPrintMessage() {

	assertEquals("a = c - b, b = c - a, c = a + b", Calculator.operations(1,2,3) );
	assertEquals("a = b + c, b = a - c, c = a - b", Calculator.operations(8,3,5) );
	assertEquals("a = b*c, b = a/c, c = a/b", Calculator.operations(6,3,2) );
	assertEquals("No relation.", Calculator.operations(2,2,2) );
	
}

}
