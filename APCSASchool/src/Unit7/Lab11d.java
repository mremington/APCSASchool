package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -
import static java.lang.System.*;

import java.util.Scanner;

public class Lab11d
{
   public static void main( String args[] )
   {
	   TriangleFour t4 = new TriangleFour();
	   Scanner keyboard = new Scanner(System.in);
	   	String choice="";
			do{
				out.print("Enter the size of the triangle : ");
				int big = keyboard.nextInt();
				out.print("Enter a letter : ");
				String value = keyboard.next();
				
				 t4.setTriangle(value, big);
				 
					//static methods can be called using the class name
				System.out.println(t4);

				System.out.print("Do you want to enter more data? ");
				choice=keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));



	}
}