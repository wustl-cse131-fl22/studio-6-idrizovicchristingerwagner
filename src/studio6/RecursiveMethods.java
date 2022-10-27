package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
	
		if (n==0)
		{
			return 0.0;
		}
		if (n == 1) {
			return (.5);
		} else {
			return Math.pow(.5,n) + geometricSum(n-1);
		}		
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
		while (q != 0)
		{
			if (p%q == 0)
			{
				return q;
			}
			else
			{
				int var = q;
				q = p % q;
				p = var;
				return (gcd(p,q));
			}
		}
		return 0;
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	
	//Keeping track of the index using a helper method
	public static int[] helper(int[] A, int[] R, int index) {
		if(index == A.length) {
			return R;
		}
		else {
			int indexReverse = A.length-index-1;
			
			R[index]=A[indexReverse];
			
			index++;
			
			return helper(A,R,index);
		}
		
	}
	
	public static int[] toReversed(int[] array) {
		if(array.length == 0) {
			return new int [0];
		}
		
		else {
			int i = 0;
			return helper(array, new int [array.length], i);
		}
	
			// FIXME create a helper method that can recursively reverse the given array
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
