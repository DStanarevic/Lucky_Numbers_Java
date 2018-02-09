import java.util.Scanner;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner for obtaining user input.
		Scanner consoleReadline = new Scanner(System.in);
		
		 //Declared Variables
        double jackPot = 10000000;
        double sameNumber = 0;
        int lowestNumber;
        int highestNumber;
        String playAgain;
        
        //Create Array
        int[] randomNumbers = new int[6];
        int[] guessedNumbers = new int[6];
        
        //Main Program
        System.out.println("Would you like to play a game of Lucky Numbers?/nTry your luck at winning $10,000,000.00");
        playAgain = consoleReadline.nextLine().toLowerCase();
        
        //Program Loop
        do 
        {
    	System.out.println("Thank you for playing Lucky Numbers,/nyou will first need to pick your lowest number.");
        lowestNumber = Integer.parseInt(consoleReadline.nextLine());	
    	System.out.println("Thank you, now you will need to pick your largest value.");
    	highestNumber = Integer.parseInt(consoleReadline.nextLine());
    	
    	Random randomGenerator = new Random();
    	randomGenerator.nextInt();
    	for(int i = 0; i < randomNumbers.length; i++)
    	{
    		randomNumbers[i] = lowestNumber + randomGenerator.nextInt((highestNumber +1) - lowestNumber);
    		System.out.println(randomNumbers[i]);
    	}
    	
        }
        while(playAgain.equals("yes"));
        
		System.out.println("Thank you for playing!");
	}
}
