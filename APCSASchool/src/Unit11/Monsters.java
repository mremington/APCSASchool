package Unit11;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	//use an ArrayList for extra credit!!!
	//private ArrayList<Monster> myMonsters;

		private Monster[] myMonsters;

		public Monsters()
		{
			setMonsters(0);
		}

		public Monsters(int size)
		{
			setMonsters(size);
		}

		public void setMonsters(int size)
		{
			myMonsters = new Monster[size];		
		}	
		
		public void add(int spot, Monster m)
		{
			if(spot<myMonsters.length)
				myMonsters[spot]=m;
		}
		
		public Monster get(int spot)
		{
			return myMonsters[spot];
		}

		public Monster getLargest( )
		{
			Arrays.sort(myMonsters);
			return myMonsters[myMonsters.length-1];
		}

		public Monster getSmallest( )
		{
			Arrays.sort(myMonsters);
			return myMonsters[0];
		}

		public String toString()
		{
			return ""+Arrays.toString(myMonsters);
		}
}