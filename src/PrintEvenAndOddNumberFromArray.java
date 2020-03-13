import java.util.ArrayList;

public class PrintEvenAndOddNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList evenList = new ArrayList();
		ArrayList oddList = new ArrayList();

		int array[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println();
		for (int arrayElements : array) {

			if (arrayElements % 2 == 0) {
				evenList.add(arrayElements);
			}
		}
		System.out.println("Even Numbers are " + evenList);

		for (int arrayElements : array) {

			if (arrayElements % 2 != 0) {
				oddList.add(arrayElements);
			}

		}
		System.out.println("Odd Numbers are " + oddList);

	}

}
