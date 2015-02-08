package comp249as2;


import java.util.*;

public class RouletteTable {

	//hard code American roulette wheel
	public final int[] GenerateAmerican(){

		int[] AmericanR = new int[38];

		AmericanR [0] = 37;		AmericanR [1] = 27;		AmericanR [2] = 10;		AmericanR [3] = 25;		AmericanR [4] = 29;
		AmericanR [5] = 12;		AmericanR [6] = 8;		AmericanR [7] = 19;		AmericanR [8] = 31;		AmericanR [9] = 18;
		AmericanR [10] = 6;		AmericanR [11] = 21;	AmericanR [12] = 33;	AmericanR [13] = 16;	AmericanR [14] = 4;	
		AmericanR [15] = 23;	AmericanR [16] = 35;	AmericanR [17] = 14;	AmericanR [18] = 2;		AmericanR [19] = 0;	
		AmericanR [20] = 28;	AmericanR [2] = 9;		AmericanR [22] = 26;	AmericanR [23] = 30;	AmericanR [24] = 11;	
		AmericanR [25] = 7;		AmericanR [26] = 20;	AmericanR [27] = 32;	AmericanR [28] = 17;	AmericanR [29] = 5;	
		AmericanR [30] = 22;	AmericanR [31] = 34;	AmericanR [32] = 15;	AmericanR [33] = 3;		AmericanR [34] = 24;	
		AmericanR [35] = 36;	AmericanR [36] = 13;	AmericanR [37] = 1;	
		
		return AmericanR;
	}

	//hard code European roulette wheel
	public final int[] GenerateEuro(){
		int EuroR [] = new int [37];

		EuroR [0] = 0;		EuroR [1] = 32;		EuroR [2] = 15;		EuroR [3] = 19;		EuroR [4] = 4;
		EuroR [5] = 21;		EuroR [6] = 2;		EuroR [7] = 25;		EuroR [8] = 17;		EuroR [9] = 34;
		EuroR [10] = 6;		EuroR [11] = 27;	EuroR [12] = 13;	EuroR [13] = 36;	EuroR [14] = 11;	
		EuroR [15] = 30;	EuroR [16] = 8;		EuroR [17] = 23;	EuroR [18] = 10;	EuroR [19] = 5;	
		EuroR [20] = 24;	EuroR [2] = 16;		EuroR [22] = 33;	EuroR [23] = 1;		EuroR [24] = 20;	
		EuroR [25] = 14;	EuroR [26] = 31;	EuroR [27] = 9;		EuroR [28] = 22;	EuroR [29] = 18;	
		EuroR [30] = 29;	EuroR [31] = 7;		EuroR [32] = 28;	EuroR [33] = 12;	EuroR [34] = 35;	
		EuroR [35] = 3;		EuroR [36] = 26;
		
		return EuroR;
	}



	//we shall use java.util.random
	Random Randomize = new Random();
	int iWinningNumber;

	//choose a random number for table
	public void GenerateNumber(int [] ChosenTable){
		iWinningNumber = Randomize.nextInt(ChosenTable.length);

	}
	
	public int getWinningNumber(){
		return iWinningNumber;
	}

	
	//print the chosen table
	public void PrintTable (int [] ChosenTable){
		System.out.println("Wheel: ");
		
		for (int i=0; i<ChosenTable.length-1; i++){
			System.out.print(ChosenTable[i] + ", ");
		}
		System.out.println(ChosenTable[ChosenTable.length-1] + ".");
	}

}



