package Tests;

import static org.junit.Assert.*;
import java.math.BigInteger;
import org.junit.Test;
import Main.ProblemThree;

public class ProblemThreeTests {

	@Test
	public void testLargestPrimeFactor() {
		String x = "600851475143";
		BigInteger n = new BigInteger(x);
		int result = 0, expected = 6857;
		
		result = ProblemThree.largestPrimeFactor(n);
		
		assertEquals(result, expected);
	}
}
