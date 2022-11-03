package opgave3Teater;

public class TheaterFloor {
	int[][] seats = {
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
			{ 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og der returneres true
	 * Der returneres false hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public boolean buySeat(int row, int seat) {
		if (seats[row][seat] == 0){
			return false;
		}
		else {
			seats[row][seat] = 0;
			System.out.println("Du har nu købt et sæde");
			return true;
		}


	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * der returneres true. Der returneres false, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 * @param price
	 * @return
	 */
	public boolean buySeat(int price) {

		// TODO
		return false;

	}

	public void printTheaterFloor() {
		// TODO
	}
}
