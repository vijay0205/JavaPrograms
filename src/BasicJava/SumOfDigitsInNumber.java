package BasicJava;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1234;
		int sum = 0;
		while (number > 0)

		{

			int temp = number % 10;
			sum = sum + temp;
			number = number / 10;
		}

		System.out.println("Sum is " + sum);
	}

}
