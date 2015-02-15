// GCD.java Class demo by THC.  Converted to Java by Scot Drysdale.
// Computes the greatest common divisor of two integers by the
// Euclidean algorithm.

// Code for the second recursive implementation from:
// http://mindprod.com/jgloss/gcd.html

// Modified by Gregory M. Kapfhammer to not require use of Keyboard 
// class and only work in a cmd-line fashion with one run of program.

public class RecursiveGCD
{

  public static void main(String[] args)
  {
   
      // assume that two arguments are provided on the command line
      Integer arg1 = new Integer(args[0]);
      Integer arg2 = new Integer(args[1]);

      int n = arg1.intValue();
      int m = arg2.intValue();

      System.out.println("The GCD(" + arg1 + "," + arg2 + ") = " +
			 gcd(n,m));

  }

    // Recursive GCD function.
    public static int gcd(int a, int b)
    {
    
	int r;          // Hold the remainder
  
	r = a % b;
	if (r == 0)
	    {
		return b;
	    }

	else
	    {

		return gcd(b, r);

	    }
    }
    
    /**
     * Euclid's greatest common divisor algorithm.
     * Find the largest number that evenly divides into both n and d.
     * require: n >= 0, d >= 0.
     * fastest if n >= d.
     *
     *  
     */
    public static int gcdAlternate(int n, int d)
    {
	
	if ( d == 0 )
	    {
		return 1;
	    }
	
	int r = n % d;
	
	return( r == 0 ) ? d : gcd( d , r );
   
    }
    
}
