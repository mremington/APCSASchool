package Unit13;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*;

public class WordSort
{
	private String[] wordRay;

	public WordSort(String line)
	{
		wordRay = line.split(" ");
	}

	public void setList(String line)
	{
		wordRay = line.split(" ");
	}

	public void sort()
	{
		Arrays.sort(wordRay);
	}

	public String toString( )
	{
		String output="";
		for(int k=0; k<wordRay.length; k++)
		{
			output+="word " + k + " :: " + wordRay[k]+"\n";
		}
		return output+"\n\n";
	}
}