package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab10c
{
	public static void main(String args[])
	{
		//add test cases
		
		System.out.println("How compareTo works: a.compareTo(b) --> a comes before b so the result would be negative");
		System.out.println("a".compareTo("e")+ "\n\n");
		
		
		System.out.println("How compareTo works: A.compareTo(b) --> A comes before b so the result would be negative");
		System.out.println("A".compareTo("b")+ "\n\n");
		
		System.out.println("How compareTo works: b.compareTo(a) --> b comes after a so the result would be positive");
		System.out.println("b".compareTo("a")+ "\n\n");
		
		
		BiggestString bigString = new BiggestString();
		bigString.setStrings("abc" ,"cba" ,"bca");
		System.out.println(bigString);
		
		bigString.setStrings("one" ,"fourteen" ,"twenty");
		System.out.println(bigString);
		
		bigString.setStrings("124323" ,"20009" ,"3434");
		System.out.println(bigString);
		
		bigString.setStrings("abcde" ,"ABCDE" ,"1234234324");
		System.out.println(bigString);
		



	}
}