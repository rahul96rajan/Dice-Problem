import java.util.Scanner;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random dice = new Random();
		
		int faces;
		int result;
		
		System.out.println("\tRoll a Dice: ");
		System.out.print("Select Number of faces : ");
		faces = in.nextInt();
		result = dice.nextInt(faces)+1;
		
		if (faces == 2) {
			System.out.println("Now this is a Coin and the Result is : ");
			if(result == 1)
				System.out.println("Heads");
			else
				System.out.println("Tails");
		}
		
		else if (faces == 4) {
			System.out.println("Output is :" + result);
		}
		
		else if (faces == 6) {
			System.out.println("Output is :" + result);
		}

		else
			System.out.println("Sorry, you've entered  a wrong input");
	}

}
