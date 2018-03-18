package Unit14;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File ("lab24e.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String word = file.next();
			FancyWord test = new FancyWord(word);
			out.println(test);
	   }
	}
}