import java.util.Random;

public class tennisGameSimulator {

	public static void Simulation1(int odds, int bestof) {

		Random randomNumber = new Random();
		//randomize which player has won the point
		tennisScoreBoard ScoreBoard = new tennisScoreBoard(bestof);
		ScoreBoard.BestOf = bestof;
		while (!ScoreBoard.matchIsOver) {
			//if the match is not over from the tennisScoreBoard object, run it.
			int playABall = randomNumber.nextInt(100); // between 0 and 100
			if (playABall < odds) {
				ScoreBoard.pointWon(0);
			//if playABall is less than odds, player 0 has won the point
			} else {
				ScoreBoard.pointWon(1);
			//if playABall is greater than odds, player 1 has won the points
			}
			System.out.println(ScoreBoard.toString());
		}//the output will be shown in the way the toString was formatted
		System.out.println("Winner is " + ScoreBoard.winner);
		System.out.println("Score in sets:");
		for (StatScore s : ScoreBoard.GamesInSet) {
		//StatScore will loop through all of the elements in the ArrayList
			System.out.println(s.player0 + " , " + s.player1);
		}
	}

	public static void Simulation2(int odds, int bestof, int numberOfRuns) {
		Random randomNumber = new Random();
		System.out.println("Chance for player 0 winning a point is " + odds+ "%");

		System.out.println("This is player 1 and player 0 playing "
				+ numberOfRuns + " times");
		int player0Wins = 0;
		for (int i = 0; i < numberOfRuns; i++) {
			//have this for loop run until i is equal to or greater than the number of runs
			tennisScoreBoard Board = new tennisScoreBoard(bestof);
			Board.BestOf = bestof;
			while (!Board.matchIsOver) {
			//if match is not over, play out the match
				int playABall = randomNumber.nextInt(100);
				if (playABall < odds) {
					Board.pointWon(0);
				//player 0 has won the point if playABALL is less than odds
				} else {
					Board.pointWon(1);
				//player 1 has won the points if playABall is greater than odds
				}
			}

			if (Board.winner == 0) {
				player0Wins++;
			}//if the player has won the match, store it and add one.
		}
		System.out.println("Player 0 won in " + 100.0 * player0Wins
				/ numberOfRuns + "% of the time");
		System.out.println("Player 1 won in "
				+ (100.0 - 100.0 * player0Wins / numberOfRuns)
				+ "% of the time");

	}

	public static void Simulation3(int odds, int bestof, int numberOfRuns) {
		Random randomNumber = new Random();
		TennisStatistics ts = new TennisStatistics();
		System.out.println("Chance for player 0 winning a point is " + odds+ "%");

		System.out.println("This is player 1 and player 0 playing "
				+ numberOfRuns + " times");
		int player0Wins = 0;
		for (int i = 0; i < numberOfRuns; i++) {
			tennisScoreBoard Board = new tennisScoreBoard(bestof);
			Board.BestOf = bestof;
			while (!Board.matchIsOver) {
				int playABall = randomNumber.nextInt(100);
				if (playABall < odds) {
					Board.pointWon(0);
				} else {
					Board.pointWon(1);
				}
			}

			if (Board.winner == 0) {
				player0Wins++;
			}
			for (StatScore s : Board.GamesInSet) {
				ts.insertAndIncrement(s);
			//go though the ArrayList and call the method insertAndIncrement
			}

		}
		
		
		System.out.println("Total number of sets played: " + ts.numberOfEntries);
		System.out.println();
		for (StatScore s : ts) {
//will go through the tennis statistics and show the score of the set and shows how many times this set score occurred and the percentage of the how often this set score happens 
			System.out.println("Score: " + s.player0 + "," + s.player1 + " Has occured: " + s.count + " time(s)" + " % of occurences: " 
		+ 100.0 * s.count / ts.numberOfEntries + "%");
		}

		System.out.println("Player 0 won in " + 100.0 * player0Wins
				/ numberOfRuns + "% of the time");
		System.out.println("Player 1 won in "
				+ (100.0 - 100.0 * player0Wins / numberOfRuns)
				+ "% of the time");

	}

	public static void main(String[] args) {
		System.out.println("This is simulation 1 being ran");
		Simulation1(57, 3);
//runs the number of odds winning a point of 57 and best out of 3 sets
		System.out.println();
		System.out.println("This is simulation 1 being ran again");
		Simulation1(57, 5);
//runs the number of odds winning a point of 57 and plays best out of 5 sets
		System.out.println();
		System.out.println("This is simulation 2 being ran multiple times");
		Simulation2(51, 3, 1000000);
//the number of odds is 51, plays best two out of three sets and runs 1,000,000 matches
		Simulation2(51, 5, 1000000);
//the number of odds is 51, plays best three out of five sets and runs 1,000,000 matches
		Simulation2(55, 3, 1000000);
//the number of odds is 55, plays best two out of three sets and runs 1,000,000 matches
		Simulation2(55, 5, 1000000);
//the number of odds is 55, plays best three out of five sets and runs 1,000,000 matches
		Simulation2(60, 3, 1000000);
//the number of odds is 60, plays best two out of three sets and runs 1,000,000 matches
		Simulation2(60, 5, 1000000);
//the number of odds is 60, plays best three out of five sets and runs 1,000,000 matches
		Simulation2(67, 3, 1000000);
//the number of odds is 67, plays best two out of three sets and runs 1,000,000 matches
		Simulation2(67, 5, 1000000);
//the number of odds is 67, plays best three out of five sets and runs 1,000,000 matches
		System.out.println();
		System.out.println();
		System.out.println("This is simulation 3 being ran");
		Simulation3(67, 5, 1000000);
//the number of odds is 67, plays best three out of five sets and runs 1,000,000 matches



	}
}