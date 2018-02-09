import java.util.Scanner;

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
        	
        	
        	
        }
        while(playAgain.equals("yes"));
        
		
	}

	private static Scanner consoleReadline() {
		// TODO Auto-generated method stub
		return null;
	}

}
