package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double bigD = one;
		
		if(bigD<two)
			bigD = two;
		if(bigD<three)
			bigD = three;
		if(bigD<four)
			bigD = four;
		
		return bigD;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four;
	}
}