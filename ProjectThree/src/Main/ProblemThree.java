package Main;

import java.math.BigInteger;

public class ProblemThree {

	/**
	 *  Project Euler, Problem 3
	 *  Largest Prime Factor
	 *  Scott Gilmour
	 */
	public static void main(String[] args) {
		String x = "600851475143";
		BigInteger n = new BigInteger(x);
		
		System.out.println(largestPrimeFactor(n));
	}
	
	/**
	 * 
	 * @param n : the integer to find the largest prime factor of
	 * @return : largest prime factor of n
	 */
	public static int largestPrimeFactor(BigInteger n) {
		//All prime numbers past 2 & 3 form to 6n-1 or 6n+1
		int largestFactor = 0, multiplier = 6;
		
		if (n.mod(BigInteger.valueOf(2)) == BigInteger.ZERO) {
			largestFactor = 2;
			
			do {
				n.divide(BigInteger.valueOf(2));
			} while (n.mod(BigInteger.valueOf(2)) == BigInteger.ZERO);
		}
		
		if (n.mod(BigInteger.valueOf(3)) == BigInteger.ZERO) {
			largestFactor = 3;
			
			do {
				n.divide(BigInteger.valueOf(3));
			} while (n.mod(BigInteger.valueOf(3)) == BigInteger.ZERO);
		}
		
		while (n.compareTo(BigInteger.valueOf(multiplier-1)) >= 0) {
			if (n.mod(BigInteger.valueOf(multiplier-1)) == BigInteger.ZERO) {
				largestFactor = (multiplier-1);
				
				do {
					n = n.divide(BigInteger.valueOf(largestFactor));
				} while (n.mod(BigInteger.valueOf(largestFactor)) == BigInteger.ZERO);		
			}
			
			if (n.mod(BigInteger.valueOf(multiplier+1)) == BigInteger.ZERO) {
				largestFactor = (multiplier+1);
				
				do {
					n = n.divide(BigInteger.valueOf(largestFactor));
				} while (n.mod(BigInteger.valueOf(largestFactor)) == BigInteger.ZERO);		
			}
			multiplier += 6;
		}
		return largestFactor;
	}
}
