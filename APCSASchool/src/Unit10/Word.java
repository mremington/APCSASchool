package Unit10;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
   private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{

	}

	public Word(String wrd)
	{
		word = wrd;
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
		
		for(int i = 0; i< word.length(); i++){
			for(int c = 0; c<vowels.length(); c++){
				if(word.charAt(i) == vowels.charAt(c)){
					count++;
				}
			}
		}

		return count;
	}
	
	public int getLength()
	{
		return word.length();
	}

	public String toString()
	{
	   return word;
	}
}