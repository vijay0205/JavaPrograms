import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scan.nextInt();

		System.out.println("Enter Second Number");
		int b = scan.nextInt();

		System.out.println("Enter Third Number");
		int c = scan.nextInt();

		if (a > b && a > c) {
			System.out.println(a + "  is largest number");
		} else if (b > a && b > c) {
			System.out.println(b + "  is largest number");
		} else {
			System.out.println(c + "  is largest number");
		}
		
//		Using Ternary operator
		
		int largestOfFirstTwo=a>b?a:b;
		int largestNumber=largestOfFirstTwo>c?largestOfFirstTwo:c;
		System.out.println("Largest number using Ternary operator is "+largestNumber);
	}

}
