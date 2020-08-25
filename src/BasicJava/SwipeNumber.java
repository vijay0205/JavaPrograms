package BasicJava;

public class SwipeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		//With temp variables
		int t=a;
		a=b;
		b=t;
		
		System.out.println(a + "," +b);

		
		//with + and - operator
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a + "," +b);
		
//		with * and /
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a + "," +b);
	}

}
