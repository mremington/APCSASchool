package Unit11;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
	}

	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		myHeight = ht;
	}

	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		myHeight = ht;
		myWeight = wt;
	}

	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		myHeight = ht;
		myWeight = wt;
		myAge = age;
	}

	public int getMyWeight() {
		return myWeight;
	}

	public void setMyWeight(int myWeight) {
		this.myWeight = myWeight;
	}

	public int getMyHeight() {
		return myHeight;
	}

	public void setMyHeight(int myHeight) {
		this.myHeight = myHeight;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster();
	}

	public boolean equals( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(this.getMyWeight()==rhs.getMyWeight()){
			return true;		
		}

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		
		return this.getMyWeight()-rhs.getMyWeight();

	}

	//write a toString() method
	public String toString(){
		return getMyHeight()+" "+getMyWeight()+" "+getMyAge();
	}
	
	
}