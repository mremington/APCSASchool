package Unit8;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	//instance variable
	private int[] array;
	
	//constructor
	public ArrayStats(String list)
	{
		setArray(list);	
	}
	
	//set method
	public void setArray(String list)
	{
		if(list.length()%2==0)
		   array=new int[list.length()/2];
		else
		   array=new int[list.length()/2+1]; 
		int spot=0;
		Scanner chopper = new Scanner(list);
		while(chopper.hasNextInt())
		{
			array[spot]=chopper.nextInt();
			spot++;
		}		
	}	
	
	
	public int getNumGroupsOfSize(int size)
	{
		int cnt=0;
		int count=0;	
		int curr=array[0];
		for(int i=0; i<array.length;i++)
		{
			if(array[i]==curr)
			   count++;
			else if(count>=size)
			{
			   cnt++;
			   count=1;
			   curr=array[i];
			 }
			 else if(array[i]!=curr&&count<size)
			 {
			 	curr=array[i];
			 	count=1;
			 }
		}
		if(count>=size)
		   cnt++;
		return cnt;
	}
	
	public String toString()
	{
		return ""+Arrays.toString(array);
	}
}