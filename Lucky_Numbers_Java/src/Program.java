import java.util.Scanner;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner Object for User Input
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
        System.out.println("Would you like to play a game of Lucky Numbers?\nTry your luck at winning $10,000,000.00");
        playAgain = consoleReadline.nextLine().toLowerCase();
        
        //Program Loop
        do 
        {
        
    	//Number Range
    	System.out.println("Thank you for playing Lucky Numbers,\nyou will first need to pick your lowest number.");
        lowestNumber = Integer.parseInt(consoleReadline.nextLine());	
    	System.out.println("Thank you, now you will need to pick your largest value.");
    	highestNumber = Integer.parseInt(consoleReadline.nextLine());
    	
    	//Random Number Generator
    	Random randomGenerator = new Random();
    	randomGenerator.nextInt();
    	for(int i = 0; i < randomNumbers.length; i++)
    	{
    		randomNumbers[i] = lowestNumber + randomGenerator.nextInt((highestNumber +1) - lowestNumber);	
    		System.out.println(randomNumbers[i]);
    	}
    	
    	//User Guesses
    	System.out.println("Enter six guesses.");
    	for(int i = 0; i < guessedNumbers.length;i++) 
    	{
    		System.out.println("Please enter guess number " + (i + 1));
    		guessedNumbers[i] = Integer.parseInt(consoleReadline.nextLine());
    		
    		while(guessedNumbers[i] < lowestNumber || guessedNumbers[i] > highestNumber)
    		{
    			System.out.println("Please enter a number that is between " + lowestNumber + " and " + highestNumber + ".");
    			guessedNumbers[i] = Integer.parseInt(consoleReadline.nextLine());
    		}
    	}
    	
    	//Chosen Numbers
    	System.out.println("Thank you for choosing the following numbers.");
    	for(int i = 0; i < guessedNumbers.length; i++)
    	{
    		System.out.println(guessedNumbers[i]);   		
    	}
    	
    	//Compare Numbers
    	for (int i = 0; i < randomNumbers.length; i++)
        {
            if (randomNumbers[i]==guessedNumbers[i]);
            {
                sameNumber++;
            }
        }
        
        
        //Winning Numbers
        System.out.println("These are the winning numbers!");
        for (int i = 0; i < randomNumbers.length; i++)
        {
            System.out.println("Lucky Number: " + randomNumbers[i]);
        }

        //Winnings Prompt
        System.out.println("You guessed " + sameNumber + " numbers correctly!");
        double totalGuesses = 6;
        double winnings = (jackPot / totalGuesses) * sameNumber;
        //System.out.println("You won $" + Math.Round(winnings, 2).ToString("#,##0.00") + "!");

        //Closing Statement
        System.out.println("Would you like to play Lucky Numbers again?");
        playAgain = consoleReadLine().nextLine();
        
        while(playAgain.equals("yes"));
        
		System.out.println("Thank you for playing!");
	}
}
