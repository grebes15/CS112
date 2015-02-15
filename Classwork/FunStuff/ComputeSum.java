public class ComputeSum
{

    public static double sumFirst(int n)
    {

	double sum = 0;

	for(int i = 1; i <= n; i++)
	    {

		sum = sum + i;

	    } 
	
	return sum;

    }

    public static double sumSecond(int n)
    {

	double sum = (n*(n+1)) / 2;
	return sum;

    }

    public static double sumThird(int n)
    {

	double N = (double)n;

	double sum = (N*(N+1)) / 2;
	return sum;

    }

    public static void main(String[] args)
    {

	if( args[0].equals("first") )
	    {

		String N = args[1];
		Integer nI = new Integer(N);
		int n = nI.intValue();
		System.out.println("Sum = " + sumFirst(n));

	    }

	else if( args[0].equals("second") )
	    {

		String N = args[1];
		Integer nI = new Integer(N);
		int n = nI.intValue();
		System.out.println("Sum = " + sumSecond(n));

	    }

	else if( args[0].equals("third") )
	    {

		String N = args[1];
		Integer nI = new Integer(N);
		int n = nI.intValue();
		System.out.println("Sum = " + sumThird(n));

	    }

	double chris = Integer.MAX_VALUE + Integer.MAX_VALUE;
	System.out.println(chris);

    }

}
