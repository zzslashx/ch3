import java.util.Scanner;

public class ConvertTime{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount of seconds you want to convert to: hours, minutes, seconds.");
		int inputS= scanner.nextInt();
int backupS= inputS;
		//int answerH = inputS/3600;
		//inputS-=(answerH*3600);		
		//int answerM = inputS/60;
		//inputS-=(answerM*60);
		//int answerS = inputS;
		
		int answerH = inputS/3600;
		int answerM = (inputS%3600)/60;
		int answerS = (inputS%3600)%60;
		//System.out.println(inputS + " seconds = " + answerH + " hours, " + answerM + " minutes, " +"and " + answerS + " seconds.");
		System.out.printf("%dseconds = %d hours + %d minutes + %d seconds.",backupS,answerH,answerM,answerS);
		
		} 
	}
