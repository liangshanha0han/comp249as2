package comp249as2;

import java.util.*;

public class Dealer extends Player{
	
	//method print string text
	public void Print(String string){
		System.out.println(string);
	}
	
	//Dealer indicates the start and end of betting
	public void StartBet(){
		System.out.println("Dealer: Place your bets now.");
	}
	public void EndBet(){
		System.out.println("Dealer: No more bets.");
	}
	
	//method used to print the winning number
	public void PrintWinNumb(int WinningNumber){
		System.out.println("Dealer: The winning nummber is " + WinningNumber);
	}
	
	//prints out the winners, as well as their winnings
	public void PrintWins(){
		System.out.println(" place holder");
	}

}
