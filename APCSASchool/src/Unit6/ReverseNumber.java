package Unit6;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
   public ReverseNumber(int n){
	   setNumber(n);
   }
	
	
	//add a set method
   public void setNumber(int n){
	   number = n;
   }

   			
	public int getReverse()
	{
		int rev=0;
		
		int num = number;
		
		while(num > 0){
			//get the last digit
			rev = rev * 10 + num % 10;
			//1st time = rev = 4
			//2nd rev = 43
			//3rd rev = 432
			
			num = num/10;
			
		}
		return rev;
	}
		
		




	//add  a toString
	public String toString(){
		return number + " reversed is " + getReverse();
	}
	
	
}