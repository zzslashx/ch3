
import java.util.Scanner;

public class Temperature {
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("What temperature is it in celsius?");
	double temperatureC = scanner.nextInt();
	double temperatureF = ((temperatureC *9.0)/5.0+32);
	System.out.printf("%.1fC° =  %.1f°F%n", temperatureC, temperatureF);
	
	}
}
