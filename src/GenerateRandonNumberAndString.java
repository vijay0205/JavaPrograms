import java.util.Random;

public class GenerateRandonNumberAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Approach 1- Using Random class

		Random random = new Random();
//		it will generate Random number between 0 to 10, don't provide any argument if you want to generate any random number
		int randomInt = random.nextInt(10);
		System.out.println("Random number using Random class approach is " + randomInt);
		
		boolean status = random.nextBoolean();
		System.out.println("Random number using Random class approach is " + status);
		
//similar manner we can generate random int, double, float, byte
		
		
//		Approach 2 Using Math class
		System.out.println("Random double number using Math class " +Math.random());
	}

}
