public class WhileLoopExample
{

    public static void main(String[] args)
    {

	// assume that the rate is a whole number
	// (right now it is just 10% 
	int rate = 10;

	// assume that the starting balance is 1000 dollars
	double balance = 1000.00;

	// calculate interest for twenty years
	int year = 20;
	
	while( year < 30 )
	    {

		double interest = balance * (rate/100);
		balance = balance + interest;
		year++;

		System.out.println("Calculating Interest for Year = " +
				   year);

	    }
	
    }

}
