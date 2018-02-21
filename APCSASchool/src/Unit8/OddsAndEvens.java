package Unit8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class OddsAndEvens
{
	private static int countEm(int[] array, boolean odd)
	{
		int count = 0;
		for(int num : array)
		{
			if(odd)
				if(num%2!=0)
					count++;
			if(!odd)
				if(num%2==0)
					count++;
		}
		return count;
	}
	
	public static int[] getAllEvens(int[] array)
	{
		int[] retArray = new int[countEm(array, false)];
		int spot = 0;
		for(int num : array)
		{
			if(num%2==0)
				retArray[spot++]=num;
		}
		return retArray;
	}

	public static int[] getAllOdds(int[] array)
	{
		int[] retArray = new int[countEm(array, true)];
		int spot = 0;
		for(int num : array)
		{
			if(num%2!=0)
				retArray[spot++]=num;
		}
		return retArray;		
	}
}