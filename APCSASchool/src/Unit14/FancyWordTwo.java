package Unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwo
{
	private char[][] mat;

	public FancyWordTwo()
	{
		mat=new char[0][0];
	}

   public FancyWordTwo(String s)
	{
		int end = s.length();
		mat = new char[end][end];
		for(int i=0; i<end; i++)
		{
			mat[0][i]=s.charAt(i);
			mat[end-1][i]=s.charAt(end-i-1);
			mat[i][0]=s.charAt(0+i);
			mat[i][end-1]=s.charAt(end-i-1);
		}
	}

	public String toString()
	{
		String output="";
		for (int r=0; r<mat.length; r++)
		{
			for (int c=0; c<mat[r].length; c++)
			{
				output+=mat[r][c];
			}
			output+="\n";
		}
		return output+"\n\n";
	}
}