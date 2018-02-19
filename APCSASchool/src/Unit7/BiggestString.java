package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		setStrings(a,b,c);
	}

	public void setStrings(String a, String b, String c)
	{
		one = a;
		two = b;
		three = c;
	}

	public String getBiggest()
	{
		String bigS = one;
		if(bigS.compareTo(two)<0)
			bigS = two;
		if(bigS.compareTo(three)<0)
			bigS = three;
		return bigS;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + "\nBiggest = " + getBiggest() + "\n\n";
	}
}