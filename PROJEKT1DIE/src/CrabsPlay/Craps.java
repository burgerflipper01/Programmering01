package CrabsPlay;

import dicegames.Die;

/**
 * This class models one pair of dices.
 *
 */
public class Craps {
	/**
	 * The first die in the pair.
	 */
	private dicegames.Die die1;
	/**
	 * The second die in the pair.
	 */
	private dicegames.Die die2;

	private int rolls;

	private int sixes = 0;

	private int fours = 0;

	private int ones = 0;

	private int fives = 0;

	private int threes = 0;

	private int twos = 0;

	private boolean gameOverWin = true;


	/**
	 * Constructor for objects of class PairOfDices
	 */

	public Craps() {
		die1 = new dicegames.Die();
		die2 = new dicegames.Die();
	}

	// TODO: put the second constructor here!
	public Craps(int sides) {
		die1 = new dicegames.Die(sides);
		die2 = new dicegames.Die(sides);

	}

	// TODO: Add methods here

	public void rollBothDices() {
		die1.roll();
		die2.roll();
		rolls++;
		int sum = die1.getFaceValue() + die2.getFaceValue();
		if (sum == 7 || sum == 11 && rolls == 1) {



		}


	}

	private void gameOverWin() {
		System.out.println("Tak for spillet du vandt efter" + rolls);


		if (die1.getFaceValue() == 6) {
			sixes++;
		} else if (die1.getFaceValue() == 1) {
			ones++;
		} else if (die1.getFaceValue() == 5)
			fives++;
		else if (die1.getFaceValue() == 2) {
			twos++;
		} else if (die1.getFaceValue() == 3) {
			threes++;
		} else if (die1.getFaceValue() == 4) {
			fours++;
		}

		if (die2.getFaceValue() == 6) {
			sixes++;
		} else if (die2.getFaceValue() == 1) {
			ones++;
		} else if (die2.getFaceValue() == 5)
			fives++;
		else if (die2.getFaceValue() == 2) {
			twos++;
		} else if (die2.getFaceValue() == 3) {
			threes++;
		} else if (die2.getFaceValue() == 4) {
			fours++;
		}


	}

	public int getRolls() {
		return rolls;


	}
}



