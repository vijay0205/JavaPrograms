package Arrays;
import java.util.Arrays;

public class CheckArraysEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };
//		Approach 1
		boolean status = Arrays.equals(a1,a2);

		if (status == true) {
			System.out.println("Both Arrays are equal");
		} else {

			System.out.println("Both Arrays are not equal");

		}

//		Approach 2
		boolean status2 = true;

		if (a1.length == a2.length) {

			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i])
					status2 = false;
			}

		}

		else {
			status2 = false;
			System.out.println("Length is not equal hence array can not be same");
		}

		if (status2 == true) {
			System.out.println("Both Arrays are equal");

		} else {

			System.out.println("Both Arrays are not equal");

		}

	}

}
