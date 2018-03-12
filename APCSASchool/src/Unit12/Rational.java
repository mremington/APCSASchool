package Unit12;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class Rational implements Comparable<Rational>
{
	private int numerator;
	private int denominator;

	public Rational()
	{
		setRational(1,1);
	}

	public Rational(int numerator, int denominator)
	{
		setRational(numerator, denominator);
	}

	public void setRational(int numerator, int denominator)
	{
		setNumerator(numerator);
		setDenominator(denominator);	
	}

	//modifiers
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
	
	public void add( Rational  rhs)
	{
		//num1/den1 + num2/den2 = (num1 * den2 + num2 * den1) / (den1 * den2)
		setNumerator(getNumerator()*rhs.getDenominator()+rhs.getNumerator()*getDenominator());
		setDenominator(getDenominator()*rhs.getDenominator());
		reduce();
	}

	private void reduce()
	{
		int gcd = gcd(getNumerator(),getDenominator());
		setNumerator(getNumerator()/gcd);
		setDenominator(getDenominator()/gcd);
	}

	private int gcd(int numOne, int numTwo)
	{
		int min = Math.min(numOne,numTwo);
		for(int x = min; x>1; x--){
			if(numOne%x==0 && numTwo%x==0)
				return x;
		}
		return 1;
	}

	public Object clone ()
	{
		Rational r = new Rational(getNumerator(),getDenominator());
		return r;
	}


	//ACCESSORS
	public boolean equals( Object other)
	{
		Rational rhs = (Rational)other;
		double one = (double)getNumerator()/getDenominator();
		double two = (double)rhs.getNumerator()/rhs.getDenominator();
		if(one==two)
			return true;
		return false;
	}

	public int compareTo( Rational rhs)
	{
		double top = (double)getNumerator()/getDenominator();
		double bottom = (double)rhs.getNumerator()/rhs.getDenominator();
		if(top==bottom)
			return 0;
		if(top>bottom)
			return 1;
		return -1;
	}


	public int getNumerator()
	{
		return numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public String toString()
	{
		return getNumerator() + "/" + getDenominator();
	}
	
	
}