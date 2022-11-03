package opgave1_2dobbelArray;

/**
 * @author mad
 *
 */
public class DobbelArrayMethods {

	public void udskrivArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "  ");
			}
			System.out.println();
		}
	}

	// Opgave 1.1
	public  int getValueAt(int[][] numbers, int row, int col){
		//TODO returner værdien på plads (row,col) i numbers

		return numbers[row][col];
	}

	// Opgave 1.2
	public  void setValueAt(int[][] numbers, int row, int col, int value){
		//TODO opdater pladsen (row,col) i numbers til value
		numbers[row][col] = value;
	}

	// Opgave 1.3
	public  int sumRow(int[][] numbers, int row) {
		//TODO returner summen af tallene i rækken row
		int sum = 0;
		for (int j = 0; j < numbers[row].length; j++) {
			sum = sum + numbers[row][j];

		}
		return sum;
	}

	// Opgave 1.4
	public  int sumCol(int[][] numbers, int col) {
		//TODO returner summen af tallene i kolonnen col
		int sum = 0;
		for (int j = 0; j < numbers.length; j++) {
			sum = sum + numbers[j][col];

		}
		return sum;

	}

	// Opgave 1.5
	public  int sum(int[][] numbers) {
		//TODO returnerer summen af alle tallene i numbers
		int sumForAll = 0;
		for (int i = 0; i < numbers.length;i++){
			for (int j = 0; j<numbers[0].length;j++){
				sumForAll += numbers[i][j];
			}
		}
		return sumForAll;

	}

}
