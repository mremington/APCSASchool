package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String createTriangle( String let, int size)
	{
		String output="";
		//outer loop to control size or rows to print
		for(int r = 0; r < size; r++)
		{
			//print one letter per row based on the number of rows
			for(int c = 0; c <= r; c++)
				output += let;
			output += "\n";
		}
		return output;
	}
}