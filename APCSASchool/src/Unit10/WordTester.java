package Unit10;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordTester
{
	public static void main(String[] args)
	{
		//add test cases
		
		Word w = new Word("chicken");
		System.out.println(w);
		System.out.println("num vowels == "+w.getNumVowels());
		System.out.println("num chars == "+w.getLength());
		
		System.out.println("\n");
		
		//add more test cases
		w.setWord("alligator");
		System.out.println(w);
		System.out.println("num vowels == "+w.getNumVowels());
		System.out.println("num chars == "+w.getLength());
		
		System.out.println("\n");
		
		w.setWord("elephant");
		System.out.println(w);
		System.out.println("num vowels == "+w.getNumVowels());
		System.out.println("num chars == "+w.getLength());
		
		
		
		
	}
}