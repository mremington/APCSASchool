package Unit10;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words()
	{
		setWords("");
	}

	public Words(String wordList)
	{
		setWords(wordList);
	}

	public void setWords(String wordList)
	{
		Scanner chopper = new Scanner(wordList);
		words = new ArrayList<Word>();
		while(chopper.hasNext())
		{
			words.add(new Word(chopper.next()));
		}
	}
	
	public int countWordsWithXChars(int size)
	{
		int count=0;
		for(Word s : words)
		{
			if(s.getLength()==size)
			  count++;
		}
		return count;
	}
	
	public int removeWordsWithXChars(int size)
	{
		int i=0;
		int sum = 0;
		while(i<words.size())
		{
			if(words.get(i).getLength()==size){
				sum = sum + words.get(i).getNumVowels();
			   words.remove(i);
			}
			else
			   i++;
		}
		return sum;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
		for(Word s : words)
		{
			if(s.getNumVowels()==numVowels)
			   count++;
		}		
		return count;
	}
	
	public String toString()
	{
	   return "" + words;
	}
}