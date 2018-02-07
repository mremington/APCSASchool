package Unit4;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringRipper
{
	private String word;
	
	public StringRipper()
	{
		word = "Ravens";
		setString("Ravens");
	}

	public StringRipper(String s)
	{
		setString(s);
	}
	
   public void setString(String s)
   {
		word = s;
   }	

	public String ripString(int x, int y)
	{
		String output = word.substring(x, y);
		
		return output;
	}

 	public String toString()
 	{
 		return "\n\n"+word;
	}
}