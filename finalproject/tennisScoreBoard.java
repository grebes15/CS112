import java.util.ArrayList;

public class tennisScoreBoard {

	ArrayList<StatScore> GamesInSet = new ArrayList<StatScore>();
	//ArrayList to store the number of games in the set
	int[] sets = new int[2];
	//number of sets as an array
	int BestOf;
	//BestOf to store whether to play a best two out of three sets or best three out of five sets
	int[] games = new int[2];
	//games being stored for both players
	int[] points = new int[2];
	//points being stored for both players
	boolean matchIsOver = false;
	//sees if the matchIsOver or not
	int winner;
	//will show the winner in the match
	private Boolean tieBreak = false; 
	//is true if the current game is a tiebreak

	// Constructor, sets the BestOf property to indicate
	// if best two out of three sets or best three out of five sets
	public tennisScoreBoard(int bo) {
		BestOf=bo;
	}
	//returns the number of the opponent based on player
	public int opponent(int player) {
		if (player == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	//method to go through in order for one of the players to win enough points to win the game
	public void pointWon(int player) {
		if (!tieBreak) {
			points[player]++;
			//if it is not in a tie break, then the points played will increase by one
			if ((points[player] >= 4)&& (points[player] - points[opponent(player)] >= 2)) {
				gameWon(player);
			//if one of the players have won at least four or more points with a margin of 2 or greater from the opponent, the player will win the game
			}
		} else {
			points[player]++;
			if ((points[player] >= 7)
					&& (points[player] - points[opponent(player)] >= 2)) {
				gameWon(player);
			//goes through a tie break to see if one of the players has won at least seven points with a margin of two.
			}
		}
	}
	//method to go onto the next game when the previous game has won and reset the points score
	public void gameWon(int player) {
		games[player]++;
		// Reset points for both players because a new game starts now
		points[player] = 0;
		points[opponent(player)] = 0;
		// Check if player has won a set, else check if a tiebreak should start
		if ((games[player] == 6) && (games[opponent(player)] == 6)) {
			tieBreak = true;
		}
		if ((tieBreak) && (games[player] == 7)) {
			tieBreak = false;//if a player has 7 games in a set, the set is won by a player and the tie break is over
			setWon(player);
		}
		if ((games[player] >= 6)&& (games[player] - games[opponent(player)] >= 2)) {
			tieBreak = false;
			setWon(player);
			//if the player has six or more games and has a margin of two or more games than the opponent, the player has won the set 
		}
	}

	public void setWon(int player) {
		StatScore SetScore = new StatScore(games[0], games[1]);
		GamesInSet.add(SetScore);
		//stores the set score in the array list
		sets[player] += 1;
		//the player has won one of the sets and will be stored.
		// Reset the game score for both players because a new set starts now
		games[player] = 0;
		games[opponent(player)] = 0;
		if (sets[player] * 2 >= BestOf) {
			matchWon(player);
			//the match will be won by the player if the sets of player times 2 is greater is equal to BestOf.
		}
	}

	public void matchWon(int player) {
		winner = player;//match is won by the player
		matchIsOver = true; //it is true now that the match is over
	}

	public String pointsToString(int player) {
	//if not in a tie break, it will show the proper to show tennis score
		if (!tieBreak) {
			if (points[player] == 0)
				return "0";//if player has 0 points
			if (points[player] == 1)
				return "15";//if player has 1 point
			if (points[player] == 2)
				return "30";//if plater has 2 points
			if ((points[player] == 3) && (points[opponent(player)] <= 3))
				return "40";//if player has 3 points and the opponent is less than or equal to 3 points
			if (points[player] == points[opponent(player)])
				return "40"; //if the player and opponent has three points
			if (points[player] > points[opponent(player)])
				return "Ad";//if the player has more points then the opponent
			if (points[player] < points[opponent(player)])
				return " ";//if the player is fewer points than the opponent
		} else {
			return " " + points[player];
		}
		return " ";
	}
	
	public String toString() {
		String str = "Sets: [" + sets[0] + "," + sets[1] + "] ";
		//return the number of sets between the two players in the match
		str += "Games: [" + games[0] + "," + games[1] + "] ";
		//returns the number of games between the two players in the current set of the match
		str += "Points: [" + pointsToString(0) + "-" + pointsToString(1) + "] ";
		//return the points in the way that the method pointsToString has been written
		if (matchIsOver) {
			str += "player " + winner + " won";
		}//if match is over, then will return the winner between the two players
		return str;
	}
}