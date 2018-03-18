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

public class Lab24c
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("lab24c.dat"));
		int times = file.nextInt();
		for (int i=0; i<times; i++)
		{
	      int size = file.nextInt();
			PascalsTriangle test = new PascalsTriangle(size);
	   	test.createTriangle();
	   	out.println(test);
	   }
	}

}



