package BasicJava;

public class PrimeNumber {
//	a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 12;
		int counter = 0;

		if (number > 0) {
			for (int i = 1; i <= number; i++) {

				if (number % i == 0)
					counter++;
			}

			if (counter == 2) {

				System.out.println("Given number " + number + " is a prime number");
			}

			else {

				System.out.println("Given Number " + number + " is not a Prime number");
			}

		}

		else {

			System.out.println("Given Number " + number + " is not a Prime number");
		}

	}

}
