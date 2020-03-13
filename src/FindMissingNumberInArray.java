
public class FindMissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 2, 3, 5 };
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < array.length; i++) {
			sum1 = sum1 + array[i];
		}
		System.out.println("Total sum is " + sum1);

		for (int j = 0; j <= 5; j++) {
			sum2 = sum2 + j;
		}
		System.out.println("Total sum is " + sum2);
		System.out.println("Missing number is "+ (sum2-sum1));

	}

}
