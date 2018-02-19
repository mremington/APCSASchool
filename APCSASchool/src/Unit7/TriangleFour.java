package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleFour
{
   private int size;
   private String letter;

	public TriangleFour()
	{
	}

	public TriangleFour(int count, String let)
	{
		setTriangle(let, count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		String output = "";
		
		//control the number of rows/size printed
		for(int r = 0; r < size; r++){
			//print number of spaces per row
			for(int sp = 0; sp < r; sp++){
				output += " ";
			}
			
			//print number of letters per row
			for(int c = size; c > r; c--){
				output += letter;
			}
			
			
			output += "\n";
		}
			
		
		return output;
	}

	public String toString()
	{
		String output= getLetter();
		return output+"\n";
	}
}