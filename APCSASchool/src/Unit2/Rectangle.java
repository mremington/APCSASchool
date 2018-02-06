package Unit2;

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid )
	{
		length=len;
		width=wid;
	}

	public void calculatePerimeter( )
	{
		perimeter = length*2 + width*2;
	}

	public void print( )
	{
		System.out.println("The Perimeter is :: " + perimeter);
	}
}