package BasicJava;

public class PrimeNumber {

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
