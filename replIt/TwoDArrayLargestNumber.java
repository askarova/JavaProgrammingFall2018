package replIt;

public class TwoDArrayLargestNumber {
	public static void main(String[] args) {

		int[][] numbers = { { 2, 8, 3, 0 }, { 1123, 3232, 763222, 11 } };

		int largest = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int idx = 0; idx < numbers.length; idx++) {
				if (numbers[i][idx] >=largest) {
					largest = numbers[i][idx];
				}

			}
			System.out.println(largest);
		}

	}
}

