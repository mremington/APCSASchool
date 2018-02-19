package Unit7;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck()
	{
		//set password
		password = "ravens";

	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);

		do{
			System.out.println("Enter your password");
			if(!keyboard.next().equals(password))
				System.out.println("InValid, try again");
		}while(!keyboard.next().equals(password));
		
		System.out.println("Valid");

	}
}