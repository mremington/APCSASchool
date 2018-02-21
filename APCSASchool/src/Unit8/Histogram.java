package Unit8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Histogram
{
	private int[] numCount;

	//constructor 
	public Histogram(String line)
	{
		setList(line);
	}

	//set method
	public void setList(String line)
	{
		numCount = new int[10];
		Scanner chopper = new Scanner (line);
		while (chopper.hasNextInt())
		{
			int num = chopper.nextInt();
			numCount[num]++;
		}
	}

	//toString method
	public String toString()
	{
		String output="";
		for (int i = 0; i<10; i++)
		{
			output+=i+" - " + numCount[i]+"\n";
		}
		return output;
	}
}