package Lab16d;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib() 
	{
		
	}

	public MadLib(String fileName)
	{
		//load stuff
		verbs = new ArrayList();
		loadVerbs();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
		

		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
		
		
		
		
		
		}
		catch(Exception e)
		{
		}	
		
	}
	

	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File(System.getProperty("user.dir")+"\\src\\Lab16d\\verbs.dat"));
			while(file.hasNextLine()){
				verbs.add(file.nextLine());
			}
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		
	
			
			System.out.println(verbs.get(0));
			System.out.println(verbs.get(5));
	
	
	
	}

	public void loadAdjectives()
	{
		try{
	
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
	
		
		return "";
	}
	
	public String getRandomNoun()
	{
		
		return "";
	}
	
	public String getRandomAdjective()
	{
		
		return "";
	}		

	public String toString()
	{
		
	   return "\n\n\n";
	}
}