package Unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{
		mat=new int[0][0];
	}

	public PascalsTriangle(int size)
	{
		mat=new int[size][size];
	}

	public void createTriangle()
	{
		for (int r=0; r<mat.length; r++)
		{
			for (int c=0; c<=r; c++)
			{
				if (c==0 || r==0){
					mat[r][c]=1;
				}
				else
					mat[r][c] = mat[r-1][c]+mat[r-1][c-1];
			}
		}
	}

	public String toString()
	{
		String output="";
		for(int r=0; r<mat.length; r++)
		{
			for(int c=0; c<=r; c++)
			{
				output+=mat[r][c]+"\t";
			}
			output+="\n";
		}
		return output;
	}
}