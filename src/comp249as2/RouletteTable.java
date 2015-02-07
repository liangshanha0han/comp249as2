package comp249as2;

import java.util.*;

public class RouletteTable {

	Random Randomize = new Random();

	int number;
	
	int snumber = Randomize.nextInt(10);


	public double SpinEuro(){


			number = Randomize.nextInt();


		System.out.println(number);


		return number;
	}


}
