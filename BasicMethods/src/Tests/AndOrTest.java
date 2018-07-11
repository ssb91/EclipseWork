package Tests;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import Models.BasicMethods;
import Models.BasicMethods.*;

public class AndOrTest {

@Test

public void testPrintMessage() {

	assertEquals(false, BasicMethods.and(true,false) );
	assertEquals(true, BasicMethods.or(true,false) );
	
}
}
