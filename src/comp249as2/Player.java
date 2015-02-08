package comp249as2;

import java.util.*;

public class Player {
	
	Scanner myKeyboard = new Scanner (System.in);
	
	int[] bets = new int[5];
	int arraySize;
	
	public void setarraySize(int arraySize) {
		this.arraySize = arraySize;
	} 

	public void setBets()
	{
	for (int i = 0; i < bets.length;i++)
	{
		bets[i] = -1;
	}
	}
	
	public void showBets()
	{
		for (int i = 0; i < bets.length;i++){
			System.out.print(bets[i] + "\n");
		}
 
	}
	
	
	public void amountBets()
	{
		int a = 0;
		for (int i = 0; i < bets.length;i++)
		{
			if (bets[i] > -1)
				a++;
		}
		arraySize = a;
	}
	
	
	
	public void playerBets() 
	{
	int[] temp = new int [6];
		System.out.print("Input your bet(s)");
		temp[0] = myKeyboard.nextInt();
		temp[1] = myKeyboard.nextInt();
		temp[2] = myKeyboard.nextInt();
		temp[3] = myKeyboard.nextInt();
		temp[4] = myKeyboard.nextInt();
		int a = 0;
		for (int i = 0; i < temp.length;i++)
		{
			if (temp[i] > -1)
				a++;
		}
		arraySize = a;
		for (int b = 0; b <= arraySize; b++)
		{
			bets[b] = temp [b];
		}
		
	}
	
	
	
	
	
	}
	


