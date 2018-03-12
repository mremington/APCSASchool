package Unit12;
//© A+ Computer Science
// www.apluscompsci.com

//interface example

public class Ship implements Locatable, Movable
{
	
	private int xPos, yPos;

	public Ship()
	{
		xPos=yPos=0;
	}

	public Ship(int x, int y)
	{
		xPos=x;
		yPos=y;
	}

	
	public int getX() {
		return xPos;
	}

	public void setX(int xPos) {
		this.xPos = xPos;
	}

	public int getY() {
		return yPos;
	}

	public void setY(int yPos) {
		this.yPos = yPos;
	}
	
	public void setPos( int x, int y){
		setX(x);
		setY(y);
		
	}
	

	public boolean equals(Object obj)
	{
	   Ship other = (Ship)obj;
	   if(xPos==other.xPos&&yPos==other.yPos)
	      return true;
	   return false;	
	}
	
	public String toString()
	{
		return " "+xPos+" "+yPos;
	}
}