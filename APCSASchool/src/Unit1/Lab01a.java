package Unit1;

import static java.lang.System.*;

public class Lab01a
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
	   StarsAndStripes stars = new StarsAndStripes();
      
      //call the methods needed to make the patterns on the word document
	   stars.printASmallBox();
	   stars.printTwoBlankLines();
	   stars.printABigBox();
   }
}