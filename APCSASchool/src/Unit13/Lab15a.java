package Unit13;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import static java.lang.System.*;

public class Lab15a
{
	public static void main(String args[])
	{
		WordSort test = new WordSort("abc ABC 12321 fred alexander");
		test.sort();
		System.out.println(test);

		test.setList("a zebra friendly acrobatics 435 TONER PRinTeR");
		test.sort();
		System.out.println(test);

		test.setList("b x 4 r s y $");
		test.sort();
		System.out.println(test);
		
		test.setList("123 ABC abc 034 dog cat sally sue bob 2a2");
		test.sort();
		System.out.println(test);		
	}
}