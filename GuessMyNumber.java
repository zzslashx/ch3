import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber{
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
        int number = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100(inclusive) Can you guess what it is?");
		System.out.print("Type a number: \n");
		
		int guess = scanner.nextInt();
		System.out.println("Your guess is: " + guess);
		
		int amountOff = Math.abs(number - guess);
		System.out.println("The number I was thinking of was: " + number);
		System.out.println("You were off by: " + amountOff);
		
	}
}
