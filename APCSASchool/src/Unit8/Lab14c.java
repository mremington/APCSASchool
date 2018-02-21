package Unit8;

import java.util.Arrays;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab14c
{
	public static void main( String args[] )
	{
		System.out.println("Odds - " + Arrays.toString(OddsAndEvens.getAllOdds(new int[]{2,4,6,8,10,12,14})));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(new int[]{2,4,6,8,10,12,14})));
	
		System.out.println("\nOdds - " + Arrays.toString(OddsAndEvens.getAllOdds(new int[]{1,2,3,4,5,6,7,8,9})));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(new int[]{1,2,3,4,5,6,7,8,9})));
		
		System.out.println("\nOdds - " + Arrays.toString(OddsAndEvens.getAllOdds(new int[]{2,10,20,21,23,24,40,55,60,61})));
		System.out.println("Evens - " + Arrays.toString(OddsAndEvens.getAllEvens(new int[]{2,10,20,21,23,24,40,55,60,61})));			
	}
}