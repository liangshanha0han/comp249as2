package comp249as2;

import java.util.*;



public class Driver {



	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		RouletteTable Table = new RouletteTable();
		Dealer YoungZ = new Dealer();

		int [] Game = new int [0];

		int cChoice;
		int iWinningNumber;
		int iRoundNumber = 1;
		boolean bContinue = false;

		//Choice of roulettes
		System.out.println("Please choose a Roulette table (1 or 2): ");
		System.out.println("1. American Roulette");
		System.out.println("2. European Roulette");

		cChoice = keyboard.nextInt();

		while (cChoice <1 || cChoice >2){
			System.out.println("Please enter a valid choice, either 1 or 2.");
			cChoice = keyboard.nextInt();
		}

		if (cChoice == 1){

			Game = Table.GenerateAmerican();		
		}
		else{
			Table.GenerateEuro();
			Game = Table.GenerateEuro();	
		}

		
		//Game!!!!!
		//minimum 10 rounds so first play 9 rounds, then 10th round will be executed as a "do while".

		for (int a = 0; a<9; a++){
			
			//indicate round number
			System.out.println("Round " + iRoundNumber + ":" + "\n");
			
			//first we have to print the table at the beginning of each round
			Table.PrintTable(Game);
			
			Table.GenerateNumber(Game);
			
			//player class choose number placeholder

			YoungZ.PrintWin(Table.getWinningNumber());
			
			//dealer class print winner placeholder
			
			//at the end add 1 to the total number of rounds
			iRoundNumber ++;
			
			System.out.println(""); //formatting
		}
		
		//10th round will be executed by the "do", and future rounds will or will not be executed depending on the choice of the dealer
		do {
			
			System.out.println("round " + iRoundNumber + ":" + "\n");
			Table.PrintTable(Game);
			
			Table.GenerateNumber(Game);
			
			//player class choose number placeholder
			

			YoungZ.PrintWin(Table.getWinningNumber());
			
			//dealer class print winner
			
			System.out.println("Continue the game?");
			
			
		} while (bContinue == true);





	}
}
