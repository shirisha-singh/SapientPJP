package training;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Assumed divisor is never 0
 **/
public class CheckDivisibilityTest 
{
	private CheckDivisibility obj;
	
	@Before
	public void setup(){
		obj = new CheckDivisibility();
	}
	
	@Test
	public void testDivisible(){
		boolean ans = obj.isDivisible(16, 4);
		assertTrue(ans == true);
	}
	
	@Test
	public void testNotDivisible(){
		boolean ans = obj.isDivisible(10, 3);
		assertTrue(ans == false);
	}
}
