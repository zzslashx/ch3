import java.util.Scanner;

public class ConvertTime{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of seconds you want to convert to: hours, minutes, seconds.");
		int inputS= scanner.nextInt();
		int inputSBackup = inputS;
		int answerH = inputS/3600;
		inputS-=(answerH*3600);
		
		int answerM = inputS/60;
		inputS-=(answerM*60);
		int answerS = inputS;
		
		System.out.println(inputSBackup + " seconds = " + answerH + " hours, " + answerM + " minutes, " +"and " + answerS + " seconds.");
		
		
		} 
	}
