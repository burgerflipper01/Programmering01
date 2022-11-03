package dicegames;

import com.sun.source.tree.IfTree;
import com.sun.source.tree.ReturnTree;
import javafx.geometry.Dimension2D;

import java.util.Scanner;

/**
 * This class models one pair of dices.
 *
 */
public class PairOfDices {
    /**
     * The first die in the pair.
     */
	private Die die1;
	/**
	 * The second die in the pair.
	 */
	private Die die2;

	private int rolls;

	private int sixes = 0;

	private int fours = 0;

	private int ones = 0;

	private int fives = 0;

	private int threes = 0;

	private int twos = 0;

	private int pairs;

	private int highest;







	/**
	 * Constructor for objects of class PairOfDices
	 */

	public PairOfDices() {
		die1 = new Die();
		die2 = new Die();
	}
	// TODO: put the second constructor here!
	public PairOfDices(int sides) {
		die1 = new Die(sides);
		die2 = new Die(sides);

	}

	// TODO: Add methods here


	public Die getDie1() {
		return die1;
	}

	public Die getDie2() {
		return die2;
	}

	public int getRolls() {
		return rolls;
	}

	public int getSixes() {
		return sixes;
	}

	public int getFours() {
		return fours;
	}

	public int getOnes() {
		return ones;
	}

	public int getFives() {
		return fives;
	}

	public int getThrees() {
		return threes;
	}

	public int getTwos() {
		return twos;
	}

	public int getPairs() {
		return pairs;
	}

	public int getHighest() {
		return highest;
	}



	public void rollBothDices() {
		die1.roll();
		die2.roll();
		rolls++;

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

		if (die1.getFaceValue() == die2.getFaceValue()) {
			pairs++;

		}
		if (sumOfDices() > highest) {
			highest = sumOfDices();

		}

	}

	public void resetPairOfDie(){
			highest = 0;
			ones = 0;
			twos = 0;
			threes = 0;
			fours = 0;
			fives = 0;
			sixes = 0;
			pairs = 0;
		}
		public int sumOfDices(){
		int sum = die1.getFaceValue() + die2.getFaceValue();
	return sum;





		}

	}






