
public class StatScore {

	public int player0;
//represents player0's score 
	public int player1;
//represents player1's score
	public int count;
//used as a counter to count number of times this score has occured
	public StatScore(int p0, int p1) {
		player0 = p0;
		player1 = p1;
		count = 1;
	}

	
	public boolean HasSameScore(StatScore s) {
		if ((this.player0 == s.player0) && (this.player1 == s.player1)) {
//if the values of the properties player0 and player1 are the same between the two object, return true
			return true;
		} else {
			return false;
		}
	}
}
